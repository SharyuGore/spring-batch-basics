package com.sharyu.springbatchbasics.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Delivery {
	@Id
	public Long matchId;
	public String inning;
	public String battingTeam;
	public String bowlingTeam;
	public String over;
	public String ball;
	public String batsman;
	public String nonStriker;
	public String bowler;
	public String isSuperOver;
	public String wideRuns;
	public String byeRuns;
	public String legbyeRuns;
	public String noballRuns;
	public String penaltyRuns;
	public String batsmanRuns;
	public String extraRuns;
	public String totalRuns;
	public String playerDismissed;
	public String dismissalKind;
	public String fielder;
	public Long getMatchId() {
		return matchId;
	}
	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}
	public String getInning() {
		return inning;
	}
	public void setInning(String inning) {
		this.inning = inning;
	}
	public String getBattingTeam() {
		return battingTeam;
	}
	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}
	public String getBowlingTeam() {
		return bowlingTeam;
	}
	public void setBowlingTeam(String bowlingTeam) {
		this.bowlingTeam = bowlingTeam;
	}
	public String getOver() {
		return over;
	}
	public void setOver(String over) {
		this.over = over;
	}
	public String getBall() {
		return ball;
	}
	public void setBall(String ball) {
		this.ball = ball;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getNonStriker() {
		return nonStriker;
	}
	public void setNonStriker(String nonStriker) {
		this.nonStriker = nonStriker;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getIsSuperOver() {
		return isSuperOver;
	}
	public void setIsSuperOver(String isSuperOver) {
		this.isSuperOver = isSuperOver;
	}
	public String getWideRuns() {
		return wideRuns;
	}
	public void setWideRuns(String wideRuns) {
		this.wideRuns = wideRuns;
	}
	public String getByeRuns() {
		return byeRuns;
	}
	public void setByeRuns(String byeRuns) {
		this.byeRuns = byeRuns;
	}
	public String getLegbyeRuns() {
		return legbyeRuns;
	}
	public void setLegbyeRuns(String legbyeRuns) {
		this.legbyeRuns = legbyeRuns;
	}
	public String getNoballRuns() {
		return noballRuns;
	}
	public void setNoballRuns(String noballRuns) {
		this.noballRuns = noballRuns;
	}
	public String getPenaltyRuns() {
		return penaltyRuns;
	}
	public void setPenaltyRuns(String penaltyRuns) {
		this.penaltyRuns = penaltyRuns;
	}
	public String getBatsmanRuns() {
		return batsmanRuns;
	}
	public void setBatsmanRuns(String batsmanRuns) {
		this.batsmanRuns = batsmanRuns;
	}
	public String getExtraRuns() {
		return extraRuns;
	}
	public void setExtraRuns(String extraRuns) {
		this.extraRuns = extraRuns;
	}
	public String getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(String totalRuns) {
		this.totalRuns = totalRuns;
	}
	public String getPlayerDismissed() {
		return playerDismissed;
	}
	public void setPlayerDismissed(String playerDismissed) {
		this.playerDismissed = playerDismissed;
	}
	public String getDismissalKind() {
		return dismissalKind;
	}
	public void setDismissalKind(String dismissalKind) {
		this.dismissalKind = dismissalKind;
	}
	public String getFielder() {
		return fielder;
	}
	public void setFielder(String fielder) {
		this.fielder = fielder;
	}

}
