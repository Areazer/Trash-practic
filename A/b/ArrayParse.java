public class ArrayParse{
	public static void main(String[]args){
		String a ="1,2;3,1;2,3;1,2;3,1;2,3";
		String[] aFirst = a.split(";");
		int[][] b;
		b = new int [aFirst.length][];
		for(int i=0;i<aFirst.length;i++){
			//System.out.println(aFirst[i]);
			String aSecond[] = aFirst[i].split(",");
			b[i] = new int [aSecond.length];
			
			for(int j=0;j<aSecond.length;j++){				
				
				b[i][j] = Integer.parseInt(aSecond[j]) ;
				
				
				System.out.print(b[i][j]+" ");
			}
		
			
		}
		
		
		
	}
	
	
}