package com.assurity.dto;

import java.util.List;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class Fee {
  private Double Bundle;
  private Double EndDate;
  private Double Feature;
  private Double Gallery;
  private Double Listing;
  private Double Reserve;
  private Double Subtitle;
  private Double TenDays;
  private List<ListingFeeTier> ListingFeeTiers;
  private Double SecondCategory;

  public Double getBundle() {
    return Bundle;
  }

  public void setBundle(Double bundle) {
    Bundle = bundle;
  }

  public Double getEndDate() {
    return EndDate;
  }

  public void setEndDate(Double endDate) {
    EndDate = endDate;
  }

  public Double getFeature() {
    return Feature;
  }

  public void setFeature(Double feature) {
    Feature = feature;
  }

  public Double getGallery() {
    return Gallery;
  }

  public void setGallery(Double gallery) {
    Gallery = gallery;
  }

  public Double getListing() {
    return Listing;
  }

  public void setListing(Double listing) {
    Listing = listing;
  }

  public Double getReserve() {
    return Reserve;
  }

  public void setReserve(Double reserve) {
    Reserve = reserve;
  }

  public Double getSubtitle() {
    return Subtitle;
  }

  public void setSubtitle(Double subtitle) {
    Subtitle = subtitle;
  }

  public Double getTenDays() {
    return TenDays;
  }

  public void setTenDays(Double tenDays) {
    TenDays = tenDays;
  }

  public List<ListingFeeTier> getListingFeeTiers() {
    return ListingFeeTiers;
  }

  public void setListingFeeTiers(List<ListingFeeTier> listingFeeTiers) {
    ListingFeeTiers = listingFeeTiers;
  }

  public Double getSecondCategory() {
    return SecondCategory;
  }

  public void setSecondCategory(Double secondCategory) {
    SecondCategory = secondCategory;
  }

  @Override
  public String toString() {
    return "Fee [Bundle=" + Bundle + ", EndDate=" + EndDate + ", Feature=" + Feature + ", Gallery=" + Gallery
        + ", Listing=" + Listing + ", Reserve=" + Reserve + ", Subtitle=" + Subtitle + ", TenDays=" + TenDays
        + ", ListingFeeTiers=" + ListingFeeTiers + ", SecondCategory=" + SecondCategory + "]";
  }

}
