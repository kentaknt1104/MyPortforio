package com.internousdev.manager.dto;

public class UserInfoDTO {

	String userName;

	int partCode;

	int adminFlg;

	boolean loginFlg = false;

	int day;

	int startHour;

	int finishHour;

	String color;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPartCode() {
		return partCode;
	}

	public void setPartCode(int partCode) {
		this.partCode = partCode;
	}

	public int getAdminFlg() {
		return adminFlg;
	}

	public void setAdminFlg(int adminFlg) {
		this.adminFlg = adminFlg;
	}

	public boolean getLoginFlg() {
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getStartHour() {
		return startHour;
	}

	public void setStartHour(int startHour) {
		this.startHour = startHour;
	}

	public int getFinishHour() {
		return finishHour;
	}

	public void setFinishHour(int finishHour) {
		this.finishHour = finishHour;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


}
