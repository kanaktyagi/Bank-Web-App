package com.test.bean;

import java.io.Serializable;

public class Bank implements Serializable {
	private int bank_id;
	private String bank_name;
	private String bank_ifsc;
	private String bank_branch;
	private String bank_address;
	private String bank_city;
	private String bank_district;
	private String bank_state;
	public int getBank_Id()
	{
		return bank_id;
	}
	public void setBank_Id(int bank_id)
	{
		this.bank_id=bank_id;
	}
	public String getBank_Name()
	{
		return bank_name;
	}
	public void setBank_Name(String bank_name)
	{
		this.bank_name=bank_name;
	}
	public String getBank_Ifsc()
	{
		return bank_ifsc;
	}
	public void setBank_Ifsc(String bank_ifsc)
	{
		this.bank_ifsc=bank_ifsc;
	}
	public String getBank_Branch()
	{
		return bank_branch;
	}
	public void setBank_Branch(String bank_branch)
	{
		this.bank_branch=bank_branch;	
	}
	public String getBank_Address()
	{
		return bank_address;
	}
	public void setBank_Address(String bank_address)
	{
		this.bank_address=bank_address;
	}
	public String getBank_City()
	{
		return bank_city;
	}
	public void setBank_City(String bank_city)
	{
		this.bank_city=bank_city;
	}
	public String getBank_District()
	{
		return bank_district;
	}
	public void setBank_District(String bank_district)
	{
		this.bank_district=bank_district;
	}
	public String getBank_State()
	{
		return bank_state;
	}
	public void setBank_State(String bank_state)
	{
		this.bank_state=bank_state;
	}
	
	
	
	
}

