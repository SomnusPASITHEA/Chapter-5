package com.bytedance.android.lesson.restapi.solution.bean;

import android.util.Log;

import com.google.gson.annotations.SerializedName;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

//    private String id;
//    private String url;
//    private int width;
//    private int height;
//     //TODO-C1 (1) Implement your Cat Bean here according to the response json
//
//    @SerializedName("type") private String type;
//    @SerializedName("value") private Value value;
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public Value getValue() {
//        return value;
//    }
//
//    public void setValue(Value value) {
//        this.value = value;
//    }
//    public class Value {
//
//        @SerializedName("breeds") private List<String> breeds;
//        @SerializedName("id") private String id;
//        @SerializedName("url") private String url;
//        @SerializedName("width") private int width;
//        @SerializedName("height") private int height;
//
//        public List<String> getBreeds() {return breeds;}
//        public String getId(){return id;}
//        public String getUrl() {return url;}
//        public int getWidth() {return width;}
//        public int getHeight() {return height;}
//        @Override public String toString() {
//            return "Value{" +
//                    "breeds" + breeds +
//                    "id=" + id +
//                    ", url='" + url + '\'' +
//                    ", width=" + width +
//                    ", height=" + height +
//                    '}';
//        }
//    }
//    @Override public String toString() {
//        return "Joke{" +
//                "type='" + type + '\'' +
//                ", value=" + value +
//                '}';
//    }

//    @SerializedName("breeds") private List<String> breeds;
//       @SerializedName("id") private String id;
//       @SerializedName("url") private String url;
//       @SerializedName("width") private int width;
//       @SerializedName("height") private int height;
        private List<String> breeds;
        private String id;
        private String url;
        private int width;
        private int height;
        public List<String> getBreeds() {return breeds;}
        public String getId(){return id;}
        public String getUrl() {return url;}
        public int getWidth() {return width;}
        public int getHeight() {return height;}
        private  class categories{
                public int id;
                public String kittens;
        }
        @Override public String toString() {
           return "Value{" +
                   "breeds : " + breeds +
                   ", id=" + id +
                   ", url='" + url + '\'' +
                   ", width=" + width +
                   ", height=" + height +
                   '}';
        }
}
