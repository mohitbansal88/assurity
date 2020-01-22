package com.assurity.utils;

import org.apache.http.HttpStatus;
import org.testng.Assert;
import com.assurity.assertions.AssertionMessages;
import com.assurity.config.TestConstants;
import com.assurity.dto.Category;
import io.restassured.response.Response;

public class CategoriesUtil {
  private static final String CATEGORY_PATH = "/Categories/";
  private static final String DETAILS = "/Details.json?";
  private static final String CATALOGUE = "catalogue=";

  public static Category getCategory(String version, long categoryId, boolean catalogue) {
    Category category = null;
    String path = TestConstants.PROTOCOL + TestConstants.HOSTNAME + version + CATEGORY_PATH + categoryId + DETAILS
        + CATALOGUE + catalogue;
    Response response = RestBaseUtils.getRequestSpecification().get(path);

    Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK, AssertionMessages.INCORRECT_STATUS_CODE);
    String responseContent = response.asString();
    category = JsonUtils.getDto(responseContent, Category.class);

    return category;
  }

}
