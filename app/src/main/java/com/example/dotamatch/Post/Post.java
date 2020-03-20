
package com.example.dotamatch.Post;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("match_id")
    @Expose
    private int matchId;
    @SerializedName("barracks_status_dire")
    @Expose
    private int barracksStatusDire;
    @SerializedName("barracks_status_radiant")
    @Expose
    private int barracksStatusRadiant;
    @SerializedName("chat")
    @Expose
    private List<Chat> chat = null;
    @SerializedName("cluster")
    @Expose
    private int cluster;
    @SerializedName("cosmetics")
    @Expose
    private Cosmetics cosmetics;
    @SerializedName("dire_score")
    @Expose
    private int direScore;
    @SerializedName("draft_timings")
    @Expose
    private List<DraftTiming> draftTimings = null;
    @SerializedName("duration")
    @Expose
    private int duration;
    @SerializedName("engine")
    @Expose
    private int engine;
    @SerializedName("first_blood_time")
    @Expose
    private int firstBloodTime;
    @SerializedName("game_mode")
    @Expose
    private int gameMode;
    @SerializedName("human_players")
    @Expose
    private int humanPlayers;
    @SerializedName("leagueid")
    @Expose
    private int leagueid;
    @SerializedName("lobby_type")
    @Expose
    private int lobbyType;
    @SerializedName("match_seq_num")
    @Expose
    private int matchSeqNum;
    @SerializedName("negative_votes")
    @Expose
    private int negativeVotes;
    @SerializedName("objectives")
    @Expose
    private Objectives objectives;
    @SerializedName("picks_bans")
    @Expose
    private PicksBans picksBans;
    @SerializedName("positive_votes")
    @Expose
    private int positiveVotes;
    @SerializedName("radiant_gold_adv")
    @Expose
    private RadiantGoldAdv radiantGoldAdv;
    @SerializedName("radiant_score")
    @Expose
    private int radiantScore;
    @SerializedName("radiant_win")
    @Expose
    private boolean radiantWin;
    @SerializedName("radiant_xp_adv")
    @Expose
    private RadiantXpAdv radiantXpAdv;
    @SerializedName("start_time")
    @Expose
    private int startTime;
    @SerializedName("teamfights")
    @Expose
    private Teamfights teamfights;
    @SerializedName("tower_status_dire")
    @Expose
    private int towerStatusDire;
    @SerializedName("tower_status_radiant")
    @Expose
    private int towerStatusRadiant;
    @SerializedName("version")
    @Expose
    private int version;
    @SerializedName("replay_salt")
    @Expose
    private int replaySalt;
    @SerializedName("series_id")
    @Expose
    private int seriesId;
    @SerializedName("series_type")
    @Expose
    private int seriesType;
    @SerializedName("radiant_team")
    @Expose
    private RadiantTeam radiantTeam;
    @SerializedName("dire_team")
    @Expose
    private DireTeam direTeam;
    @SerializedName("league")
    @Expose
    private League league;
    @SerializedName("skill")
    @Expose
    private int skill;
    @SerializedName("players")
    @Expose
    private List<Player> players = null;
    @SerializedName("patch")
    @Expose
    private int patch;
    @SerializedName("region")
    @Expose
    private int region;
    @SerializedName("all_word_counts")
    @Expose
    private AllWordCounts allWordCounts;
    @SerializedName("my_word_counts")
    @Expose
    private MyWordCounts myWordCounts;
    @SerializedName("throw")
    @Expose
    private int _throw;
    @SerializedName("comeback")
    @Expose
    private int comeback;
    @SerializedName("loss")
    @Expose
    private int loss;
    @SerializedName("win")
    @Expose
    private int win;
    @SerializedName("replay_url")
    @Expose
    private String replayUrl;

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getBarracksStatusDire() {
        return barracksStatusDire;
    }

    public void setBarracksStatusDire(int barracksStatusDire) {
        this.barracksStatusDire = barracksStatusDire;
    }

    public int getBarracksStatusRadiant() {
        return barracksStatusRadiant;
    }

    public void setBarracksStatusRadiant(int barracksStatusRadiant) {
        this.barracksStatusRadiant = barracksStatusRadiant;
    }

    public List<Chat> getChat() {
        return chat;
    }

    public void setChat(List<Chat> chat) {
        this.chat = chat;
    }

    public int getCluster() {
        return cluster;
    }

    public void setCluster(int cluster) {
        this.cluster = cluster;
    }

    public Cosmetics getCosmetics() {
        return cosmetics;
    }

    public void setCosmetics(Cosmetics cosmetics) {
        this.cosmetics = cosmetics;
    }

    public int getDireScore() {
        return direScore;
    }

    public void setDireScore(int direScore) {
        this.direScore = direScore;
    }

    public List<DraftTiming> getDraftTimings() {
        return draftTimings;
    }

    public void setDraftTimings(List<DraftTiming> draftTimings) {
        this.draftTimings = draftTimings;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getFirstBloodTime() {
        return firstBloodTime;
    }

    public void setFirstBloodTime(int firstBloodTime) {
        this.firstBloodTime = firstBloodTime;
    }

    public int getGameMode() {
        return gameMode;
    }

    public void setGameMode(int gameMode) {
        this.gameMode = gameMode;
    }

    public int getHumanPlayers() {
        return humanPlayers;
    }

    public void setHumanPlayers(int humanPlayers) {
        this.humanPlayers = humanPlayers;
    }

    public int getLeagueid() {
        return leagueid;
    }

    public void setLeagueid(int leagueid) {
        this.leagueid = leagueid;
    }

    public int getLobbyType() {
        return lobbyType;
    }

    public void setLobbyType(int lobbyType) {
        this.lobbyType = lobbyType;
    }

    public int getMatchSeqNum() {
        return matchSeqNum;
    }

    public void setMatchSeqNum(int matchSeqNum) {
        this.matchSeqNum = matchSeqNum;
    }

    public int getNegativeVotes() {
        return negativeVotes;
    }

    public void setNegativeVotes(int negativeVotes) {
        this.negativeVotes = negativeVotes;
    }

    public Objectives getObjectives() {
        return objectives;
    }

    public void setObjectives(Objectives objectives) {
        this.objectives = objectives;
    }

    public PicksBans getPicksBans() {
        return picksBans;
    }

    public void setPicksBans(PicksBans picksBans) {
        this.picksBans = picksBans;
    }

    public int getPositiveVotes() {
        return positiveVotes;
    }

    public void setPositiveVotes(int positiveVotes) {
        this.positiveVotes = positiveVotes;
    }

    public RadiantGoldAdv getRadiantGoldAdv() {
        return radiantGoldAdv;
    }

    public void setRadiantGoldAdv(RadiantGoldAdv radiantGoldAdv) {
        this.radiantGoldAdv = radiantGoldAdv;
    }

    public int getRadiantScore() {
        return radiantScore;
    }

    public void setRadiantScore(int radiantScore) {
        this.radiantScore = radiantScore;
    }

    public boolean isRadiantWin() {
        return radiantWin;
    }

    public void setRadiantWin(boolean radiantWin) {
        this.radiantWin = radiantWin;
    }

    public RadiantXpAdv getRadiantXpAdv() {
        return radiantXpAdv;
    }

    public void setRadiantXpAdv(RadiantXpAdv radiantXpAdv) {
        this.radiantXpAdv = radiantXpAdv;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public Teamfights getTeamfights() {
        return teamfights;
    }

    public void setTeamfights(Teamfights teamfights) {
        this.teamfights = teamfights;
    }

    public int getTowerStatusDire() {
        return towerStatusDire;
    }

    public void setTowerStatusDire(int towerStatusDire) {
        this.towerStatusDire = towerStatusDire;
    }

    public int getTowerStatusRadiant() {
        return towerStatusRadiant;
    }

    public void setTowerStatusRadiant(int towerStatusRadiant) {
        this.towerStatusRadiant = towerStatusRadiant;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getReplaySalt() {
        return replaySalt;
    }

    public void setReplaySalt(int replaySalt) {
        this.replaySalt = replaySalt;
    }

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public int getSeriesType() {
        return seriesType;
    }

    public void setSeriesType(int seriesType) {
        this.seriesType = seriesType;
    }

    public RadiantTeam getRadiantTeam() {
        return radiantTeam;
    }

    public void setRadiantTeam(RadiantTeam radiantTeam) {
        this.radiantTeam = radiantTeam;
    }

    public DireTeam getDireTeam() {
        return direTeam;
    }

    public void setDireTeam(DireTeam direTeam) {
        this.direTeam = direTeam;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getPatch() {
        return patch;
    }

    public void setPatch(int patch) {
        this.patch = patch;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public AllWordCounts getAllWordCounts() {
        return allWordCounts;
    }

    public void setAllWordCounts(AllWordCounts allWordCounts) {
        this.allWordCounts = allWordCounts;
    }

    public MyWordCounts getMyWordCounts() {
        return myWordCounts;
    }

    public void setMyWordCounts(MyWordCounts myWordCounts) {
        this.myWordCounts = myWordCounts;
    }

    public int getThrow() {
        return _throw;
    }

    public void setThrow(int _throw) {
        this._throw = _throw;
    }

    public int getComeback() {
        return comeback;
    }

    public void setComeback(int comeback) {
        this.comeback = comeback;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public String getReplayUrl() {
        return replayUrl;
    }

    public void setReplayUrl(String replayUrl) {
        this.replayUrl = replayUrl;
    }

}
