class Animal
{void eat() {System.out.println("Eating");};
}
class Dog extends Animal
{void bark() {System.out.println("Barking");};}

class babyDog extends Dog
{void weep() {System.out.println("Weeping");};}

public class Basic_Multilevel_Inheritance 
{
    public static void main(String args[])
    {babyDog d = new babyDog();
        d.weep();
        d.bark();
        d.eat();
           }
}
