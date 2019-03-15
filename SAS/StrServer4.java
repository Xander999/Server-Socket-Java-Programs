// 4. Write a program to find the maximum of three numbers using Socket Programming.
import java.net.*;  //establish connection
import java.io.*;   //reading the message

public class StrServer4{
public static void main(String args[])throws Exception{

ServerSocket s1=new ServerSocket(10000);
System.out.println("...Server Waiting........");
Socket s=s1.accept();
System.out.println(" Create a connection with client ");
int max=0;
BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
int n=Integer.parseInt(brr.readLine());
max=n;
BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
String jj=String.valueOf(max);
brw.write(jj);
brw.newLine();
brw.flush();

for(int i=0;i<2;i++){
brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
n=Integer.parseInt(brr.readLine());
if(max<n)  max=n;
brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
jj=String.valueOf(max);
brw.write(jj);
brw.newLine();
brw.flush();
}
brw.close();
brr.close();
}
}

/*
Output 1:
H:\Server And Socket Programs>java  StrServer4
...Server Waiting........
 Create a connection with client

Output 2:
H:\Server And Socket Programs>java  StrServer4
...Server Waiting........
 Create a connection with client
*/