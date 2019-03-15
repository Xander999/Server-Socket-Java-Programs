import java.net.*;
import java.io.*;

public class Client{
public static void main(String args[])throws Exception{

Socket s=new Socket("localhost",10000);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the name of the file :");
String str=br.readLine();

BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write(str);
brw.newLine();
brw.flush();
int a=1;
BufferedWriter bb=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
while(a==1){

String output=brr.readLine();
if(output.equals("-1-1-1")){
a=0;
}
else{
System.out.println(output);
}
bb.write("pp");
bb.newLine();
bb.flush();
}

brw.close();
bb.close();
brr.close();
s.close();
}
}
/*
Output:
H:\Server And Socket Programs\11>java  Client
Enter the name of the file :
terror.txt
My name is Khan And I am not a terrorist.
Mr. President..
I am not a terrorist though
my son was killed
claiming him to be a son of terrorist.
*/