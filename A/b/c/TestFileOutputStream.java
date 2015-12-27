import java.io.*;
public class TestFileOutputStream{
	public static void main(String[] args){
		FileInputStream  in = null;
		FileOutputStream out= null;
		int b=0;
		try{
			in = new FileInputStream("C:/java/A/b/c/Listt.java");
		    out = new FileOutputStream("C:/java/A/b/c/HW.java");
			while((b=in.read())!=-1){ //注意表达式前半句的小括号
				out.write(b);//该句注意								
			}
			
			in.close();    //这两句不能卸载while循环里面
			out.close();
		}
		catch(FileNotFoundException e1){  //e1参数不能相同
			System.out.println("没有发现文件");	
			System.exit(-1);			
		}
		catch(IOException e2){            //e2参数不能相同
			System.out.println("文件读取错误");
			System.exit(-1);			
		}
			System.out.println("复制成功");
			
		}
		
	}
	
	/*public class testString {
 public static void main(String[] args) {
  FileInputStream in = null;
  FileOutputStream out = null;
  int b = 0;
  try {
   in = new FileInputStream("C:/java/A/b/c/Listt.java");
   out = new FileOutputStream("C:/java/A/b/c/HW.java");
   while ((b = in.read()) != 0) {
    System.out.print(b);
    in.close();
    out.close();
   }
  }
  catch (FileNotFoundException e) {
   System.out.println("没有发现文件");
   System.exit(-1);
  }
  catch (IOException e) {
   System.out.println("文件读取错误");
   System.exit(-1);
  }
  System.out.println("复制成功"); }
}
	
}*/