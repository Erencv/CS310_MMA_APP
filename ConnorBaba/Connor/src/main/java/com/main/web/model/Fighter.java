package com.main.web.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Fighter {
	@Id 
	public String _id;
	public String fighterId;
	public String name;
	public String lastName;
	public String nickName;
	public int weight;
	public int height;
	public double reach;
	public String birthDate;
	
	public Fighter() {
		
	}

	public Fighter(String _id, String fighterId, String name, String lastName, String nickName, int weight, int height,
			double reach, String birthDate) {
		super();
		this._id = _id;
		this.fighterId = fighterId;
		this.name = name;
		this.lastName = lastName;
		this.nickName = nickName;
		this.weight = weight;
		this.height = height;
		this.reach = reach;
		this.birthDate = birthDate;
	}

	public Fighter(String fighterId, String name, String lastName, String nickName, int weight, int height,
			double reach, String birthDate) {
		super();
		this.fighterId = fighterId;
		this.name = name;
		this.lastName = lastName;
		this.nickName = nickName;
		this.weight = weight;
		this.height = height;
		this.reach = reach;
		this.birthDate = birthDate;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getFighterId() {
		return fighterId;
	}

	public void setFighterId(String fighterId) {
		this.fighterId = fighterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getReach() {
		return reach;
	}

	public void setReach(double reach) {
		this.reach = reach;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	
	
	
	
	
	
}
