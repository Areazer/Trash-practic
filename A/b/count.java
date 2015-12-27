public class count{
	public static void main(String [] args){
		String srt ="sdasSdDADddkpkDadL<Xasdlasd5445";
		int b=0;int s=0;
		
		for(int i=0;i<srt.length();i++){
			char c = srt.charAt(i);
			if(c >='A'&&c <= 'Z'){
				b++;
				
			}
			if(c <= 'a'&& c<= 'Z'){
				s++;
			}
			
		}
		/*这种方式是通过isUppercase这种方式来判断大小写 无法判断大写的是否是字母
		for(int i=0;i<srt.length();i++){
			char c = srt.charAt(i);
			if(Character.isUpperCase(c)){
				b++;
				
			}
			if(Character.isLowerCase(c)){
				s++;
			}
			
		}*/
		System.out.print("big="+ b+"\n");
		System.out.print("small="+ s);
	}
	
}