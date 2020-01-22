package com.assurity.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class ListingFeeTier {
  private Long MinimumTierPrice;
  private Double FixedFee;

  public Long getMinimumTierPrice() {
    return MinimumTierPrice;
  }

  public void setMinimumTierPrice(Long minimumTierPrice) {
    MinimumTierPrice = minimumTierPrice;
  }

  public Double getFixedFee() {
    return FixedFee;
  }

  public void setFixedFee(Double fixedFee) {
    FixedFee = fixedFee;
  }

  @Override
  public String toString() {
    return "ListingFeeTier [MinimumTierPrice=" + MinimumTierPrice + ", FixedFee=" + FixedFee + "]";
  }

}
