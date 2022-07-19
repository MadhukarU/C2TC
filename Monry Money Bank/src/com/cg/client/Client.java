package com.cg.client;

import com.cg.application.MMbankfactory;
import com.cg.application.MMcurrentacc;
import com.cg.application.MMsavingacc;
import com.cg.framework.bankfactory;
import com.cg.framework.currentacc;
import com.cg.framework.savingacc;

public class Client {

	private static bankfactory bf;

	public static void main(String[] args) {

		setBf(new MMbankfactory());
		savingacc sa=new MMsavingacc(39736,"SAVING",40000,true);
		currentacc ca=new MMcurrentacc(39736,"Saving",50000,5000);
		sa.withdraw(sa.getaccbal());
		ca.withdraw(ca.getcreditlimit());

	}

	public static bankfactory getBf() {
		return bf;
	}

	public static void setBf(bankfactory bf) {
		Client.bf = bf;
	}

}