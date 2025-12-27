package OOPS.Constructor;

class Animal
      {
          String Name;
          String cast;
          int leg;
          int eye;
          String color;

          Animal()
          {
              System.out.println("This Is ZeroParametarized Constarctor");
          }
          Animal(String Name,String cast,int leg,int eye,String color)
          {
              System.out.println("This Is A Animal Constractor");
              this.cast = cast;
              this.color = color;
              this.leg = leg;
              this.eye = eye;
              this.Name = Name;
          }
      }

public class Constractor {
    public static void main(String args[])
    {
        Animal Tiger  = new Animal();
        //System.out.println(Tiger.Name+" "+Tiger.color+" "+" "+Tiger.leg+" "+Tiger.eye+" "+Tiger.cast);  Default Value

    }
}
