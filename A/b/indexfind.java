public class indexfind{
	public static void main(String []args){
		String a ="dashuodasjavasadasdjavasadjava";
		String b ="java";
		int count = 0;
		int index = 0;
		/*while(index = a.indexOf(b) != -1){
			a = a.subtring(index = a.length());
			count++; */
		while( (index=a.indexOf(b)) != -1){
			a = a.substring(index + b.length());
			count++;		
		}
		
		System.out.println(count);
		
	}
	
	
}