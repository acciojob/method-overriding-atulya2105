import java.util.*;
public class Main
{
 static class A
  {
    void meth ()
    {
      System.out.println("Invoking method from class A");
    }
  }
  static class B extends A
  {
    void meth ()
    {
            System.out.println("Method is overridden in Extendend class B");
    }
  }
  public static void main (String[]args)
  {
    //System.out.println ("Hello World");
    B ob = new B();
    ob.meth();
    

  }
}
