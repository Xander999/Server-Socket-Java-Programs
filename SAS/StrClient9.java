// 9. Write a program to print whether a number is krishnamurthy number or not usnig socket programming.
import java.net.*;
import java.io.*;

public class StrClient9{
public static void main(String args[])throws Exception{

Socket s=new Socket("localhost",10000);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a number to check whether it is Krishnamurthy or not.. :");
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
H:\Server And Socket Programs>java  StrClient9
Enter a number to check whether it is Krishnamurthy or not.. :
145
The given number 145 is Krishnamurthy Number

Output 2:
H:\Server And Socket Programs>java  StrClient9
Enter a number to check whether it is Krishnamurthy or not.. :
203
The given number 203 is Not Krishnamurthy Number
*/