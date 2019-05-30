package com.internousdev.manager.dto;

public class ShiftInfoDTO {

	private int id;
	private String title;
	private int partCode;
	private int day;
	private int start;
	private int end;
	private String color;
	private int status;
	private int decided;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPartCode() {
		return partCode;
	}
	public void setPartCode(int partCode) {
		this.partCode = partCode;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getDecided() {
		return decided;
	}
	public void setDecided(int decided) {
		this.decided = decided;
	}


}
