import java.util.*;
import java.io.*;
public class Main {

    public static void main(String [] args)throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        Stack1 st = new Stack1();
        for(int i = 0 ; i<n;i++)
        {
            String s[]= br.readLine().split(" ");
            switch(s[0]){
                case "push" :
                st.push(Integer.parseInt(s[1]));
                break;
                case "pop" :
                bw.write(st.pop()+"\n");
                break;
                case "size":
                bw.write(st.size()+"\n");
                break;
                case "top":
                bw.write(st.top()+"\n");
                break;
                case "empty": 
                bw.write(st.empty()?"1\n":"0\n");
                break;
            }
            bw.flush();
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