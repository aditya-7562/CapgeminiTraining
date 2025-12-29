/*
String s = "java is a programming language it is a high level programming language" ;

java = 1
is = 2
a = 2
programming = 2
language = 2
it = 1
high = 1
level = 1

NOte: Without using hashmap
*/
public class arrayProblem8 {
    public static void main(String[] args) {
        String s = "java is a programming language it is a high level programming language";
        String[] words = s.split(" ");
        int n = words.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(words[i] + " = " + count);
        }
    }
}
