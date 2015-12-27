public class prime{
	public static void main(String args[]){
		for(int a=101;a<200;a+=2){
			boolean f = true;
			for(int b=2;b<a;b++){
				if(a%b==0){
					f=false;
					break;
				}
			}
			if(!f){
				System.out.print(a+" ");
			}
		}
	}
}