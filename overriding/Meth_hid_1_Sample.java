class Meth_Hid_1_Demo{
   public static void testClassMethod() {
      System.out.println("method of super class");
   }
   
   public void testInstanceMethod() {
        System.out.println("The instance method in Superclass");
    }
}

public class Meth_Hid_1_Sample extends Meth_Hid_1_Demo {
   public static void testClassMethod() {
      System.out.println("method of sub class");
   }

   public void testInstanceMethod() {
        System.out.println("The instance method in subclass");
    }

   public static void main(String args[]) {
      Meth_Hid_1_Sample.testClassMethod();

      Meth_Hid_1_Sample obj1 = new Meth_Hid_1_Sample();
      obj1.testInstanceMethod();

      Meth_Hid_1_Demo obj2 = obj1;

      Meth_Hid_1_Demo.testClassMethod();
      obj2.testInstanceMethod();
   }
}