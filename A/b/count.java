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
		/*���ַ�ʽ��ͨ��isUppercase���ַ�ʽ���жϴ�Сд �޷��жϴ�д���Ƿ�����ĸ
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