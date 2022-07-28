package org.system;

class computer{
	void computerModel() {
		System.out.println("Apple iMac");
	}
	
	
}
class desktop extends computer{
	void desktopSize() {
		System.out.println("iMac24");
	}
	
	
}
 class Mytest {
	public static void main ( String[] args){
		desktop c=new desktop();
		c.computerModel();
		c.desktopSize();
		
	}
		
	}


