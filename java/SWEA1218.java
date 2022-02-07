import java.util.Scanner;
import java.util.Stack;

public class SWEA1218 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = 10;
        for (int tc = 1; tc <= T; tc++) {
            Stack<Character> stack = new Stack<>();
            int N = sc.nextInt();
            String str = sc.next();
            int result =0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c==')' && !stack.isEmpty()&&stack.peek()=='(') {
                    stack.pop();

                }
                else if(c==']' && !stack.isEmpty()&&stack.peek()=='[') {
                    stack.pop();

                }
                else if(c=='}' && !stack.isEmpty()&&stack.peek()=='{') {
                    stack.pop();

                }
                else if(c=='>' && !stack.isEmpty()&&stack.peek()=='<') {
                    stack.pop();
                }
                else
                    stack.push(c);
            }
            if(stack.isEmpty()) result = 1;
            System.out.printf("#%d %d",tc,result);
            System.out.println();
        }
    }
}
