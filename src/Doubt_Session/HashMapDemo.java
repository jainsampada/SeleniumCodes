package Doubt_Session;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
public void AddData()
{
	HashMap<Integer,String> data=new HashMap<Integer,String>();
	//Add elements in HashMap
	data.put(1,"Haripriya");
	data.put(2,"Ramandeep");
	data.put(3,"Vishal");
	data.put(4,"Sheetal");
	
	Set set=data.entrySet();//Converting to Set so that we can traverse
	Iterator itr=set.iterator();  
    while(itr.hasNext()){  
        //Converting to Map.Entry so that we can get key and value separately  
        Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());
    }
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapDemo oo=new HashMapDemo();
		oo.AddData();
	}

}
