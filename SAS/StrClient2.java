// 2. Write a program to check whether a String is palindrome or not using Socket Programming.
import java.net.*;
import java.io.*;

public class StrClient2{
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
System.out.println("The String is "+output);

brw.close();
brr.close();
br.close();
s.close();

}
}

/*
Output 1:
H:\Server And Socket Programs>java  StrClient2
Enter a String :
abcdcba
The String is Palindrome

Output 2:
H:\Server And Socket Programs>java  StrClient2
Enter a String :
name
The String is Not Palindrome
*/