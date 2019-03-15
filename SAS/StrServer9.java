// 9. Write a program to print whether a number is Krishnamurthy number or not usnig socket programming.
import java.net.*;  //establish connection
import java.io.*;   //reading the message

public class StrServer9{
public static void main(String args[])throws Exception{

ServerSocket s1=new ServerSocket(10000);
System.out.println("...Server Waiting........");

Socket s=s1.accept();
System.out.println(" Create a connection with client ");

String output="";

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
int n=Integer.parseInt(brr.readLine());
int m=n,sum=0,b=1;;

while(m>0){
int d=m%10;
b=1;
for(int i=1;i<=d;i++)
b=b*i;

sum=sum+b;  
m=m/10;
}

System.out.println("The sum of factorial of digits is :"+sum);

if(sum==n)
output="Krishnamurthy Number";
else
output="Not Krishnamurthy Number";


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
H:\Server And Socket Programs>java  StrServer9
...Server Waiting........
 Create a connection with client
The sum of factorial of digits is :145

Output 2:
H:\Server And Socket Programs>java  StrServer9
...Server Waiting........
 Create a connection with client
The sum of factorial of digits is :9
*/