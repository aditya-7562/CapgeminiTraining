package main.com.tyss;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int divide(int a, int b) {
		return a/b;
	}
	public boolean isEven(int a) {
        return a % 2 == 0;
    }
	
	public boolean isOdd(int a) {
        return a % 2 != 0;
    }
	
	public String name(String name) {
		if(name.isEmpty()) return null;
		return name;
	}


}
