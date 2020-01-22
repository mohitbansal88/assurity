package com.assurity.category.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.assurity.config.ServletTestBase;
import com.assurity.dto.Category;
import com.assurity.dto.Promotion;
import com.assurity.utils.CategoriesUtil;

/**
 * Test category acceptance criteria.
 */
public class CategoryTest extends ServletTestBase {
  private static final Logger LOG = LoggerFactory.getLogger(CategoryTest.class);

  @BeforeClass
  public void setup() {

  }

  @Test
  public void testCategory() throws Exception {
    Category category = CategoriesUtil.getCategory("v1", 6327, false);

    Assert.assertEquals(category.getName(), "Carbon credits");
    Assert.assertTrue(category.getCanRelist().booleanValue());
    Assert.assertTrue(isPromotionDetailsPresents(category, "Gallery", "2x larger image"));
    
    LOG.info("Acceptance criteria test passed");
  }

  public boolean isPromotionDetailsPresents(Category category, String promotionName, String promotionDescription) {
    for (Promotion promotion : category.getPromotions()) {
      if (promotion.getName().equals(promotionName) && promotion.getDescription().contains(promotionDescription)) {
        return true;
      }
    }
    return false;
  }
  
}
