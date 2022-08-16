
public class UseStudent {
	public static void main(String[] args ) {
		Student s2=new Student();
		s2.name="Balaji";
		s2.initial='E';
		s2.age=25;
		s2.weight=55.65f;
		s2.aadharNo=6749587485l;
		s2.isEmployed=true;
		s2.mobileNumber=9876543210l;
		
		Student s3=new Student();
		s3.name="Raj";
		s3.initial='F';
		s3.age=26;
		s3.weight=50.35f;
		s3.aadharNo=876573465837l;
		s3.isEmployed=false;
		s3.mobileNumber=9123456789l;
		
		Student s4=new Student();
		s4.name="Varun";
		s4.initial='V';
		s4.age=24;
		s4.weight=60.65f;
		s4.aadharNo=8784654885398l;
		s4.isEmployed=true;
		s4.mobileNumber=95434564678l;
		
		Student s5=new Student();
		s5.name="Mithun";
		s5.initial='E';
		s5.age=27;
		s5.weight=75.65f;
		s5.aadharNo=758972589383l;
		s5.isEmployed=true;
		s5.mobileNumber=9214232456l;
		
		System.out.println(s2.name +" "+s2.initial);
	}

}
