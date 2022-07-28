package Assignment2;

public class Students {
	
	public void getStudentInfo(int id , String name) {
		System.out.println(id);
		System.out.println(name);
		
	}
	public void getStudentInfo( String email , long Phone) {
		System.out.println(email);
		System.out.println(Phone);
	}

	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(1223, "Brindha");
		obj.getStudentInfo("brindha.christ@gmail.com",745938085);
		

	

}
}
