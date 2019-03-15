// 4. Write a program to find the maximum of three numbers using Socket Programming.
import java.net.*;
import java.io.*;

public class StrClient4{
public static void main(String args[])throws Exception{
int i=0;
Socket s=new Socket("localhost",10000);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Number no."+(i+1)+" :");
String str=br.readLine();
BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write(str);
brw.newLine();
brw.flush();
String max="";
BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
max=brr.readLine();

for(i=1;i<=2;i++){
System.out.println("Enter Number no."+(i+1)+" :");
str=br.readLine();
brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write(str);
brw.newLine();
brw.flush();
brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
max=brr.readLine();
                      }

System.out.println("Max of three numbers :"+max);

brw.close();
brr.close();
br.close();
s.close();
}
}

/*
Output 1:
H:\Server And Socket Programs>java  StrClient4
Enter Number no.1 :
5
Enter Number no.2 :
7
Enter Number no.3 :
2
Max of three numbers :7

Output 2:
H:\Server And Socket Programs>java  StrClient4
Enter Number no.1 :
11
Enter Number no.2 :
119
Enter Number no.3 :
1
Max of three numbers :119
*/