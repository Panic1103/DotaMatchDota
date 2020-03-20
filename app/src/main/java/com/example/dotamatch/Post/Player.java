
package com.example.dotamatch.Post;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Player {

    @SerializedName("match_id")
    @Expose
    private int matchId;
    @SerializedName("player_slot")
    @Expose
    private int playerSlot;
    @SerializedName("ability_upgrades_arr")
    @Expose
    private List<Integer> abilityUpgradesArr = null;
    @SerializedName("ability_uses")
    @Expose
    private AbilityUses abilityUses;
    @SerializedName("ability_targets")
    @Expose
    private AbilityTargets abilityTargets;
    @SerializedName("damage_targets")
    @Expose
    private DamageTargets damageTargets;
    @SerializedName("account_id")
    @Expose
    private int accountId;
    @SerializedName("actions")
    @Expose
    private Actions actions;
    @SerializedName("additional_units")
    @Expose
    private AdditionalUnits additionalUnits;
    @SerializedName("assists")
    @Expose
    private int assists;
    @SerializedName("backpack_0")
    @Expose
    private int backpack0;
    @SerializedName("backpack_1")
    @Expose
    private int backpack1;
    @SerializedName("backpack_2")
    @Expose
    private int backpack2;
    @SerializedName("buyback_log")
    @Expose
    private List<BuybackLog> buybackLog = null;
    @SerializedName("camps_stacked")
    @Expose
    private int campsStacked;
    @SerializedName("connection_log")
    @Expose
    private List<ConnectionLog> connectionLog = null;
    @SerializedName("creeps_stacked")
    @Expose
    private int creepsStacked;
    @SerializedName("damage")
    @Expose
    private Damage damage;
    @SerializedName("damage_inflictor")
    @Expose
    private DamageInflictor damageInflictor;
    @SerializedName("damage_inflictor_received")
    @Expose
    private DamageInflictorReceived damageInflictorReceived;
    @SerializedName("damage_taken")
    @Expose
    private DamageTaken damageTaken;
    @SerializedName("deaths")
    @Expose
    private int deaths;
    @SerializedName("denies")
    @Expose
    private int denies;
    @SerializedName("dn_t")
    @Expose
    private List<Integer> dnT = null;
    @SerializedName("gold")
    @Expose
    private int gold;
    @SerializedName("gold_per_min")
    @Expose
    private int goldPerMin;
    @SerializedName("gold_reasons")
    @Expose
    private GoldReasons goldReasons;
    @SerializedName("gold_spent")
    @Expose
    private int goldSpent;
    @SerializedName("gold_t")
    @Expose
    private List<Integer> goldT = null;
    @SerializedName("hero_damage")
    @Expose
    private int heroDamage;
    @SerializedName("hero_healing")
    @Expose
    private int heroHealing;
    @SerializedName("hero_hits")
    @Expose
    private HeroHits heroHits;
    @SerializedName("hero_id")
    @Expose
    private int heroId;
    @SerializedName("item_0")
    @Expose
    private int item0;
    @SerializedName("item_1")
    @Expose
    private int item1;
    @SerializedName("item_2")
    @Expose
    private int item2;
    @SerializedName("item_3")
    @Expose
    private int item3;
    @SerializedName("item_4")
    @Expose
    private int item4;
    @SerializedName("item_5")
    @Expose
    private int item5;
    @SerializedName("item_uses")
    @Expose
    private ItemUses itemUses;
    @SerializedName("kill_streaks")
    @Expose
    private KillStreaks killStreaks;
    @SerializedName("killed")
    @Expose
    private Killed killed;
    @SerializedName("killed_by")
    @Expose
    private KilledBy killedBy;
    @SerializedName("kills")
    @Expose
    private int kills;
    @SerializedName("kills_log")
    @Expose
    private List<KillsLog> killsLog = null;
    @SerializedName("lane_pos")
    @Expose
    private LanePos lanePos;
    @SerializedName("last_hits")
    @Expose
    private int lastHits;
    @SerializedName("leaver_status")
    @Expose
    private int leaverStatus;
    @SerializedName("level")
    @Expose
    private int level;
    @SerializedName("lh_t")
    @Expose
    private List<Integer> lhT = null;
    @SerializedName("life_state")
    @Expose
    private LifeState lifeState;
    @SerializedName("max_hero_hit")
    @Expose
    private MaxHeroHit maxHeroHit;
    @SerializedName("multi_kills")
    @Expose
    private MultiKills multiKills;
    @SerializedName("obs")
    @Expose
    private Obs obs;
    @SerializedName("obs_left_log")
    @Expose
    private List<ObsLeftLog> obsLeftLog = null;
    @SerializedName("obs_log")
    @Expose
    private List<ObsLog> obsLog = null;
    @SerializedName("obs_placed")
    @Expose
    private int obsPlaced;
    @SerializedName("party_id")
    @Expose
    private int partyId;
    @SerializedName("permanent_buffs")
    @Expose
    private List<PermanentBuff> permanentBuffs = null;
    @SerializedName("pings")
    @Expose
    private int pings;
    @SerializedName("purchase")
    @Expose
    private Purchase purchase;
    @SerializedName("purchase_log")
    @Expose
    private List<PurchaseLog> purchaseLog = null;
    @SerializedName("rune_pickups")
    @Expose
    private int runePickups;
    @SerializedName("runes")
    @Expose
    private Runes runes;
    @SerializedName("runes_log")
    @Expose
    private List<RunesLog> runesLog = null;
    @SerializedName("sen")
    @Expose
    private Sen sen;
    @SerializedName("sen_left_log")
    @Expose
    private List<SenLeftLog> senLeftLog = null;
    @SerializedName("sen_log")
    @Expose
    private List<SenLog> senLog = null;
    @SerializedName("sen_placed")
    @Expose
    private int senPlaced;
    @SerializedName("stuns")
    @Expose
    private int stuns;
    @SerializedName("times")
    @Expose
    private List<Integer> times = null;
    @SerializedName("tower_damage")
    @Expose
    private int towerDamage;
    @SerializedName("xp_per_min")
    @Expose
    private int xpPerMin;
    @SerializedName("xp_reasons")
    @Expose
    private XpReasons xpReasons;
    @SerializedName("xp_t")
    @Expose
    private List<Integer> xpT = null;
    @SerializedName("personaname")
    @Expose
    private String personaname;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("last_login")
    @Expose
    private Object lastLogin;
    @SerializedName("radiant_win")
    @Expose
    private boolean radiantWin;
    @SerializedName("start_time")
    @Expose
    private int startTime;
    @SerializedName("duration")
    @Expose
    private int duration;
    @SerializedName("cluster")
    @Expose
    private int cluster;
    @SerializedName("lobby_type")
    @Expose
    private int lobbyType;
    @SerializedName("game_mode")
    @Expose
    private int gameMode;
    @SerializedName("patch")
    @Expose
    private int patch;
    @SerializedName("region")
    @Expose
    private int region;
    @SerializedName("isRadiant")
    @Expose
    private boolean isRadiant;
    @SerializedName("win")
    @Expose
    private int win;
    @SerializedName("lose")
    @Expose
    private int lose;
    @SerializedName("total_gold")
    @Expose
    private int totalGold;
    @SerializedName("total_xp")
    @Expose
    private int totalXp;
    @SerializedName("kills_per_min")
    @Expose
    private int killsPerMin;
    @SerializedName("kda")
    @Expose
    private int kda;
    @SerializedName("abandons")
    @Expose
    private int abandons;
    @SerializedName("neutral_kills")
    @Expose
    private int neutralKills;
    @SerializedName("tower_kills")
    @Expose
    private int towerKills;
    @SerializedName("courier_kills")
    @Expose
    private int courierKills;
    @SerializedName("lane_kills")
    @Expose
    private int laneKills;
    @SerializedName("hero_kills")
    @Expose
    private int heroKills;
    @SerializedName("observer_kills")
    @Expose
    private int observerKills;
    @SerializedName("sentry_kills")
    @Expose
    private int sentryKills;
    @SerializedName("roshan_kills")
    @Expose
    private int roshanKills;
    @SerializedName("necronomicon_kills")
    @Expose
    private int necronomiconKills;
    @SerializedName("ancient_kills")
    @Expose
    private int ancientKills;
    @SerializedName("buyback_count")
    @Expose
    private int buybackCount;
    @SerializedName("observer_uses")
    @Expose
    private int observerUses;
    @SerializedName("sentry_uses")
    @Expose
    private int sentryUses;
    @SerializedName("lane_efficiency")
    @Expose
    private int laneEfficiency;
    @SerializedName("lane_efficiency_pct")
    @Expose
    private int laneEfficiencyPct;
    @SerializedName("lane")
    @Expose
    private int lane;
    @SerializedName("lane_role")
    @Expose
    private int laneRole;
    @SerializedName("is_roaming")
    @Expose
    private boolean isRoaming;
    @SerializedName("purchase_time")
    @Expose
    private PurchaseTime purchaseTime;
    @SerializedName("first_purchase_time")
    @Expose
    private FirstPurchaseTime firstPurchaseTime;
    @SerializedName("item_win")
    @Expose
    private ItemWin itemWin;
    @SerializedName("item_usage")
    @Expose
    private ItemUsage itemUsage;
    @SerializedName("purchase_tpscroll")
    @Expose
    private PurchaseTpscroll purchaseTpscroll;
    @SerializedName("actions_per_min")
    @Expose
    private int actionsPerMin;
    @SerializedName("life_state_dead")
    @Expose
    private int lifeStateDead;
    @SerializedName("rank_tier")
    @Expose
    private int rankTier;
    @SerializedName("cosmetics")
    @Expose
    private List<Integer> cosmetics = null;
    @SerializedName("benchmarks")
    @Expose
    private Benchmarks benchmarks;

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(int playerSlot) {
        this.playerSlot = playerSlot;
    }

    public List<Integer> getAbilityUpgradesArr() {
        return abilityUpgradesArr;
    }

    public void setAbilityUpgradesArr(List<Integer> abilityUpgradesArr) {
        this.abilityUpgradesArr = abilityUpgradesArr;
    }

    public AbilityUses getAbilityUses() {
        return abilityUses;
    }

    public void setAbilityUses(AbilityUses abilityUses) {
        this.abilityUses = abilityUses;
    }

    public AbilityTargets getAbilityTargets() {
        return abilityTargets;
    }

    public void setAbilityTargets(AbilityTargets abilityTargets) {
        this.abilityTargets = abilityTargets;
    }

    public DamageTargets getDamageTargets() {
        return damageTargets;
    }

    public void setDamageTargets(DamageTargets damageTargets) {
        this.damageTargets = damageTargets;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Actions getActions() {
        return actions;
    }

    public void setActions(Actions actions) {
        this.actions = actions;
    }

    public AdditionalUnits getAdditionalUnits() {
        return additionalUnits;
    }

    public void setAdditionalUnits(AdditionalUnits additionalUnits) {
        this.additionalUnits = additionalUnits;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getBackpack0() {
        return backpack0;
    }

    public void setBackpack0(int backpack0) {
        this.backpack0 = backpack0;
    }

    public int getBackpack1() {
        return backpack1;
    }

    public void setBackpack1(int backpack1) {
        this.backpack1 = backpack1;
    }

    public int getBackpack2() {
        return backpack2;
    }

    public void setBackpack2(int backpack2) {
        this.backpack2 = backpack2;
    }

    public List<BuybackLog> getBuybackLog() {
        return buybackLog;
    }

    public void setBuybackLog(List<BuybackLog> buybackLog) {
        this.buybackLog = buybackLog;
    }

    public int getCampsStacked() {
        return campsStacked;
    }

    public void setCampsStacked(int campsStacked) {
        this.campsStacked = campsStacked;
    }

    public List<ConnectionLog> getConnectionLog() {
        return connectionLog;
    }

    public void setConnectionLog(List<ConnectionLog> connectionLog) {
        this.connectionLog = connectionLog;
    }

    public int getCreepsStacked() {
        return creepsStacked;
    }

    public void setCreepsStacked(int creepsStacked) {
        this.creepsStacked = creepsStacked;
    }

    public Damage getDamage() {
        return damage;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public DamageInflictor getDamageInflictor() {
        return damageInflictor;
    }

    public void setDamageInflictor(DamageInflictor damageInflictor) {
        this.damageInflictor = damageInflictor;
    }

    public DamageInflictorReceived getDamageInflictorReceived() {
        return damageInflictorReceived;
    }

    public void setDamageInflictorReceived(DamageInflictorReceived damageInflictorReceived) {
        this.damageInflictorReceived = damageInflictorReceived;
    }

    public DamageTaken getDamageTaken() {
        return damageTaken;
    }

    public void setDamageTaken(DamageTaken damageTaken) {
        this.damageTaken = damageTaken;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getDenies() {
        return denies;
    }

    public void setDenies(int denies) {
        this.denies = denies;
    }

    public List<Integer> getDnT() {
        return dnT;
    }

    public void setDnT(List<Integer> dnT) {
        this.dnT = dnT;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getGoldPerMin() {
        return goldPerMin;
    }

    public void setGoldPerMin(int goldPerMin) {
        this.goldPerMin = goldPerMin;
    }

    public GoldReasons getGoldReasons() {
        return goldReasons;
    }

    public void setGoldReasons(GoldReasons goldReasons) {
        this.goldReasons = goldReasons;
    }

    public int getGoldSpent() {
        return goldSpent;
    }

    public void setGoldSpent(int goldSpent) {
        this.goldSpent = goldSpent;
    }

    public List<Integer> getGoldT() {
        return goldT;
    }

    public void setGoldT(List<Integer> goldT) {
        this.goldT = goldT;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public int getHeroHealing() {
        return heroHealing;
    }

    public void setHeroHealing(int heroHealing) {
        this.heroHealing = heroHealing;
    }

    public HeroHits getHeroHits() {
        return heroHits;
    }

    public void setHeroHits(HeroHits heroHits) {
        this.heroHits = heroHits;
    }

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public int getItem0() {
        return item0;
    }

    public void setItem0(int item0) {
        this.item0 = item0;
    }

    public int getItem1() {
        return item1;
    }

    public void setItem1(int item1) {
        this.item1 = item1;
    }

    public int getItem2() {
        return item2;
    }

    public void setItem2(int item2) {
        this.item2 = item2;
    }

    public int getItem3() {
        return item3;
    }

    public void setItem3(int item3) {
        this.item3 = item3;
    }

    public int getItem4() {
        return item4;
    }

    public void setItem4(int item4) {
        this.item4 = item4;
    }

    public int getItem5() {
        return item5;
    }

    public void setItem5(int item5) {
        this.item5 = item5;
    }

    public ItemUses getItemUses() {
        return itemUses;
    }

    public void setItemUses(ItemUses itemUses) {
        this.itemUses = itemUses;
    }

    public KillStreaks getKillStreaks() {
        return killStreaks;
    }

    public void setKillStreaks(KillStreaks killStreaks) {
        this.killStreaks = killStreaks;
    }

    public Killed getKilled() {
        return killed;
    }

    public void setKilled(Killed killed) {
        this.killed = killed;
    }

    public KilledBy getKilledBy() {
        return killedBy;
    }

    public void setKilledBy(KilledBy killedBy) {
        this.killedBy = killedBy;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public List<KillsLog> getKillsLog() {
        return killsLog;
    }

    public void setKillsLog(List<KillsLog> killsLog) {
        this.killsLog = killsLog;
    }

    public LanePos getLanePos() {
        return lanePos;
    }

    public void setLanePos(LanePos lanePos) {
        this.lanePos = lanePos;
    }

    public int getLastHits() {
        return lastHits;
    }

    public void setLastHits(int lastHits) {
        this.lastHits = lastHits;
    }

    public int getLeaverStatus() {
        return leaverStatus;
    }

    public void setLeaverStatus(int leaverStatus) {
        this.leaverStatus = leaverStatus;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Integer> getLhT() {
        return lhT;
    }

    public void setLhT(List<Integer> lhT) {
        this.lhT = lhT;
    }

    public LifeState getLifeState() {
        return lifeState;
    }

    public void setLifeState(LifeState lifeState) {
        this.lifeState = lifeState;
    }

    public MaxHeroHit getMaxHeroHit() {
        return maxHeroHit;
    }

    public void setMaxHeroHit(MaxHeroHit maxHeroHit) {
        this.maxHeroHit = maxHeroHit;
    }

    public MultiKills getMultiKills() {
        return multiKills;
    }

    public void setMultiKills(MultiKills multiKills) {
        this.multiKills = multiKills;
    }

    public Obs getObs() {
        return obs;
    }

    public void setObs(Obs obs) {
        this.obs = obs;
    }

    public List<ObsLeftLog> getObsLeftLog() {
        return obsLeftLog;
    }

    public void setObsLeftLog(List<ObsLeftLog> obsLeftLog) {
        this.obsLeftLog = obsLeftLog;
    }

    public List<ObsLog> getObsLog() {
        return obsLog;
    }

    public void setObsLog(List<ObsLog> obsLog) {
        this.obsLog = obsLog;
    }

    public int getObsPlaced() {
        return obsPlaced;
    }

    public void setObsPlaced(int obsPlaced) {
        this.obsPlaced = obsPlaced;
    }

    public int getPartyId() {
        return partyId;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    public List<PermanentBuff> getPermanentBuffs() {
        return permanentBuffs;
    }

    public void setPermanentBuffs(List<PermanentBuff> permanentBuffs) {
        this.permanentBuffs = permanentBuffs;
    }

    public int getPings() {
        return pings;
    }

    public void setPings(int pings) {
        this.pings = pings;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public List<PurchaseLog> getPurchaseLog() {
        return purchaseLog;
    }

    public void setPurchaseLog(List<PurchaseLog> purchaseLog) {
        this.purchaseLog = purchaseLog;
    }

    public int getRunePickups() {
        return runePickups;
    }

    public void setRunePickups(int runePickups) {
        this.runePickups = runePickups;
    }

    public Runes getRunes() {
        return runes;
    }

    public void setRunes(Runes runes) {
        this.runes = runes;
    }

    public List<RunesLog> getRunesLog() {
        return runesLog;
    }

    public void setRunesLog(List<RunesLog> runesLog) {
        this.runesLog = runesLog;
    }

    public Sen getSen() {
        return sen;
    }

    public void setSen(Sen sen) {
        this.sen = sen;
    }

    public List<SenLeftLog> getSenLeftLog() {
        return senLeftLog;
    }

    public void setSenLeftLog(List<SenLeftLog> senLeftLog) {
        this.senLeftLog = senLeftLog;
    }

    public List<SenLog> getSenLog() {
        return senLog;
    }

    public void setSenLog(List<SenLog> senLog) {
        this.senLog = senLog;
    }

    public int getSenPlaced() {
        return senPlaced;
    }

    public void setSenPlaced(int senPlaced) {
        this.senPlaced = senPlaced;
    }

    public int getStuns() {
        return stuns;
    }

    public void setStuns(int stuns) {
        this.stuns = stuns;
    }

    public List<Integer> getTimes() {
        return times;
    }

    public void setTimes(List<Integer> times) {
        this.times = times;
    }

    public int getTowerDamage() {
        return towerDamage;
    }

    public void setTowerDamage(int towerDamage) {
        this.towerDamage = towerDamage;
    }

    public int getXpPerMin() {
        return xpPerMin;
    }

    public void setXpPerMin(int xpPerMin) {
        this.xpPerMin = xpPerMin;
    }

    public XpReasons getXpReasons() {
        return xpReasons;
    }

    public void setXpReasons(XpReasons xpReasons) {
        this.xpReasons = xpReasons;
    }

    public List<Integer> getXpT() {
        return xpT;
    }

    public void setXpT(List<Integer> xpT) {
        this.xpT = xpT;
    }

    public String getPersonaname() {
        return personaname;
    }

    public void setPersonaname(String personaname) {
        this.personaname = personaname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Object lastLogin) {
        this.lastLogin = lastLogin;
    }

    public boolean isRadiantWin() {
        return radiantWin;
    }

    public void setRadiantWin(boolean radiantWin) {
        this.radiantWin = radiantWin;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCluster() {
        return cluster;
    }

    public void setCluster(int cluster) {
        this.cluster = cluster;
    }

    public int getLobbyType() {
        return lobbyType;
    }

    public void setLobbyType(int lobbyType) {
        this.lobbyType = lobbyType;
    }

    public int getGameMode() {
        return gameMode;
    }

    public void setGameMode(int gameMode) {
        this.gameMode = gameMode;
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

    public boolean isIsRadiant() {
        return isRadiant;
    }

    public void setIsRadiant(boolean isRadiant) {
        this.isRadiant = isRadiant;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getTotalGold() {
        return totalGold;
    }

    public void setTotalGold(int totalGold) {
        this.totalGold = totalGold;
    }

    public int getTotalXp() {
        return totalXp;
    }

    public void setTotalXp(int totalXp) {
        this.totalXp = totalXp;
    }

    public int getKillsPerMin() {
        return killsPerMin;
    }

    public void setKillsPerMin(int killsPerMin) {
        this.killsPerMin = killsPerMin;
    }

    public int getKda() {
        return kda;
    }

    public void setKda(int kda) {
        this.kda = kda;
    }

    public int getAbandons() {
        return abandons;
    }

    public void setAbandons(int abandons) {
        this.abandons = abandons;
    }

    public int getNeutralKills() {
        return neutralKills;
    }

    public void setNeutralKills(int neutralKills) {
        this.neutralKills = neutralKills;
    }

    public int getTowerKills() {
        return towerKills;
    }

    public void setTowerKills(int towerKills) {
        this.towerKills = towerKills;
    }

    public int getCourierKills() {
        return courierKills;
    }

    public void setCourierKills(int courierKills) {
        this.courierKills = courierKills;
    }

    public int getLaneKills() {
        return laneKills;
    }

    public void setLaneKills(int laneKills) {
        this.laneKills = laneKills;
    }

    public int getHeroKills() {
        return heroKills;
    }

    public void setHeroKills(int heroKills) {
        this.heroKills = heroKills;
    }

    public int getObserverKills() {
        return observerKills;
    }

    public void setObserverKills(int observerKills) {
        this.observerKills = observerKills;
    }

    public int getSentryKills() {
        return sentryKills;
    }

    public void setSentryKills(int sentryKills) {
        this.sentryKills = sentryKills;
    }

    public int getRoshanKills() {
        return roshanKills;
    }

    public void setRoshanKills(int roshanKills) {
        this.roshanKills = roshanKills;
    }

    public int getNecronomiconKills() {
        return necronomiconKills;
    }

    public void setNecronomiconKills(int necronomiconKills) {
        this.necronomiconKills = necronomiconKills;
    }

    public int getAncientKills() {
        return ancientKills;
    }

    public void setAncientKills(int ancientKills) {
        this.ancientKills = ancientKills;
    }

    public int getBuybackCount() {
        return buybackCount;
    }

    public void setBuybackCount(int buybackCount) {
        this.buybackCount = buybackCount;
    }

    public int getObserverUses() {
        return observerUses;
    }

    public void setObserverUses(int observerUses) {
        this.observerUses = observerUses;
    }

    public int getSentryUses() {
        return sentryUses;
    }

    public void setSentryUses(int sentryUses) {
        this.sentryUses = sentryUses;
    }

    public int getLaneEfficiency() {
        return laneEfficiency;
    }

    public void setLaneEfficiency(int laneEfficiency) {
        this.laneEfficiency = laneEfficiency;
    }

    public int getLaneEfficiencyPct() {
        return laneEfficiencyPct;
    }

    public void setLaneEfficiencyPct(int laneEfficiencyPct) {
        this.laneEfficiencyPct = laneEfficiencyPct;
    }

    public int getLane() {
        return lane;
    }

    public void setLane(int lane) {
        this.lane = lane;
    }

    public int getLaneRole() {
        return laneRole;
    }

    public void setLaneRole(int laneRole) {
        this.laneRole = laneRole;
    }

    public boolean isIsRoaming() {
        return isRoaming;
    }

    public void setIsRoaming(boolean isRoaming) {
        this.isRoaming = isRoaming;
    }

    public PurchaseTime getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(PurchaseTime purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public FirstPurchaseTime getFirstPurchaseTime() {
        return firstPurchaseTime;
    }

    public void setFirstPurchaseTime(FirstPurchaseTime firstPurchaseTime) {
        this.firstPurchaseTime = firstPurchaseTime;
    }

    public ItemWin getItemWin() {
        return itemWin;
    }

    public void setItemWin(ItemWin itemWin) {
        this.itemWin = itemWin;
    }

    public ItemUsage getItemUsage() {
        return itemUsage;
    }

    public void setItemUsage(ItemUsage itemUsage) {
        this.itemUsage = itemUsage;
    }

    public PurchaseTpscroll getPurchaseTpscroll() {
        return purchaseTpscroll;
    }

    public void setPurchaseTpscroll(PurchaseTpscroll purchaseTpscroll) {
        this.purchaseTpscroll = purchaseTpscroll;
    }

    public int getActionsPerMin() {
        return actionsPerMin;
    }

    public void setActionsPerMin(int actionsPerMin) {
        this.actionsPerMin = actionsPerMin;
    }

    public int getLifeStateDead() {
        return lifeStateDead;
    }

    public void setLifeStateDead(int lifeStateDead) {
        this.lifeStateDead = lifeStateDead;
    }

    public int getRankTier() {
        return rankTier;
    }

    public void setRankTier(int rankTier) {
        this.rankTier = rankTier;
    }

    public List<Integer> getCosmetics() {
        return cosmetics;
    }

    public void setCosmetics(List<Integer> cosmetics) {
        this.cosmetics = cosmetics;
    }

    public Benchmarks getBenchmarks() {
        return benchmarks;
    }

    public void setBenchmarks(Benchmarks benchmarks) {
        this.benchmarks = benchmarks;
    }

}
