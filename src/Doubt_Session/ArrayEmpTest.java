package Doubt_Session;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEmpTest {
public void  addData()
{
	EmpTest oo=new EmpTest("Kavita", 23, "Testing");
	EmpTest oo1=new EmpTest("Shefali", 21, "SDET");
	EmpTest oo2=new EmpTest("Preeti", 20, ".NET");
	ArrayList<EmpTest> e=new ArrayList<>();
	e.add(oo);
	e.add(oo1);
	e.add(oo2);
	Iterator<EmpTest>  it=e.iterator();
	while(it.hasNext())
	{
		EmpTest st=it.next();
		System.out.println(st.name);
		System.out.println(st.age);
		System.out.println(st.dept);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayEmpTest oo=new ArrayEmpTest();
			oo.addData();
	}

}
