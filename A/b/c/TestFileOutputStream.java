import java.io.*;
public class TestFileOutputStream{
	public static void main(String[] args){
		FileInputStream  in = null;
		FileOutputStream out= null;
		int b=0;
		try{
			in = new FileInputStream("C:/java/A/b/c/Listt.java");
		    out = new FileOutputStream("C:/java/A/b/c/HW.java");
			while((b=in.read())!=-1){ //ע����ʽǰ����С����
				out.write(b);//�þ�ע��								
			}
			
			in.close();    //�����䲻��ж��whileѭ������
			out.close();
		}
		catch(FileNotFoundException e1){  //e1����������ͬ
			System.out.println("û�з����ļ�");	
			System.exit(-1);			
		}
		catch(IOException e2){            //e2����������ͬ
			System.out.println("�ļ���ȡ����");
			System.exit(-1);			
		}
			System.out.println("���Ƴɹ�");
			
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
   System.out.println("û�з����ļ�");
   System.exit(-1);
  }
  catch (IOException e) {
   System.out.println("�ļ���ȡ����");
   System.exit(-1);
  }
  System.out.println("���Ƴɹ�"); }
}
	
}*/