/*
    WAJP to print characters in the range
    s to l
    T to Z
    by using do while loop
*/

public class doWhileLoopProblem2 {
    public static void main(String[] args) {
        System.out.println("******************** s to l *************************");
        char c = 's';
        do{
            System.out.println(c);
            c--;
        }
        while(c >= 'l');
        System.out.println("******************** T to Z *************************");
        char d = 'T';
        do{
            System.out.println(d);
            d++;
        }
        while(d <= 'Z');
        
    }
}
