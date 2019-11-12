package helpers;

import org.springframework.util.Assert;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MainHelpers {
    public static final String KEY_URL = "gothelist.url";
    public static final String PROTOCOL = "https";

    private static Properties configProperties;
    private static String fileName;
    private static String platform;
    public static String browser;
    public static Boolean isMobile;

    private static final String CONFIG_FILE_PATH = "/src/test/resources/";
    private static final String CONFIG_FILE_EXTENTION = ".properties";
    public static final String DEFAULT_CONFIG_FILE = "qa";

    public static final String chromeBr = "chrome";
    public static final String safariBr = "safari";
    public static List<String> browsers = new ArrayList<String>() {{
        add(chromeBr);
        add(safariBr);
    }};
    public static final String mobileDv = "mobile";
    public static final String DRIVER_LOCATION = "src/main/resources/";
    public static final String DEFAULT_BROWSER = safariBr;//chromeBr;//safariBr;//chromeBr;
    public static final String GC_SYS_PROPERTY = "webdriver.chrome.driver";
    private static final String DRIVER_WIN_EXT = ".exe";
    private static final String CHROME_DIRVER = "chromedriver";

    public static void InitialSetUp() throws Exception {
        //Get details
        fileName = System.getProperty("configFile");
        if (fileName == null) {
            fileName = DEFAULT_CONFIG_FILE;
        }
        //Get Platform
        platform = System.getProperty("os.name");
        //Get Browser
        browser = System.getProperty("browser");
        if (browser == null || !(browsers.contains(browser.toLowerCase()))) {
            browser = DEFAULT_BROWSER;
        } else {
            browser = browser.toLowerCase();
        }
        isMobile = false;
        String mobile = System.getProperty("mobile");
        if (mobile != null ){
            isMobile = true;
        }
        configProperties = loadProperties(fileName);
        setCorrectDriverInfo(browser);
    }

    public static void setCorrectDriverInfo(String browser) {
        String brPath = DRIVER_LOCATION;
        if (browser.equals(chromeBr)) {
            brPath += CHROME_DIRVER;
            if (platform.contains("Windows")) {
                brPath += DRIVER_WIN_EXT;
            }
            System.setProperty(GC_SYS_PROPERTY, brPath);
        }
//        else if (browser.equals(ffBr)) {
//            brPath += FF_DRIVER;
//            if (platform.contains("Windows")) {
//                brPath += DRIVER_WIN_EXT;
//            }
//            System.setProperty(FF_SYS_PROPERTY, brPath);
//        }
    }

    public static Properties loadProperties(String fileName) {
        Properties prop = new Properties();
        InputStream input = null;
        String fullPath = Paths.get(".").toAbsolutePath().normalize().toString()
                + CONFIG_FILE_PATH + fileName + CONFIG_FILE_EXTENTION;

        try {
            input = new FileInputStream(fullPath);
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.isTrue(false,"Please specify correct Configuration File");
        }
        return prop;
    }

    private static void checkProperty(String property) {
        String errorText = " entry is missing from property file";
        if (property == null) {
            Assert.isTrue(false,KEY_URL + errorText);
        }
    }

    public static String getURL() {
        checkProperty(configProperties.getProperty(KEY_URL));
        return configProperties.getProperty(KEY_URL);
    }
}
