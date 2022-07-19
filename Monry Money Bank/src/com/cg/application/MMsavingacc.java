package com.cg.application;

import com.cg.framework.savingacc;

public class MMsavingacc extends savingacc 
{
	private static final float MINBAL=2000;

	public MMsavingacc(int accno, String accnm, float accbal, boolean isSalary) 
	{
		super(accno, accnm, accbal, isSalary);

	}

	public void withdraw(float accBal)
	{
		System.out.println("Withdrawl amount:"+accBal);
	}
	@Override
	public String toString()
	{
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	public static float getMinbal() {
		return MINBAL;
	}
}
