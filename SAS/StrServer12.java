//  12. Write a program to print the prime factor of a number using socket programming.
import java.net.*;  //establish connection
import java.io.*;   //reading the message

public class StrServer12{

public static int checkprime(int n){
int p=0;
for(int i=1;i<=n;i++){
if(n%i==0) 
p++;
}
if(p==2)	return 5;
else		return 0;
}

public static void main(String args[])throws Exception{

ServerSocket s1=new ServerSocket(10000);
System.out.println("...Server Waiting........");

Socket s=s1.accept();
System.out.println(" Create a connection with client ");

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
int n=Integer.parseInt(brr.readLine());

String output="";
for(int i=2;i<=n;i++){
if(n%i==0 && checkprime(i)==5)
output=output+String.valueOf(i)+" ";
}

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
H:\Server And Socket Programs>java  StrServer12
...Server Waiting........
 Create a connection with client

Output 2:
H:\Server And Socket Programs>java  StrServer12
...Server Waiting........
 Create a connection with client
*/