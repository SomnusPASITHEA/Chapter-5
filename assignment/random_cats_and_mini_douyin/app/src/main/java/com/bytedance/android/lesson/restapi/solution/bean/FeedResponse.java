package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:17
 */
public class FeedResponse {

    // TODO-C2 (2) Implement your FeedResponse Bean here according to the response json
    @SerializedName("success") private Boolean success;
    @SerializedName("feeds") private List<Feed> feeds;
    public Boolean getSuccess(){
        return success;
    }
    public List<Feed> getFeeds(){
        return feeds;
    }
}
