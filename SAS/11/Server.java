import java.net.*;  //establish connection
import java.io.*;   //reading the message
import java.util.*;

public class Server{
public static void main(String args[])throws Exception{

ServerSocket s1=new ServerSocket(10000);
System.out.println("...Server Waiting........");

Socket s=s1.accept();
System.out.println(" Create a connection with client ");

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
String st=brr.readLine();
BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));

String output="";
Scanner in=new Scanner(new File(st));
while(in.hasNextLine()){
String t=in.nextLine();
brw.write(t);
brw.newLine();
brw.flush();

String sm=br.readLine();
}

brw.write("-1-1-1");
brw.newLine();
brw.flush();

brw.close();
brr.close();
br.close();
}
}
/*
Output :

H:\Server And Socket Programs\11>java  Server
...Server Waiting........
 Create a connection with client
*/