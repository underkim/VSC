import java.util.*;

public class Main {

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Stack1 st = new Stack1();
        for(int i = 0 ; i<n;i++)
        {
            String s= scanner.next();
            switch(s){
                case "push" :
                st.push(scanner.nextInt());
                break;
                case "pop" :
                st.pop();
                break;
                case "size":
                st.size();
                break;
                case "top":
                st.top();
                break;
                case "empty": 
                st.empty();
                break;
            }
        }
    }
}

class stackNode
{   int x;
    stackNode prev=null;
    static stackNode top =null;
    static int cnt=0;
    public void set(int x)
    {
        this.x = x;
    }

}

class Stack1
{
    
    stackNode sn;

    public void push(int x){

        sn = new stackNode();
        sn.set(x);
        stackNode.cnt++ ;
        if(stackNode.top == null){
             stackNode.top = sn;
        }
        else 
        {
            sn.prev = stackNode.top;
            stackNode.top = sn;
        }
    }

    public int pop(){
        if(empty())return -1;
        else{
            int tmp =stackNode.top.x;
            stackNode.top = stackNode.top.prev;
            stackNode.cnt--;
            return tmp;
        }
    }

    public boolean empty()
    {
        if(stackNode.top==null)return true;
        else return false;
    }

    public int size(){
        if(empty())return 0;
        else return stackNode.cnt;
    }

    public int top(){
        if(empty()) return -1;
        else return stackNode.top.x;
    }
}