
package com.example.dotamatch.Post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RunesLog {

    @SerializedName("time")
    @Expose
    private int time;
    @SerializedName("key")
    @Expose
    private int key;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

}
