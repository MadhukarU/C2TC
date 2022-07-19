package com.cg.framework;

public abstract class bankfactory {
public abstract savingacc getNewsavingacc(int accno, String accnm, float accbal, boolean isSalary);
public abstract currentacc getNewcurrentacc(int accno, String accnm, float accbal, float creditlimit);
}