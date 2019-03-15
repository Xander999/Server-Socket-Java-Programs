// 8. Write a program to print whether a number is magic number or not usnig socket programming.
import java.net.*;
import java.io.*;

public class StrClient8{
public static void main(String args[])throws Exception{

Socket s=new Socket("localhost",10000);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a number to check whether it is magic or not.. :");
String str=br.readLine();

BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write(str);
brw.newLine();
brw.flush();

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
String output=brr.readLine();
System.out.println("The given number "+str+" is "+output);
brw.close();
brr.close();
br.close();
s.close();
}
}
/*
Output 1:
H:\Server And Socket Programs>java  StrClient8
Enter a number to check whether it is magic or not.. :
1729
The given number 1729 is Magic Number

Output 2:
H:\Server And Socket Programs>java  StrClient8
Enter a number to check whether it is magic or not.. :
75441
The given number 75441 is Not Magic Number
*/