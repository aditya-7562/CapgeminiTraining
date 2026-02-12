/* Loops:
    To execute a block of code multiple times, we use loops.
    1. for loop
    2. while loop
    3. do-while loop
    4. for-each loop

    I - Initialization
    C - Condition
    U - Updation

    1. When we use while loop? 
        We use while loop when we dont know how many times we need to repeat a particular operation.
    2. When we use do-while loop?
        We use while loop when we dont know how many times we need to repeat a particular operation. But we need to run the operation atleast once.
    3. When we use for loop?
        We use for loop when we know the count of operation we need to perform.
*/

public class loops {
    public static void main(String[] args) {
        int a = 1;
        while( a <= 10){
            System.out.println(a);
            a++;
        }

        int b = -111;
        do {
            System.out.println(b);
            b++;
        } while (b <= -101);
    }
}
