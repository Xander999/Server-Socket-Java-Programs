// 8. Write a program to print whether a number is magic number or not usnig socket programming.
import java.net.*;  //establish connection
import java.io.*;   //reading the message

public class StrServer8{
public static void main(String args[])throws Exception{

ServerSocket s1=new ServerSocket(10000);
System.out.println("...Server Waiting........");

Socket s=s1.accept();
System.out.println(" Create a connection with client ");

String output="";

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
int n=Integer.parseInt(brr.readLine());
int m=n,sum=0,b=0;

while(m>0){
int d=m%10;
sum=sum+d;  
m=m/10;
}
int mus=sum;
while(mus>0){
int d=mus%10;
b=b*10+d;
mus=mus/10;
}

System.out.println(b+"  "+sum);

if(sum*b==n)
output="Magic Number";
else
output="Not Magic Number";


BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write(output);
brw.newLine();
brw.flush();
brw.close();
brr.close();
}
}
/*
Output 1:
H:\Server And Socket Programs>java  StrServer8
...Server Waiting........
 Create a connection with client
91  19

Output 2:
H:\Server And Socket Programs>java  StrServer8
...Server Waiting........
 Create a connection with client
12  21
*/