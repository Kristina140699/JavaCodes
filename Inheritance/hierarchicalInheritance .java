class Animal
{void eat() {System.out.println("Eating");};
}
class Dog extends Animal
{void bark() {System.out.println("Barking");};}
class Cat extends Animal
{void meow() {System.out.println("Meowing");};}

public class hierarchicalInheritance 
{
    public static void main(String args[])
    {Cat c= new Cat();
        c.meow();
        c.eat();
        //c.bark() //CT error will occure if bark is called bcoz Dog and Cat is of same level class
    }
}
