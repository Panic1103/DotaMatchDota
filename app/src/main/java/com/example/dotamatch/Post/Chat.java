
package com.example.dotamatch.Post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Chat {

    @SerializedName("time")
    @Expose
    private int time;
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("slot")
    @Expose
    private int slot;
    @SerializedName("player_slot")
    @Expose
    private int playerSlot;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(int playerSlot) {
        this.playerSlot = playerSlot;
    }

}
