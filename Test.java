public class Test{
	public static void main(String args[]){
		int num=0;
		int a=1;
		while(a<=100){
			if(a%3==0){
			 System.out.print(a+" ");
			 num++;
			}
			if(num==5) {
				break;
			 	
			}
			a++;
		}
		
	}
}