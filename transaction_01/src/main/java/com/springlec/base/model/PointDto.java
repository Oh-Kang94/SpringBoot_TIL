package com.springlec.base.model;

public class PointDto {
	
	String id;
	int point;
	
	public PointDto() {
		// TODO Auto-generated constructor stub
	}

	public PointDto(String id, int point) {
		super();
		this.id = id;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
