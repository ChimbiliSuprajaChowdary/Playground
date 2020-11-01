import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    float weight=sc.nextFloat();
    //sc.nextLine();
    int age=sc.nextInt();
   // sc.nextLine();
    String color=sc.next();
    String breed=sc.next();
    
    Dog d1=new Dog(name,weight,age,color,breed);
    d1.print();
  }
}
class Dog{
String name;
  float weight;
  int age;
 String color;
  String breed;
  Dog(String name,float weight,int age,String color,String breed){
  this.name=name;
    this.weight=weight;
    this.age=age;
    this.color=color;
    this.breed=breed;
  }
  public void print(){
  if(this.weight>0 && this.age>0 && this.name.matches("^[a-zA-Z]*$"))
    System.out.println("Name of the dog: "+name+"\nWeight of the dog: "+weight+"\nAge of the dog: "+age+"\nColor of the dog: "+color+"\nBreed of the dog: "+breed);
   else
     System.out.println("Invalid Input");
  }
}
