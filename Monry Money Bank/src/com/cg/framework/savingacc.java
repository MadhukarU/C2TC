package com.cg.framework;

public abstract class savingacc extends bankacc
{
	private boolean isSalary;
	private static final  float MINBAL=100;

	public savingacc(int accno, String accnm, float accbal, boolean isSalary)
	{
		super(accno, accnm, accbal);
		this.isSalary = isSalary;
	}
	public void withdraw(float accbal)
	{
		System.out.println("Remaining balace after withdraw :"+accbal);	
	}
	@Override
	public String toString() 
	{
		return "savingacc [isSalary=" + isSalary + ", toString()=" + super.toString() + ", getClass()=" + getClass()
		+ ", hashCode()=" + hashCode() + "]";
	}
	public boolean isSalary() 
	{
		return isSalary;
	}
	public void setSalary(boolean isSalary)
	{
		this.isSalary = isSalary;
	}
	public static float getMinbal() 
	{
		return MINBAL;
	}
}