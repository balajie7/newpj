
public class UseBottle {
	public static void main(String[] args) {
		
		WaterBottle w1=new WaterBottle();
		w1.brand="Milton";
		w1.prize=800;
		w1.rating=9.5f;
		w1.isdamaged=false;
		w1.barcode=8764473678547l;
		w1.grade='A';
		System.out.println(w1.brand +" "+w1.prize+" "+w1.rating+" "+w1.isdamaged+" "+w1.barcode);
	}

}
