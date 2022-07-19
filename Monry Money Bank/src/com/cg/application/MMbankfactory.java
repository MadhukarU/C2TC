package com.cg.application;

import com.cg.framework.bankfactory;
import com.cg.framework.currentacc;
import com.cg.framework.savingacc;

public class MMbankfactory extends bankfactory 
{

	@Override
	public savingacc getNewsavingacc(int accno, String accnm, float accbal, boolean isSalary) 
	{
		savingacc sa=new savingacc(accno, accnm, accbal, isSalary);
		return sa;
	}

	@Override
	public currentacc getNewcurrentacc(int accno, String accnm, float accbal, float creditlimit)
	{
		currentacc ca=new currentacc(accno,accnm, accbal, creditlimit);
		return ca;
	}
}