package com.cg.framework;

public abstract class bankacc
{
	private int accno;
	private String accnm;
	private float accbal;

	public bankacc(int accno, String accnm, float accbal)
	{
		super();
		this.accno = accno;
		this.accnm = accnm;
		this.accbal = accbal;
	}

	public void withdraw(float accbal)
	{
		System.out.println("Available account balance:"+accbal);
	}
	public void deposite(float accbal)
	{
		System.out.println("After depositing available Balance:"+accbal);
	}
	@Override
	public String toString()
	{
		return "BankAcc [accno=" + accno + ", accnm=" + accnm + ", accbal=" + accbal + "]";
	}

	public int getaccno()
	{
		return accno;
	}

	public void setaccno(int accno) 
	{
		this.accno = accno;
	}

	public String getaccnm() 
	{
		return accnm;
	}

	public void setaccnm(String accnm)
	{
		this.accnm = accnm;
	}

	public float getaccbal() 
	{
		return accbal;
	}

	public void setaccbal(float accbal)
	{
		this.accbal = accbal;
	}
}