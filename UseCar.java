
public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.brand="Audi";
		c1.colour="White";
	    c1.prize=4500000;
	    c1.taxAmount=250000;
		c1.netPrize=c1.prize+c1.taxAmount;
		c1.engNo=686538763747l;
		c1.batType='B';
		c1.isPetrol=true;
	    c1.km=45.50f;
	    
	    Car c2=new Car();
		c2.brand="Audi";
		c2.colour="Black";
	    c2.prize=5000000;
	    c2.taxAmount=250000;
		c2.netPrize=c2.prize+c2.taxAmount;
		c2.engNo=546847928484l;
		c2.batType='A';
		c2.isPetrol=true;
	    c2.km=48.30f;
	    
	    Car c3=new Car();
		c3.brand="BMW";
		c3.colour="Blue";
	    c3.prize=4000000;
	    c3.taxAmount=200000;
		c3.netPrize=c3.prize+c3.taxAmount;
		c3.engNo=908986755940l;
		c3.batType='C';
		c3.isPetrol=false;
	    c3.km=43.50f;
	    System.out.println("BRAND:"+c1.brand+"::NET PRIZE:"+c1.netPrize+"::ENG NO:"+c1.engNo+"::PETROL:"+c1.isPetrol+"::COLOUR:"+c1.colour);
	    System.out.println("BRAND:"+c2.brand+"::NET PRIZE:"+c2.netPrize+"::ENG NO:"+c2.engNo+"::PETROL:"+c2.isPetrol+"::COLOUR:"+c2.colour);
	    System.out.println("BRAND:"+c3.brand+"::NET PRIZE:"+c3.netPrize+"::ENG NO:"+c3.engNo+"::PETROL:"+c3.isPetrol+"::COLOUR:"+c3.colour);
	    
	    
	}

}
