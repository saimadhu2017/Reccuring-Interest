package com.wipro.bank.acc;

public abstract class Account {
	
	int tenure; //Total number of years
	float principal; //Principal amount
	float rateOfInterest; //Interest rate
	
	public void setInterest(int age, String gender) {
		if(gender.equals("Male")) {
			if(age<60) {
				rateOfInterest=(float) 9.8;
			}
			else{
				rateOfInterest=(float) 10.5;
			}
		}
		else{
			if(age<58) {
				rateOfInterest=(float) 10.2;
			}
			else{
				rateOfInterest=(float) 10.8;
			}
		}
	}
	
	
	public float calculateMaturityAmount(float totalPrincipleDeposited,float maturityInterest) {
		return totalPrincipleDeposited+maturityInterest;
	}
	
	public abstract float calculateInterest();
	
	public abstract float calculateAmountDeposited();
}
