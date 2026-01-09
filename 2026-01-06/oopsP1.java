// WAJP to create a static method which will return address of the object.

public class oopsP1 {

    public static oopsP1 addr(){
        oopsP1 obj = new oopsP1();
        return obj;
    }
    public static void main(String[] args) {
        System.out.println(addr());
    }
}