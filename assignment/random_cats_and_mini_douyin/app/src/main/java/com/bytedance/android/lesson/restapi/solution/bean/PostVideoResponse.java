package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import okhttp3.MultipartBody;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {

    // TODO-C2 (3) Implement your PostVideoResponse Bean here according to the response json
//    @SerializedName("student_id") private String studentId;
//    @SerializedName("username") private String username;
//    MultipartBody.Part image;
//    MultipartBody.Part video;
//    public void setStudentId(String student_id){
//        studentId = student_id;
//    }
//    public void setUsername(String user_name){
//        username = user_name;
//    }
//    public void setImage(MultipartBody.Part Image){
//        image = Image;
//    }
//    public void setVideo(MultipartBody.Part Video){
//        video = Video;
//    }
    @SerializedName("success") private Boolean success;
    @SerializedName("feeds") private Item feeds;
    public Boolean getSuccess(){
        return success;
    }
    public Item getFeeds(){
        return feeds;
    }
    public class Item{
        @SerializedName("student_id") private String studentId;
        @SerializedName("username") private String username;
        @SerializedName("image_url") private String  imageUrl;
        @SerializedName("video_url") private String  videoUrl;
        public String getStudentId(){
            return studentId;
        }
        public String getUsername(){
            return username;
        }
        public String getImageUrl(){
            return imageUrl;
        }
        public String getVideoUrl(){
            return videoUrl;
        }
    }
}
