//  1.Write a program to print initial of a name using Socket Programs.
import java.net.*;
import java.io.*;

public class StrClient1{
public static void main(String args[])throws Exception{

Socket s=new Socket("localhost",10000);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a name :");
String str=br.readLine();

BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write(str);
brw.newLine();
brw.flush();

BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
String output=brr.readLine();
System.out.println("Initials Of The Name is \n"+output);
brw.close();
brr.close();
br.close();
s.close();
}
}

/*
Output 1:
H:\Server And Socket Programs>java  StrClient1
Enter a name :
Rama Krishna Mission
Initials Of The Name is
R.K.M

Output 2:
H:\Server And Socket Programs>java  StrClient1
Enter a name :
suraj Kumar saha
Initials Of The Name is
S.K.S
*/