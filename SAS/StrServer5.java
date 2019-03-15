//  5.Write a program to add, substract, multiply, division of two numbers using Socket Programming...
import java.net.*;  //establish connection
import java.io.*;   //reading the message

public class StrServer5{
public static void main(String args[])throws Exception{

ServerSocket s1=new ServerSocket(10000);
System.out.println(".....Server Waiting........");

Socket s=s1.accept();
System.out.println(" Create a connection with client ");

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
int n1=Integer.parseInt(brr.readLine());

BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write("1");
brw.newLine();
brw.flush();

BufferedReader brr1=new BufferedReader(new InputStreamReader(s.getInputStream()));
int n2=Integer.parseInt(brr1.readLine());

BufferedWriter brw1=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw1.write("1");
brw1.newLine();
brw1.flush();


BufferedReader bo=new BufferedReader(new InputStreamReader(s.getInputStream()));
BufferedWriter bn=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

int a=1;
int c=0;
while(a>=1 && a<=4){
a=Integer.parseInt(bo.readLine());
if(a==1)	c=n1+n2;
else if(a==2)	c=n1-n2;
else if(a==3)	c=n1/n2;
else if(a==4)	c=n1*n2;

if(a>=1 && a<=4){
bn.write(String.valueOf(c));
bn.newLine();
bn.flush();
}
}
bn.close();
brw1.close();
brr1.close();
bo.close();
bn.close();
brw.close();
brr.close();
}
}
/*
Output 1:
H:\Server And Socket Programs>java  StrServer5
.....Server Waiting........
 Create a connection with client

Output 2:
H:\Server And Socket Programs>java  StrServer5
.....Server Waiting........
 Create a connection with client
*/