package Assignment2;

class bankinfo {
	void saving() {
		System.out.println("I have an saving account");
	}
	void fixed() {
		System.out.println("I have an fixed account");

	}
	void deposit() {
		System.out.println("320000");
	}

}

class AxisBank extends bankinfo {
	void deposit() {
		System.out.println("I am depositing 320000 in axis bank");
	}

}

class overriding {

	public static void main(String[] args) {
		AxisBank obj =  new AxisBank();
		obj.deposit();


	}
}