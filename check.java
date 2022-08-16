import java.util.ArrayList;
public class check {
	
		public static void main(String[] args) {
			ArrayList<String>temp=new ArrayList<>();
			temp.add("Arul");
			temp.add(null);
			temp.add("Arjun");
			temp.add("Shastik");
			temp.add("Venki");
			
			//System.out.println(temp);
			temp.set(1,"Vanakam da mapla");
			//System.out.println(temp);
			//System.out.println(temp.get(2));
			
			temp.add(0,"Hi All");
			//System.out.println(temp);
			//System.out.println(temp.size());
			
			temp.set(2,"hi");
		//	System.out.println(temp);
			
			temp.remove(1);
		//	System.out.println(temp);
			
			temp.add(1,"Arul");
			//System.out.println(temp);
			
			temp.set(2,"Editing");
			//System.out.println(temp);
			
			//System.out.println();
			
			for(int i=0;i<temp.size();i++) {
				//System.out.println(temp.get(i));
			}
			
			//System.out.println();
			
			for(String z:temp) {
			//	System.out.println(z);
			}
			
			//System.out.println();
			
			temp.forEach(z-> System.out.println(z));
			
			//System.out.println();
			
			temp.stream().map(x-> x.toLowerCase()).forEach(y-> System.out.println(y));
			
			//System.out.println();
			
		//temp.stream().map(w-> w.toUpperCase());
			
			for(String w:temp) {
				System.out.println(w.toUpperCase());
			}
			
			
			
				
		}
	

}
