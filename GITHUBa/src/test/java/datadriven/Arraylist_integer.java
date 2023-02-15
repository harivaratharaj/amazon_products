package datadriven;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class Arraylist_integer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> num=new ArrayList<>();//Creating arraylist
num.add(3);
num.add(5);
num.add(23);
num.add(234);
num.add(2314252);
{
System.out.println("integerarraylist: "+num);
System.out.println("***");
}
@SuppressWarnings("unused")
List<Integer> duplicate=new ArrayList<Integer>();
duplicate.addAll(num);
System.out.println("print the duplicate :"+duplicate);
{
	System.out.println("num list can take the clone:"+num.clone());
}

{
int str= num.get(3);
System.out.println("elements of index 3: "+str);
System.out.println("***");
}{
num.set(2, 233);
System.out.println("modified integerarraylist: "+num);
System.out.println("***");
}{
int in=num.remove(4);
System.out.println("changed integerarraylist: "+num);
System.out.println("removed integer: "+in);
}
num.add(2,77);
System.out.println("add new elements in index2: "+num);
{
	
	Iterator<Integer> itr=num.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("----------");
	for (Integer integer : num) {
	 System.out.println(integer);	
	}
	System.out.println("----------");
	 int size=num.size();
	 System.out.println(size);
	for(int i=0;i<size;i++)
	{
		System.out.println(i);
	}
}
	}

}


