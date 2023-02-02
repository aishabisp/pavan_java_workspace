package day8;

public class Student {
	int sid;
	String sname;
	char grade;
	void show()
	{
		System.out.println(sid+" "+sname+" "+grade);
		
	}
	void SetData(int id,String name,char g)
	{
	
		sname=name;
		grade=g;
		sid=id;
		
		
		
	}
}
