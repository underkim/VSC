import java.util.*;

public class Main {
    
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i< N ; i++)
        {
            int tmp = scanner.nextInt();
            if (tmp ==0)
            {
                if(!st.empty())st.pop();
            }
            else st.push(tmp);
        }
        int sum = 0;
        for(int i : st)
        {
            sum +=i;
        }
        System.out.println(sum);
}
}