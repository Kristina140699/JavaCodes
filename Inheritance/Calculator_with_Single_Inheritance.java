class Calculation{
    int z;
    public void add(int x, int y)
    {z =x+y;
        System.out.println("The sum of the given numbers:"+z);    }
    public void sub(int x, int y){
        z=x-y;
        System.out.println("The difference Between the given numbers:"+z);   } }
  // public class Main extends Calculation{
   public class Calculator_with_Single_Inheritance extends Calculation{
   public void pro(int x, int y){
        z=x*y;
        System.out.println("The product of the given numbers:"+z);    }
    public static void main(String args[])
    {int a=20, b=10;
   Calculator_with_Single_Inheritance demo= new Calculator_with_Single_Inheritance();
    demo.add(a,b);
    demo.sub(a,b);
    demo.pro(a,b);
    }
}
