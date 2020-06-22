package com.test.masivian.testapi.entity;

import java.io.Serializable;


public class Roulette implements Serializable {
	/**
	 * 
	 */
	private int number;
	private String color;
	private boolean status;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}