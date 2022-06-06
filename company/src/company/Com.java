package company;

public class Com {
	String name;

public static void main(String[] args) {
	// object
	Com c1= new Com();
	c1.name ="C2TC";
	Com c2=c1;
	c1=null;
	System.out.println(c2.name);
	Com c3=new Com();
	c3.name="C2TC";
			System.out.println(c3.name);
	
}
}

