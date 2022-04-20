package illa;
import java.util.*;

public class ArrayList {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//LinkedList l=new LinkedList();
		//List l= new List();
		//ArrayList l=new ArrayList();
		//Set l=new Set();		//
		//Hashset l= new Hashset(); //no dup ,no order
		//LinkedHashset l= new LinkedHashset(); //no dup,user entered order
		TreeSet<Object> l= new TreeSet<Object>(); //no dup and sorted order




		l.add(3);
		l.add(6);
		l.add(7);
		//l.addFirst(18);
		Iterator i=  l.iterator();
		while(i.hasNext())
	{
		System.out.println(i.next());

	}

}
}
