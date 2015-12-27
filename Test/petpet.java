interface keep{
	public void food();
	public void play();
	
}

class worker implements keep{
	private String name;
	worker(String name){
		this.name = name;		
	}
	
	public void food(){
	System.out.println("worker food pet");	
	}
	
	public void play(){
		System.out.println("worker play pet");
	}
}


class farmer implements keep{
	private String name;
	
	farmer(String name){
		this.name = name;
	}
	
	public void food(){
	System.out.println("farmer food pet");
    }
	
	public void play(){
	System.out.println("farmer play pet");
    }
}


class leader implements keep{
	private String name;
	
	leader(String name){
		this.name = name;		
	}
	
	public void food(){
	System.out.println("leader food pet");	
	}
	
	public void play(){
		System.out.println("leader play pet");
	}
}

public class petpet{
public static void main(String args[]){
	worker w1 = new worker("zhangsan");
	farmer f1 = new farmer("lisi");
	leader l5 = new leader("wangwu");
	w1.food(); f1.food();l5.food();
	w1.play(); f1.play();l5.play();
	
   }
}
