package Doubt_Session;

import java.util.HashSet;

public class HashSetDemo {
	HashSet<Integer> set=new HashSet<>();
public void AddData()
{
	set.add(1);
	set.add(2);
	set.add(2);
	set.add(3);
	set.add(4);
	System.out.println(set);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetDemo oo=new HashSetDemo();
		oo.AddData();
	}

}
