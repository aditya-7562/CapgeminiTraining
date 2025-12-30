// WAJP to execute instance initializer block and execute non static method before the execution of main method.

public class oopsP1 {
    // Instance Initializer Block
    {
        System.out.println("Instance Initializer Block executed");
    }
    public static void main(String[] args) {
        System.out.println("Main method start");
        System.out.println("Main method end");
    }
    public void test(){
        System.out.println("Test method executed");
    }
    
    static{
        System.out.println("Static block executed");
        oopsP1 ref = new oopsP1();
        ref.test();
    }
}
