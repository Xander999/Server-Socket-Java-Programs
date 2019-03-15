// 3. Write a fraction using socket programming
import java.net.*;  //establish connection
import java.io.*;   //reading the message

public class StrServer3{
public static void main(String args[])throws Exception{

ServerSocket s1=new ServerSocket(10000);
System.out.println("...Server Waiting........");

Socket s=s1.accept();
System.out.println(" Create a connection with client ");

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
int n=Integer.parseInt(brr.readLine());

System.out.println("Client Sent Numerator "+n);
BufferedWriter bo=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
bo.write("2");
bo.newLine();
bo.flush();


BufferedReader brr1=new BufferedReader(new InputStreamReader(s.getInputStream()));
int d=Integer.parseInt(brr1.readLine());

int nu=n,de=d;
while(nu!=de){
if(nu>de) nu=nu-de;
else	  de=de-nu;
}

System.out.println("Client Sent Denominator "+d);
//int len=str.length();
//String output=String.valueOf(len);
String output=String.valueOf(nu);

BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write(output);
brw.newLine();
brw.flush();
brw.close();
brr.close();
bo.close();
}
}
/*
Output 1:
H:\Server And Socket Programs>java  StrServer3
...Server Waiting........
 Create a connection with client
Client Sent Numerator 11
Client Sent Denominator 9

Output 2:
H:\Server And Socket Programs>java  StrServer3
...Server Waiting........
 Create a connection with client
Client Sent Numerator 25
Client Sent Denominator 225
*/