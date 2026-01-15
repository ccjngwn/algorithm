import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> stack = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    stack.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (stack.size() == 0) System.out.println("-1");
                    else {
                        System.out.println(stack.get(stack.size() -1));
                        stack.remove(stack.size() - 1);
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    int size;
                    if (stack.size() == 0) size = 1;
                    else size = 0;
                    System.out.println(size);
                    break;
                case "top":
                    if (stack.size() == 0) System.out.println("-1");
                    else System.out.println(stack.get(stack.size() - 1));
            }
        }
    }
}