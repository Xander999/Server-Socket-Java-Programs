//  12. Write a program to print the prime factor of a number using socket programming.
import java.net.*;
import java.io.*;

public class StrClient12{
public static void main(String args[])throws Exception{

Socket s=new Socket("localhost",10000);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a number :");
String str=br.readLine();

BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write(str);
brw.newLine();
brw.flush();

System.out.println("The Prime Factors of "+str+" are :");
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
H:\Server And Socket Programs>java  StrClient12
Enter a number :
105
The Prime Factors of 105 are :
3 5 7

Output 2:
H:\Server And Socket Programs>java  StrClient12
Enter a number :
7532
The Prime Factors of 7532 are :
2 7 269
*/