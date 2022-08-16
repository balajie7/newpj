
public class UseTv {
	public static void main(String[] args) {
		Tv t1=new Tv();
		t1.brand="Samsung";
		t1.price=32000;
		t1.taxPercentage=35;
		t1.netPrice=t1.price+(t1.price*t1.taxPercentage/100);
		t1.rating=9.5f;
		t1.isSmart=true;
		t1.siNo=76457456387l;
		System.out.println(t1.brand+" " +t1.price+" "+t1.taxPercentage+" "+t1.netPrice+" "+t1.rating+" "+t1.isSmart+" "+t1.siNo);
	}

}
