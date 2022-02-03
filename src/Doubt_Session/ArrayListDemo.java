package Doubt_Session;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	List al=new ArrayList();//Non Generic List
	//ArrayList<Integer> al=new ArrayList<Integer>();//Generic List
public void InsertData()
{
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(3);
	for(Object a:al)
	{
		System.out.println(a);
	}
//	Iterator it=al.iterator();
//	while(it.hasNext())
//	{
//		System.out.println(it.next());
//	}
//	System.out.println(al);
//	System.out.println(al.get(1));
//	System.out.println(al.size());
//	al.remove(2);
//	System.out.println(al);
//	Iterator<Integer> it=al.iterator();
//	while(it.hasNext())
//	{
//		System.out.println(it.next());
//	}
	
	
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemo oo=new ArrayListDemo();
		oo.InsertData();
	}

}
