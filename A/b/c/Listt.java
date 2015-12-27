import java.util.*;

public class Listt{
	public static void main(String []args){
		List<String> l1 = new LinkedList<>(); //必须使用泛型
		for(int i=0;i<=5;i++){
			l1.add("a"+i);
						
		}
		
		System.out.println(l1);
		
		l1.add(3,"999");
		System.out.println(l1);
	}
	
	
	
	
}