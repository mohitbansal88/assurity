package com.assurity.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class Promotion {
  private Long Id;
  private String Name;
  private String Description;
  private Double Price;
  private Double OriginalPrice;
  private Boolean Recommended;
  private Long MinimumPhotoCount;

  public Long getId() {
    return Id;
  }

  public void setId(Long id) {
    Id = id;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public String getDescription() {
    return Description;
  }

  public void setDescription(String description) {
    Description = description;
  }

  public Double getPrice() {
    return Price;
  }

  public void setPrice(Double price) {
    Price = price;
  }

  public Double getOriginalPrice() {
    return OriginalPrice;
  }

  public void setOriginalPrice(Double originalPrice) {
    OriginalPrice = originalPrice;
  }

  public Boolean getRecommended() {
    return Recommended;
  }

  public void setRecommended(Boolean recommended) {
    Recommended = recommended;
  }

  public Long getMinimumPhotoCount() {
    return MinimumPhotoCount;
  }

  public void setMinimumPhotoCount(Long minimumPhotoCount) {
    MinimumPhotoCount = minimumPhotoCount;
  }

  @Override
  public String toString() {
    return "Promotion [Id=" + Id + ", Name=" + Name + ", Description=" + Description + ", Price=" + Price
        + ", OriginalPrice=" + OriginalPrice + ", Recommended=" + Recommended + ", MinimumPhotoCount="
        + MinimumPhotoCount + "]";
  }

}
