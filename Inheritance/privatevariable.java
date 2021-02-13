class Base
{
 private int numl;//private member
 public void setData(int n)
 {
numl = n;//private member accessed within the class
 }
 public int getData()
 {
 return numl;
 //System.out.println(numl);//private member accessed within the class
 }
}
 class Derived extends Base
 {
 int num2 ;
 public void product()
 {
 int num =getData();
 System.out.println("product = " + (num2 * num));
 }
 }

public class Code1//PrivateInheritance
 {
 public static void main(String[] args)
 {
 Derived d = new Derived();
d.setData(20) ; //to set private member numl
 d.num2 = 10;
 d.product();
 d.getData();
 }
}
