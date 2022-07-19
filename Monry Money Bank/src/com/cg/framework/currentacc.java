package com.cg.framework;

public class currentacc extends bankacc {
	
private final float creditlimit;

public currentacc(int accno, String accnm, float accbal, float creditlimit) {
	super(accno, accnm, accbal);
	this.creditlimit = creditlimit;
}

public void withdraw (float creditlimit) {

}
@Override
public String toString() {
	return "currentacc [creditlimit=" + creditlimit +", toString()=" + super.toString() +", getClass()=" + getClass() + ", hashCode()=" +hashCode() +"]";
			}

public float getcreditlimit() {
	// TODO Auto-generated method stub
	return 0;
}
			}

