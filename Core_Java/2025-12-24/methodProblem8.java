// 78. Create an overloaded method greet() that:
//	Prints "Hello!" if no argument is passed
//	Prints "Hello, [name]!" if a string argument is passed
//	Prints "Hello, [name]! You are [age] years old." if both name and age are passed

public class methodProblem8 {
    public static void greet(){
        System.out.println("Hello!");
    }
    public static void greet(String name){
        System.out.println("Hello, " + name + "!");
    }
    public static void greet(String name, int age){
        System.out.println("Hello, " + name+"!" + " You are " + age + " years old.");
    }
    public static void main(String[] args) {
        greet();
        greet("Aditya");
        greet("Aditya",24);
    }
}
