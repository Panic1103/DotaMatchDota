
package com.example.dotamatch.Post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PurchaseLog {

    @SerializedName("time")
    @Expose
    private int time;
    @SerializedName("key")
    @Expose
    private String key;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
