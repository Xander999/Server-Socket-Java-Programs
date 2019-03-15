// 3. Write a program to Reduce the fraction using Socket Programming
import java.net.*;
import java.io.*;
public class StrClient3{
public static void main(String args[])throws Exception{

Socket s=new Socket("localhost",10000);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a Numerator :");
int a=Integer.parseInt(br.readLine());
String aa=String.valueOf(a);
BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write(aa);
brw.newLine();
brw.flush();

BufferedReader bb=new BufferedReader(new InputStreamReader(s.getInputStream()));
int c=Integer.parseInt(bb.readLine());

System.out.println("Enter a Denominator :");
int d=Integer.parseInt(br.readLine());
String dd=String.valueOf(d);
BufferedWriter brw1=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw1.write(dd);
brw1.newLine();
brw1.flush();

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
int gcd=Integer.parseInt(brr.readLine());
System.out.println("Reduced Fraction is :"+(a/gcd)+"/"+(d/gcd));
brw.close();
brr.close();
bb.close();
brw1.close();
br.close();
s.close();
}
}

/*
Output 1:
H:\Server And Socket Programs>java  StrClient3
Enter a Numerator :
11
Enter a Denominator :
9
Reduced Fraction is :11/9

Output 2:
H:\Server And Socket Programs>java  StrClient3
Enter a Numerator :
25
Enter a Denominator :
225
Reduced Fraction is :1/9
*/