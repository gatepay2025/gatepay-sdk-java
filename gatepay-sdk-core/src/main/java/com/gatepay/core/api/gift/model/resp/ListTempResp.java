package com.gatepay.core.api.gift.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;


public class ListTempResp extends BaseResponse<ListTempResp[]> {

    @JsonProperty("card_temp_id")
    private String cardTempId;

    @JsonProperty("image_url")
    private String imageUrl;

    @JsonProperty("title_en")
    private String titleEn;

    @JsonProperty("title_cn")
    private String titleCn;

    @JsonProperty("cover_type")
    private String coverType;


    public String getCardTempId() {
        return cardTempId;
    }

    public void setCardTempId(String cardTempId) {
        this.cardTempId = cardTempId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    public String getTitleCn() {
        return titleCn;
    }

    public void setTitleCn(String titleCn) {
        this.titleCn = titleCn;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

}
