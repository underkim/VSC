import java.util.*;
import java.io.*;



public class Main {
    
    public static void main(String [] args) throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    Deque<Integer> deq = new ArrayDeque<>();

    for(int i = 0 ;  i < n; i++)
    {
        String a = br.readLine();
        String s [] = a.split(" ");
        switch(s[0]){

            case "push_front":
                deq.addFirst(Integer.parseInt(s[1]));
                break;
            case "push_back":
                deq.add(Integer.parseInt(s[1]));
                break;
            case "pop_front":
                bw.write((deq.size()>0?deq.remove():-1 )+"\n");
                break;
            case "size":
                bw.write((deq.size())+"\n");
                break;
            case "pop_back":
                bw.write((deq.size()>0?deq.removeLast():-1)+"\n");
                break;
            case "empty":
                 bw.write((deq.size()>0?0:1)+"\n");
                break;
            case "front":
                 bw.write((deq.size()>0?deq.getFirst():-1)+"\n");
                break;
            case "back":
                 bw.write((deq.size()>0?deq.getLast():-1)+"\n");
                break;

        }
        bw.flush();
    }
    bw.close();
    }
}
