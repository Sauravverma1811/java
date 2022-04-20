package illa;
import java.util.*;
public class TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map
		//setinterface
			HashMap m =new HashMap();
			m.put(100, "me");
			m.put(200, "sme");
			m.put(300, "hme");
			Set s=m.entrySet();
			Iterator i=s.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
	}

}
