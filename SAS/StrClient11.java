// 11. Write a program to check where a String is substring or not using Socket programming.
import java.net.*;
import java.io.*;

public class StrClient11{
public static void main(String args[])throws Exception{

Socket s=new Socket("localhost",10000);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a Sentence :");
String str=br.readLine();
System.out.println("Enter a String  :");
String st=br.readLine();

BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write(str);
brw.newLine();
brw.flush();

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
String p=brr.readLine();

BufferedWriter brw1=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw1.write(st);
brw1.newLine();
brw1.flush();

BufferedReader ou=new BufferedReader(new InputStreamReader(s.getInputStream()));
String output=ou.readLine();

System.out.println(output);

brw1.close();
brw.close();
brr.close();
br.close();
s.close();
}
}
/*
Output 1:
H:\Server And Socket Programs>java  StrClient11
Enter a Sentence :
My name is Khan
Enter a String  :
terrorist
Substring Not Present in Sentence

Output 2:
H:\Server And Socket Programs>java  StrClient11
Enter a Sentence :
My name is khan
Enter a String  :
name
My 'name' is khan

Output 3:
H:\Server And Socket Programs>java  StrClient11
Enter a Sentence :
my name is khan and i am not a terrorist
Enter a String  :
and
my name is khan 'and' i am not a terrorist
*/