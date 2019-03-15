// 7. Write a program to print alphabetically sorted word of a sentence using socket programming.
import java.net.*;
import java.io.*;

public class StrClient7{
public static void main(String args[])throws Exception{

Socket s=new Socket("localhost",10000);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a Sentence :");
String str=br.readLine();

BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write(str);
brw.newLine();
brw.flush();

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
String output=brr.readLine();
System.out.println("Alphabetically Sorted Word Of Sentence :");
System.out.println(output);

brw.close();
brr.close();
br.close();
s.close();
}
}
/*
Output 1:
H:\Server And Socket Programs>java  StrClient7
Enter a Sentence :
My name is Khan
Alphabetically Sorted Word Of Sentence :
Khan My is name

Output 2:
H:\Server And Socket Programs>java  StrClient7
Enter a Sentence :
My name is Khan And I am not a terrorist
Alphabetically Sorted Word Of Sentence :
And I Khan My a am is name not terrorist
*/