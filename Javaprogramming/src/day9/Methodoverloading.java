package day9;

public class Methodoverloading {
	int x;
	int y;
	double z;
	
	void sum()
	{
		x=2;
		y=3;
		System.out.println(x+y);
	}
	void sum(int a,int b)
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
	void sum(int a,double b)
	{
		x=a;
		z=b;
		System.out.println(x+z);
	}
	
	
	

	public static void main(String[] args) {
		Methodoverloading m1=new Methodoverloading();
		m1.sum();
		

	}

}
