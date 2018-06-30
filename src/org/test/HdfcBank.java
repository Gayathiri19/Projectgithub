package org.test;

public class HdfcBank implements AxisBank {

	@Override
	public void bankDet() {
		System.out.println("bank deatils");
		
	}

	@Override
	public void loanAcct() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		HdfcBank h=new HdfcBank();
		h.bankDet();
	}

	 

	
	
}
