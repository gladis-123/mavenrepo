package mavenpack2;

public class InstanceDefaultDivision {
	int a=6;
	int b=6;
	int c;
	public void div()
	{
		
		 c=a/b;
		System.out.println("Div is "+c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceDefaultDivision obj=new InstanceDefaultDivision();
		obj.div();
	}

}
