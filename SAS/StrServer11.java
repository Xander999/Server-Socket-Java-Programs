// 11. Write a program to check where a String is substring or not using Socket programming.
import java.net.*;  //establish connection
import java.io.*;   //reading the message

public class StrServer11{
public static void main(String args[])throws Exception{

ServerSocket s1=new ServerSocket(10000);
System.out.println("...Server Waiting........");

Socket s=s1.accept();
System.out.println(" Create a connection with client ");

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
String str=brr.readLine();

BufferedWriter bo=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
bo.write("");
bo.newLine();
bo.flush();

BufferedReader b=new BufferedReader(new InputStreamReader(s.getInputStream()));
String st=b.readLine();

String output="Substring Not Present in Sentence";
int p;
for(int i=0;i<str.length();i++){
  	p=i;
	int k=0;
	for(int j=0;j<st.length();j++){
		if(st.charAt(j)!=str.charAt(p)){
			break;			
						}
		else{   k++;
			p++;
		    }
				      }

        if(k==st.length()){
		output=str.substring(0,i)+"'"+st+"'"+str.substring((i+st.length()),str.length());
		break;	  }
}


BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write(output);
brw.newLine();
brw.flush();
brw.close();
brr.close();
bo.close();
b.close();
}
}
/*
Output 1:
H:\Server And Socket Programs>java  StrServer11
...Server Waiting........
 Create a connection with client

Output 2:
H:\Server And Socket Programs>java  StrServer11
...Server Waiting........
 Create a connection with client

Output 3:
H:\Server And Socket Programs>java  StrServer11
...Server Waiting........
 Create a connection with client
*/