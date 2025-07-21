package com.gatepay.api.gift.model.response;

import com.gatepay.common.BaseResponse;


public class ListTempResp extends BaseResponse<ListTempResp[]> {

    private String card_temp_id;
    private String image_url;
    private String title_en;
    private String title_cn;
    private String cover_type;

    public String getCard_temp_id() {
        return card_temp_id;
    }

    public void setCard_temp_id(String card_temp_id) {
        this.card_temp_id = card_temp_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getTitle_en() {
        return title_en;
    }

    public void setTitle_en(String title_en) {
        this.title_en = title_en;
    }

    public String getTitle_cn() {
        return title_cn;
    }

    public void setTitle_cn(String title_cn) {
        this.title_cn = title_cn;
    }

    public String getCover_type() {
        return cover_type;
    }

    public void setCover_type(String cover_type) {
        this.cover_type = cover_type;
    }

}
