import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class en{
	public static void main(String args[])throws Exception{
	Runtime ce=Runtime.getRuntime();
	ce.exec("javac en1.java");
	File f=new File("C:\\Users\\JCC\\Desktop","微信.exe");
	ce.exec(f.getAbsolutePath());
}
}

/*import java.io.*;
class FileAccept implements FilenameFilter{
	String str=null;
	FileAccept(String s){
	str="."+s;
}
	public boolean accept(File dir,String name){
	return name.endsWith(str);
}
}
public class en{
	public static void main(String args[]){
	File dir=new File("C:\\Users\\JCC\\Desktop\\新建文件夹");
	FileAccept acceptCondition=new FileAccept("java");
	File fileName[]=dir.listFiles(acceptCondition);
	for(int i=0;i<fileName.length;i++){
	System.out.printf("\n文件名称：%s，长度：%d",fileName[i].getName(),fileName[i].length());
}
	boolean boo=false;
	if(fileName.length>0)
	boo=fileName[0].delete();
	if(boo)
	System.out.printf("\n文件：%s被删除",fileName[0].getName());
}
}*/

/*interface Com{
	int add(int a,int b);
}
abstract class A{
	abstract int add(int a,int b);
}
class B extends A implements Com{
	public int add(int a,int b){
		return a+b;
}
	double add(double a,double b){
		return a-b;
}
}
public class en{
	public static void main(String args[]){
		B b=new B();
		Com com=b;
		System.out.println(com.add(12,6));
   		A a=b;
		System.out.println(a.add(12,6));
}
}*/

/*import java.util.*;
public class en{
	public static void main(String args[]){
		int sum=0; r=new Scanner(System.in);
		while(scanner.hasNextInt()){
		int x=scanner.nextInt();
		sum+=x;
		if(sum>100)  System.exit(0);
		System.out.println(sum);}
}
}*/