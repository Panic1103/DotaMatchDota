
package com.example.dotamatch.Post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Runes {

    @SerializedName("property1")
    @Expose
    private int property1;
    @SerializedName("property2")
    @Expose
    private int property2;

    public int getProperty1() {
        return property1;
    }

    public void setProperty1(int property1) {
        this.property1 = property1;
    }

    public int getProperty2() {
        return property2;
    }

    public void setProperty2(int property2) {
        this.property2 = property2;
    }

}
