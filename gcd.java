public class gcd{
	public static int gcd(int p,int q){
	p = 6;q=114;
	if(q==0) return p;
		
	int r = p%q;
	return gcd(q,r);
	
}
}