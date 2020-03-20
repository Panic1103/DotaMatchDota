
package com.example.dotamatch.Post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DraftTiming {

    @SerializedName("order")
    @Expose
    private int order;
    @SerializedName("pick")
    @Expose
    private boolean pick;
    @SerializedName("active_team")
    @Expose
    private int activeTeam;
    @SerializedName("hero_id")
    @Expose
    private int heroId;
    @SerializedName("player_slot")
    @Expose
    private int playerSlot;
    @SerializedName("extra_time")
    @Expose
    private int extraTime;
    @SerializedName("total_time_taken")
    @Expose
    private int totalTimeTaken;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isPick() {
        return pick;
    }

    public void setPick(boolean pick) {
        this.pick = pick;
    }

    public int getActiveTeam() {
        return activeTeam;
    }

    public void setActiveTeam(int activeTeam) {
        this.activeTeam = activeTeam;
    }

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public int getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(int playerSlot) {
        this.playerSlot = playerSlot;
    }

    public int getExtraTime() {
        return extraTime;
    }

    public void setExtraTime(int extraTime) {
        this.extraTime = extraTime;
    }

    public int getTotalTimeTaken() {
        return totalTimeTaken;
    }

    public void setTotalTimeTaken(int totalTimeTaken) {
        this.totalTimeTaken = totalTimeTaken;
    }

}
