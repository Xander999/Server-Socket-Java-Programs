// 2. Write a program to check whether a String is palindrome or not using Socket Programming.
import java.net.*;  //establish connection
import java.io.*;   //reading the message

public class StrServer2{
public static void main(String args[])throws Exception{

ServerSocket s1=new ServerSocket(10000);
System.out.println("...Server Waiting........");

Socket s=s1.accept();
System.out.println(" Create a connection with client ");

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
String str=brr.readLine();

System.out.println("Client Sent String :"+str);
int len=str.length();
int p=0;
for(int i=0;i<len;i++){
if(str.charAt(i)!=str.charAt(len-i-1))
p++;
}

String output;
if(p==0)
output="Palindrome";
else
output="Not Palindrome";

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
H:\Server And Socket Programs>java  StrServer2
...Server Waiting........
 Create a connection with client
Client Sent String :abcdcba

Output  2:
H:\Server And Socket Programs>java  StrServer2
...Server Waiting........
 Create a connection with client
Client Sent String :name

*/