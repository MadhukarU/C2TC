package com.cg.application;

import com.cg.framework.currentacc;

public class MMcurrentacc extends currentacc 
{
	
	public MMcurrentacc(int accno, String accnm, float accbal, float creditlimit) 
	{
		super(accno, accnm, accbal, creditlimit);
	
	}

	public void withdraw(float creditlimit)
	{
		System.out.println("Check the current account balance:" +getaccbal());
	}

	@Override
	public String toString() {
		return "MMcurrentacc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}