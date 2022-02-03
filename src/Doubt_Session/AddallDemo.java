package Doubt_Session;

import java.util.ArrayList;

public class AddallDemo {
	ArrayList<Integer> al = new ArrayList<Integer>();// Generic List
	ArrayList<Integer> al1 = new ArrayList<Integer>();

	public void InsertData() {
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al);
		System.out.println(al.get(1));
		al1.add(4);
		al1.add(5);
		al1.add(6);
		al.addAll(al1);
		System.out.println(al);
	}

public	static void main(String[] args) {
		// TODO Auto-generated method stub
		AddallDemo oo = new AddallDemo();
		oo.InsertData();
	}

}
