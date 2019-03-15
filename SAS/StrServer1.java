// 1.Write a program to print initial of a name using Socket Programs.
import java.net.*;  //establish connection
import java.io.*;   //reading the message

public class StrServer1{
public static void main(String args[])throws Exception{

ServerSocket s1=new ServerSocket(10000);
System.out.println("...Server Waiting........");

Socket s=s1.accept();
System.out.println(" Create a connection with client ");

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
String st=brr.readLine();

System.out.println("Client Sent "+st);
st=st.trim();
st=st.toUpperCase();
st=" "+st;
int n=st.length();
String w="";
for(int i=0;i<n;i++){
if(st.charAt(i)==' ')
w=w+st.charAt(i+1)+".";
}
w=w.substring(0,(w.length()-1));

BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write(w);
brw.newLine();
brw.flush();
brw.close();
brr.close();
}
}
/*
Output 1:
H:\Server And Socket Programs>java  StrServer1
...Server Waiting........
 Create a connection with client
Client Sent Rama Krishna Mission

Output 2:
H:\Server And Socket Programs>java  StrServer1
...Server Waiting........
 Create a connection with client
Client Sent suraj Kumar saha
*/
