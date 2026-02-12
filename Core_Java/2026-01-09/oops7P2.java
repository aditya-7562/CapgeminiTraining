/* 1. Create a base class Person with method:
	showRole() → prints "I am a person"

2. Create two child classes:
	Student extends Person
	Teacher extends Person

3. Create two interfaces:
	Sports → method play()
	Cultural → method perform()

4. Create a class CollegeStudent that:
	Extends Student
	Implements both Sports and Cultural

5. In main():
	Create object of CollegeStudent
	Call all methods

Person
          /   	 \
     Student   Teacher     ← Hierarchical
        |
 CollegeStudent
      /   		 \
  Sports  Cultural         ← Multiple (interfaces)
 */

class Person {
    void showRole() {
        System.out.println("I am a person");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("I am teaching");
    }
}

class Student extends Person {
    void study() {
        System.out.println("I am studying");
    }
}

interface Sports {
    void play();
}

interface Cultural {
    void perform();
}

class CollegeStudent extends Student implements Sports, Cultural {
    @Override
    public void play() {
        System.out.println("I am playing sports");
    }

    @Override
    public void perform() {
        System.out.println("I am performing");
    }
}

public class oops7P2 {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();
        cs.showRole();
        cs.study();
        cs.play();
        cs.perform();
    }
}
