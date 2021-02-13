import java.util.Scanner;
class Total
{public int a,b,c,d,e, sum; //Declaration of variables
void getData(int x,int y,int z, int m, int n) //Definition of method
{a= x; b= y; c= z; d= m; e= n;}
int add()//Definition of another method
{ sum = a+b+c+d+e; return (sum);}
float per()
{float avg=(sum/5); return (avg); }
}

class Main //Class with main method
{public static void main (String args[])
{int mark;
float score;
for(int i=1; i<=5; i++){
Total s1 = new Total();
System.out.println("Enter the marks, for Student "+ i +": ");
Scanner reader = new Scanner(System.in);
int m1 = reader.nextInt();
int m2 = reader.nextInt();
int m3 = reader.nextInt();
int m4 = reader.nextInt();
int m5 = reader.nextInt();
s1. getData(m1, m2, m3, m4, m5);
mark = s1.add();
score = s1.per();
System.out.println("Total Marks = " + mark);
    System.out.println("Percentage = " + score+"%");}}    }
