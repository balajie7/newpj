
public class UseMobile {
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.brand="Vivo";
		m1.color="Red";
		m1.ram=4;
		m1.displaySize=5.5f;
		m1.simNumber=9876543210l;
		m1.itsTouch=true;
		m1.chargerType='c';
		System.out.println(m1.brand+ " "+m1.color+ " "+m1.ram+ " "+m1.displaySize+" "+m1.simNumber+" "+m1.itsTouch+" "+m1.chargerType);
		System.out.println("BRAND=" +m1.brand+ ",COLOR= "+m1.color+ ",RAM= "+m1.ram+ ",DISPLAY SIZE= "+m1.displaySize+",NUMBER= "+m1.simNumber+",TOUCH= "+m1.itsTouch+",CHARGER= "+m1.chargerType);
	}

}
