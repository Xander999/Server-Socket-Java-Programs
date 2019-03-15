// 6. Write a program to print word wise reverse a string using socket programming.
import java.net.*;
import java.io.*;

public class StrClient6{
public static void main(String args[])throws Exception{

Socket s=new Socket("localhost",10000);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a String :");
String str=br.readLine();

BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write(str);
brw.newLine();
brw.flush();

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
String output=brr.readLine();

System.out.println(output);
brw.close();
brr.close();
br.close();
s.close();
}
}

/*
Output 1:
H:\Server And Socket Programs>java  StrClient6
Enter a String :
My name is Khan
Khan is name My

Output 2:
H:\Server And Socket Programs>java  StrClient6
Enter a String :
And I  am not a terrorist
terrorist a not am  I And

*/