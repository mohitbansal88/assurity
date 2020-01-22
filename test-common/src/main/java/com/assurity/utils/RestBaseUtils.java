package com.assurity.utils;

import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpHeaders;
import com.assurity.config.TestConstants;

import static io.restassured.RestAssured.given;

public abstract class RestBaseUtils {

  /**
   * Get RestAssured RequestSpecification
   * 
   * @return
   */
  public static RequestSpecification getRequestSpecification() {
    return given().header(HttpHeaders.CONTENT_TYPE, TestConstants.CONTENT_TYPE);
  }

}
