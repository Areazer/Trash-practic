public class Insertion{
public static void main(String[]args){
	int[] a ={6 ,9 ,2 ,4 ,8 ,7 ,1 ,3 ,5};
	int N = a.length;
	
	System.out.println("Start");
	for(int i=0;i<N;i++){
		System.out.print(a[i]+" ");
	}
	
	for(int i=1;i<N;i++){
		//int min = i;
		for(int j=i;j>0 && a[j-1]>a[j];j-- ){
			int temp =0;
			temp   = a[j-1];
			a[j-1] = a[j];
			a[j]   = temp;			
		}
		
	}
	
	
	System.out.println("\n");
	System.out.println("After");
	for(int i=0;i<N;i++){		
		System.out.print(a[i]+" ");
	}
	
	
	
}
	
}