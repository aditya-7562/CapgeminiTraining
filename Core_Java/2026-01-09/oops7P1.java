// WAJP to achieve multiple inheritance using interface.

interface Father{
    void show();
}
interface Mother{
    void display();
}
class Child implements Father, Mother{
    @Override
    public void show() {
        System.out.println("This is show method from Father interface.");
    }

    @Override
    public void display() {
        System.out.println("This is display method from Mother interface.");
    }
}
public class oops7P1 {

    public static void main(String[] args) {
        Child ref = new Child();
        ref.show();
        ref.display();
    }
}