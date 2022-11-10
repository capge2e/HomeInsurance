package com.abc.insurance.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HomeInsurance")
public class HomeInsurance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int houseNo;
	private String houseRegisteredPersonName;
	private int houseCost;
	private int noOfFloors;
	private float squareFeet;
	private int premium;
	private int sumInsured;
	public HomeInsurance(String houseRegisteredPersonName, int houseCost, int noOfFloors, float squareFeet,
			int premium, int sumInsured) {
		super();
		this.houseRegisteredPersonName = houseRegisteredPersonName;
		this.houseCost = houseCost;
		this.noOfFloors = noOfFloors;
		this.squareFeet = squareFeet;
		this.premium= premium;
		this.sumInsured = sumInsured;
	}
	
	

}//end class
