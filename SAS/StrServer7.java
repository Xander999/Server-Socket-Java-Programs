// 7. Write a program to print alphabetically sorted word of a sentence using socket programming.
import java.net.*;  //establish connection
import java.io.*;   //reading the message


public class StrServer7{
public static void main(String args[])throws Exception{

ServerSocket s1=new ServerSocket(10000);
System.out.println("...Server Waiting........");

Socket s=s1.accept();
System.out.println(" Create a connection with client ");

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
String st=brr.readLine();

String output="";
st=st.trim();
String d[]=st.split(" ");
int n=d.length;
for(int i=0;i<n;i++){
     for(int j=i+1;j<n;j++){
	if(d[i].compareTo(d[j])>0){
		String h=d[i];
		d[i]=d[j];
		d[j]=h;
}
}
}
for(int i=0;i<n;i++)
output=output+d[i]+" ";

BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write(output);
brw.newLine();
brw.flush();
brw.close();
brr.close();
}
}
/*
H:\Server And Socket Programs>java  StrServer7
...Server Waiting........
 Create a connection with client

H:\Server And Socket Programs>java  StrServer7
...Server Waiting........
 Create a connection with client
*/