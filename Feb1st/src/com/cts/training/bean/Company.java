package com.cts.training.bean;

import java.io.Serializable;

public class Company implements Serializable{

	private static final long serialVersionUID = -6721988738619310856L;
	
	private int id;
	private String name;
	private String sector;
	private String ceoName;
	private String boardOfDirectors;
	private double turnOver;
	
	public Company() {
		
	}

	


	public Company(int id, String name, String sector, String ceoName, String boardOfDirectors, double turnOver) {
		super();
		this.id = id;
		this.name = name;
		this.sector = sector;
		this.ceoName = ceoName;
		this.boardOfDirectors = boardOfDirectors;
		this.turnOver = turnOver;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public double getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(double turnOver) {
		this.turnOver = turnOver;
	}
	

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}




	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}




	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", sector=" + sector + ", ceoName=" + ceoName
				+ ", boardOfDirectors=" + boardOfDirectors + ", turnOver=" + turnOver + "]";
	}




	

}
