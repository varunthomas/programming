import java.io.*;
import java.util.*;

class arraylist{

	public static void main(String[] args){

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(2);
		Iterator it = al.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		System.out.println();
		System.out.println("Size: "+al.size());
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(5);
		al2.add(30);
		al2.add(32);
		al.addAll(al2);
		Iterator it2 = al.iterator();
		while(it2.hasNext())
			System.out.print(it2.next()+" ");
		System.out.println();
		System.out.println("New size: "+al.size());
		al.removeAll(al2);
		Iterator it3=al.iterator();
		while(it3.hasNext())
			System.out.print(it3.next()+" ");
		if(al.contains(12))
			System.out.println("Yes");
		else
			System.out.println("No");
		al.set(1,45);
		Iterator it4 = al.iterator();
		while(it4.hasNext())
			System.out.print(it4.next()+" ");
		System.out.println();
	}

}