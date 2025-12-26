// WAJP to convert long -> int -> short -> byte. use value 987654321.

public class recursionProblem6 {
    public static void main(String[] args) {
        long l = 987654321L;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;
        System.out.println("Long value: " + l);
        System.out.println("Converted to Int: " + i);
        System.out.println("Converted to Short: " + s);
        System.out.println("Converted to Byte: " + b);
    }
}
