//swap variable

class swapVar{
	public static void main(String[] args){
		int a = 6;
		int b = 7;
		//int temp = a;
		a = a+b;
		b = a - b;
		a = a - b;
		System.out.println("A = " + a + " " + "B = " + b);
	}
}
