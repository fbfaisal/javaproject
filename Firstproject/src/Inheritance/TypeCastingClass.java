package Inheritance;

public class TypeCastingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		double //4.94065645841246544e-324d to 1.79769313486231570e+308d (positive or negative)
//		float //1.40129846432481707e-45 to 3.40282346638528860e+38 (positive or negative)
//		long //-9223372036854775808 to 9223372036854775807
//		int //-214483648 to 2147483647
//		short//-32768 to 32767		
//		byte//-128 to 127

		
		double D=9999.0;;
		long L=1234;
		int I=456;
		
		//up casting
		D=L;
		System.out.println(D);
	
		//down casting
		I=(int) L;
		System.out.println(I);
		
		//up casting
		Human human=new Doctor("HUMAN");
		Doctor doctor=new Doctor("DOCTOR");
	
		
		//down casting---Human change to Doctor at line31
		
		doctor=(Doctor) human;
	System.out.println(doctor.getName());


	}

}
