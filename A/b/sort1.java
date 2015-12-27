public class sort1{           //—°‘Ò≈≈–Ú À„∑® È169
	public static void main(String []args){
		int[] a ={4 ,2 ,1 ,9 ,5 ,3 ,6 ,7 ,8};
		int N = a.length;
		
		System.out.println("first");
		
		for(int i=0;i<N;i++){
			System.out.print(a[i]+" ");
		}
		
		for(int i=0;i<N;i++){
			int temp = 0;
			int min  = i;
			for(int j=i+1;j<N;j++){
				
				if(a[j]<a[i]){
					min = j;
					temp = a[i];
					a[i]=a[min];
					a[min]=temp;						
				}
			    //else{break;}
				   
			}
			
		}
		System.out.println("\n");
		System.out.println("after");
		for(int i=0;i<N;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
	}
	
	
}