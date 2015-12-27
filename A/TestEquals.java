public class TestEquals{
	public static void main(String []args){
		Tiger a1 = new Tiger(1,2,3);
		Tiger a2 = new Tiger(1,2,3);
		System.out.println(a1 == a2);
		//System.out.println(a1.equals(a2));
	}
}
	
	class Tiger{
		int color;
		int age;
		int name;
		
		public Tiger(int color,int age,int name){
			this.color = color;
			this.age = age;
			this.name = name;
			
			
		}
			
	  public boolean equals(Object obj){
	  	if(obj==null){
	  		return false;	
	  		}
	  		
	  	else{
	  		if(obj instanceof Tiger){
	  			  Tiger a = (Tiger)obj;
	  				if(a.color == this.color && a.name  == this.name && a.age == this.age)
	  				{
	  					return true;
	  					}	
	  				
	  				
	  		}
	  	
	  	}
	  		return false;
	  }
	  	
	  	
	 }


