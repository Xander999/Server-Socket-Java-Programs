// 6. Write a program to print word wise reverse a string using socket programming.
import java.net.*;  //establish connection
import java.io.*;   //reading the message

public class StrServer6{
public static void main(String args[])throws Exception{

ServerSocket s1=new ServerSocket(10000);
System.out.println("...Server Waiting........");

Socket s=s1.accept();
System.out.println(" Create a connection with client ");

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
String st=brr.readLine();
int i;
st=st.trim();
st=" "+st;
int n=st.length();
String output="";
int p=n;
for(i=n-1;i>=0;i--){
if(st.charAt(i)==' '){
output=output+st.substring(i+1,p)+" ";
p=i;
}
}
output=output.trim();

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
H:\Server And Socket Programs>java  StrServer6
...Server Waiting........
 Create a connection with client

H:\Server And Socket Programs>java  StrServer6
...Server Waiting........
 Create a connection with client
*/