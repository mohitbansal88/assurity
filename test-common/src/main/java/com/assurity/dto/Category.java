package com.assurity.dto;

import java.util.List;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class Category {
  private Long CategoryId;
  private String Name;
  private String Path;
  private Boolean CanListAuctions;
  private Boolean CanListClassifieds;
  private Boolean CanRelist;
  private String LegalNotice;
  private Long DefaultDuration;
  private List<Long> AllowedDurations;
  private Fee Fees;
  private Long FreePhotoCount;
  private Long MaximumPhotoCount;
  private Boolean IsFreeToRelist;
  private List<Promotion> Promotions;
  private List<EmbeddedContentOption> EmbeddedContentOptions;
  private Long MaximumTitleLength;
  private Long AreaOfBusiness;
  private Long DefaultRelistDuration;

  public Long getCategoryId() {
    return CategoryId;
  }

  public void setCategoryId(Long categoryId) {
    CategoryId = categoryId;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public String getPath() {
    return Path;
  }

  public void setPath(String path) {
    Path = path;
  }

  public Boolean getCanListAuctions() {
    return CanListAuctions;
  }

  public void setCanListAuctions(Boolean canListAuctions) {
    CanListAuctions = canListAuctions;
  }

  public Boolean getCanListClassifieds() {
    return CanListClassifieds;
  }

  public void setCanListClassifieds(Boolean canListClassifieds) {
    CanListClassifieds = canListClassifieds;
  }

  public Boolean getCanRelist() {
    return CanRelist;
  }

  public void setCanRelist(Boolean canRelist) {
    CanRelist = canRelist;
  }

  public String getLegalNotice() {
    return LegalNotice;
  }

  public void setLegalNotice(String legalNotice) {
    LegalNotice = legalNotice;
  }

  public Long getDefaultDuration() {
    return DefaultDuration;
  }

  public void setDefaultDuration(Long defaultDuration) {
    DefaultDuration = defaultDuration;
  }

  public List<Long> getAllowedDurations() {
    return AllowedDurations;
  }

  public void setAllowedDurations(List<Long> allowedDurations) {
    AllowedDurations = allowedDurations;
  }

  public Fee getFees() {
    return Fees;
  }

  public void setFees(Fee fees) {
    Fees = fees;
  }

  public Long getFreePhotoCount() {
    return FreePhotoCount;
  }

  public void setFreePhotoCount(Long freePhotoCount) {
    FreePhotoCount = freePhotoCount;
  }

  public Long getMaximumPhotoCount() {
    return MaximumPhotoCount;
  }

  public void setMaximumPhotoCount(Long maximumPhotoCount) {
    MaximumPhotoCount = maximumPhotoCount;
  }

  public Boolean getIsFreeToRelist() {
    return IsFreeToRelist;
  }

  public void setIsFreeToRelist(Boolean isFreeToRelist) {
    IsFreeToRelist = isFreeToRelist;
  }

  public List<Promotion> getPromotions() {
    return Promotions;
  }

  public void setPromotions(List<Promotion> promotions) {
    Promotions = promotions;
  }

  public List<EmbeddedContentOption> getEmbeddedContentOptions() {
    return EmbeddedContentOptions;
  }

  public void setEmbeddedContentOptions(List<EmbeddedContentOption> embeddedContentOptions) {
    EmbeddedContentOptions = embeddedContentOptions;
  }

  public Long getMaximumTitleLength() {
    return MaximumTitleLength;
  }

  public void setMaximumTitleLength(Long maximumTitleLength) {
    MaximumTitleLength = maximumTitleLength;
  }

  public Long getAreaOfBusiness() {
    return AreaOfBusiness;
  }

  public void setAreaOfBusiness(Long areaOfBusiness) {
    AreaOfBusiness = areaOfBusiness;
  }

  public Long getDefaultRelistDuration() {
    return DefaultRelistDuration;
  }

  public void setDefaultRelistDuration(Long defaultRelistDuration) {
    DefaultRelistDuration = defaultRelistDuration;
  }

  @Override
  public String toString() {
    return "Category [CategoryId=" + CategoryId + ", Name=" + Name + ", Path=" + Path + ", CanListAuctions="
        + CanListAuctions + ", CanListClassifieds=" + CanListClassifieds + ", CanRelist=" + CanRelist + ", LegalNotice="
        + LegalNotice + ", DefaultDuration=" + DefaultDuration + ", AllowedDurations=" + AllowedDurations + ", Fees="
        + Fees + ", FreePhotoCount=" + FreePhotoCount + ", MaximumPhotoCount=" + MaximumPhotoCount + ", IsFreeToRelist="
        + IsFreeToRelist + ", Promotions=" + Promotions + ", EmbeddedContentOptions=" + EmbeddedContentOptions
        + ", MaximumTitleLength=" + MaximumTitleLength + ", AreaOfBusiness=" + AreaOfBusiness
        + ", DefaultRelistDuration=" + DefaultRelistDuration + "]";
  }

}
