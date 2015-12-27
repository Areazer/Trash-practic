import java.io.*;
public class TestBufferStream{
	public static void main(String [] args) throws Exception{
				
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:/java/A/b/c/dota2.txt" ));
		    BufferedReader br = new BufferedReader(new FileReader("C:/java/A/b/c/dota2.txt" ));
		    int c = 0;  //不能写null 空值无法转换为int
			String s = null;
			for(int i=0;i<=100;i++){
				s = String.valueOf(Math.random());
				bw.write(s);
				bw.newLine(); //newLine方法是换行，以方便下一个while循环的内容写入
			}
            bw.flush(); //等待缓冲区内容写入完毕			
			
			
			while((s=br.readLine())!=null){  //注意这一行需要 !==而不是!=
				System.out.print(s);
			}
			br.close();
			bw.close();
		}
		catch(FileNotFoundException e){       //IOException比FileNotFoundException范围要大，要放在后面！
			System.out.println("找不到文件");
			System.exit(-1);
		}
		catch(IOException e){
			e.printStackTrace();
			System.exit(-1);
		}
		
	}
	
}