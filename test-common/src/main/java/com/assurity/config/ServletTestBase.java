package com.assurity.config;

import io.restassured.RestAssured;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class ServletTestBase {
  private static final Logger LOG = LoggerFactory.getLogger(ServletTestBase.class);
  private static final String TS_TEST_ENV = System.getProperty("TS_TEST_ENV");
  private static Properties prop = new Properties();

  private static void loadPropertiesFile(String propertyFileName) {
    try {
      InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(propertyFileName);
      // load a properties file
      prop.load(input);
    } catch(IOException ex) {
      ex.printStackTrace();
    }
  }

  @BeforeClass
  public static void setUp() {
    LOG.info("TS_TEST_ENV: " + TS_TEST_ENV);
    String properties = StringUtils.isEmpty(TS_TEST_ENV) ? "local" : TS_TEST_ENV;
    loadProperties(properties);
  }

  public static void loadProperties(String tsenv) {
    if (StringUtils.isBlank(tsenv)) {
      RestAssured.reset();
      loadPropertiesFile("local.properties");
      return;
    }
    if(tsenv.contains("stage")) {
      loadPropertiesFile("stage.properties");
    } else if(tsenv.contains("qa")) {
      loadPropertiesFile("qa.properties");
    } else if(tsenv.contains("prod")) {
      loadPropertiesFile("prod.properties");
    } else if(tsenv.contains("dev")) {
      loadPropertiesFile("dev.properties");
    } else {
      RestAssured.reset();
      loadPropertiesFile("local.properties");
    }
  }

  public static String getProperty(String key) {
    return prop.getProperty(key);
  }

  public static String getConfigEnvironment() {
    return TS_TEST_ENV;
  }

  @AfterClass
  public static void tearDown() {
    
  }
  
}
