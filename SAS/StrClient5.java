// 5. Write a program to add, substract, multiply, division of two numbers using Socket Programming...
import java.net.*;
import java.io.*;

public class StrClient5{
public static void main(String args[])throws Exception{

Socket s=new Socket("localhost",10000);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a 1st Number :");
String str=br.readLine();
BufferedWriter brw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw.write(str);
brw.newLine();
brw.flush();

BufferedReader brp=new BufferedReader(new InputStreamReader(s.getInputStream()));
int p=Integer.parseInt(brp.readLine());

System.out.println("Enter a 2nd Number :");
String str1=br.readLine();

BufferedWriter brw1=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
brw1.write(str1);
brw1.newLine();
brw1.flush();

BufferedReader brp1=new BufferedReader(new InputStreamReader(s.getInputStream()));
int q=Integer.parseInt(brp1.readLine());

BufferedReader bo=new BufferedReader(new InputStreamReader(s.getInputStream()));
BufferedWriter bn=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
int a=1;
if(p==1 && q==1){
while(a==1){
System.out.println("Enter \n 1. to add \n 2. to substract \n 3. to divide \n 4. to multiply \n others to exit ");
int n=Integer.parseInt(br.readLine());
switch(n){
case 1: System.out.println("Addition of two numbers is :");
	bn.write("1");
	break;
case 2: System.out.println("Substraction of two numbers is :");
	bn.write("2");
	break;
case 3: System.out.println("Division of two numbers is :");
	bn.write("3");
	break;
case 4: System.out.println("Multiplication of two numbers is :");
	bn.write("4");
	break;
default:System.out.println(".....Server Gets Closed Down......");
	bn.write(String.valueOf(n)); 
	break;
}
bn.newLine();
bn.flush();
String u=bo.readLine();
if(n>4 || n<1){
a=0;          }
else{
System.out.println("Answer is :"+u);
}
}
}
brw.close();
brw1.close();
brp.close();
brp1.close();
br.close();
bo.close();
bn.close();

s.close();

}
}
/*
Output 1:
H:\Server And Socket Programs>java  StrClient5
Enter a 1st Number :
6
Enter a 2nd Number :
3
Enter
 1. to add
 2. to substract
 3. to divide
 4. to multiply
 others to exit
1
Addition of two numbers is :
Answer is :9
Enter
 1. to add
 2. to substract
 3. to divide
 4. to multiply
 others to exit
2
Substraction of two numbers is :
Answer is :3
Enter
 1. to add
 2. to substract
 3. to divide
 4. to multiply
 others to exit
3
Division of two numbers is :
Answer is :2
Enter
 1. to add
 2. to substract
 3. to divide
 4. to multiply
 others to exit
4
Multiplication of two numbers is :
Answer is :18
Enter
 1. to add
 2. to substract
 3. to divide
 4. to multiply
 others to exit
9
.....Server Gets Closed Down......

Output 2:
H:\Server And Socket Programs>java  StrClient5
Enter a 1st Number :
8
Enter a 2nd Number :
5
Enter
 1. to add
 2. to substract
 3. to divide
 4. to multiply
 others to exit
1
Addition of two numbers is :
Answer is :13
Enter
 1. to add
 2. to substract
 3. to divide
 4. to multiply
 others to exit
2
Substraction of two numbers is :
Answer is :3
Enter
 1. to add
 2. to substract
 3. to divide
 4. to multiply
 others to exit
3
Division of two numbers is :
Answer is :1
Enter
 1. to add
 2. to substract
 3. to divide
 4. to multiply
 others to exit
4
Multiplication of two numbers is :
Answer is :40
Enter
 1. to add
 2. to substract
 3. to divide
 4. to multiply
 others to exit
5
.....Server Gets Closed Down......
*/