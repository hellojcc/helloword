import java.io.*;
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
	File dir=new File("C:\\Users\\JCC\\Desktop\\�½��ļ���");
	FileAccept acceptCondition=new FileAccept("java");
	File fileName[]=dir.listFiles(acceptCondition);
	for(int i=0;i<fileName.length;i++){
	System.out.printf("\n�ļ����ƣ�%s�����ȣ�%d",fileName[i].getName(),fileName[i].length());
}
	boolean boo=false;
	if(fileName.length>0)
	boo=fileName[0].delete();
	if(boo)
	System.out.printf("\n�ļ���%s��ɾ��",fileName[0].getName());
}
}