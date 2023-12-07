package com.main.web.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Fight {

	@Id 
	public String _id;
	public String fightId;
	public String date;
	public int year;
	public String fightName;
	public String opponentId;
	public String preFightStat;
	public Boolean win;
	
	public Fight() {}

	public Fight(String _id, String fightId, String date, int year, String fightName, String opponentId,
			String preFightStat, Boolean win) {
		super();
		this._id = _id;
		this.fightId = fightId;
		this.date = date;
		this.year = year;
		this.fightName = fightName;
		this.opponentId = opponentId;
		this.preFightStat = preFightStat;
		this.win = win;
	}

	public Fight(String fightId, String date, int year, String fightName, String opponentId, String preFightStat,
			Boolean win) {
		super();
		this.fightId = fightId;
		this.date = date;
		this.year = year;
		this.fightName = fightName;
		this.opponentId = opponentId;
		this.preFightStat = preFightStat;
		this.win = win;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getFightId() {
		return fightId;
	}

	public void setFightId(String fightId) {
		this.fightId = fightId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getFightName() {
		return fightName;
	}

	public void setFightName(String fightName) {
		this.fightName = fightName;
	}

	public String getOpponentId() {
		return opponentId;
	}

	public void setOpponentId(String opponentId) {
		this.opponentId = opponentId;
	}

	public String getPreFightStat() {
		return preFightStat;
	}

	public void setPreFightStat(String preFightStat) {
		this.preFightStat = preFightStat;
	}

	public Boolean getWin() {
		return win;
	}

	public void setWin(Boolean win) {
		this.win = win;
	}

	
	
	
	
}
