
public class UseSaree {
	public static void main(String[] args) {
		Saree s1=new Saree();
		s1.material="Silk";
		s1.colour="Blue";
		s1.prize= 3000;
		s1.barcodeNo=7647563746284l;
		s1.grade='A';
		s1.rating=4.7f;
		s1.itsHeavy=false;
		s1.discountAmount=1000;
		s1.netPrize=(s1.prize-s1.discountAmount);
		
		Saree s2= new Saree();
		s2.material="Cotton";
		s2.colour="Green";
		s2.prize=1500;
		s2.barcodeNo=84564843749l;
		s2.grade='A';
		s2.rating=4.6f;
		s2.itsHeavy=false;
		s2.discountAmount=450;
		s2.netPrize=(s2.prize-s2.discountAmount);
		System.out.println("Material =" +s1.material+":Colour ="+s1.colour+":Netprize ="+s1.netPrize+":Rating="+s1.rating);
		System.out.println("Material =" +s2.material+":Colour ="+s2.colour+":Netprize ="+s2.netPrize+":Rating="+s2.rating);

	}

}
