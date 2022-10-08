import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String [] args) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> mp = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++)
        {
            int tmp= Integer.parseInt(st.nextToken());
            if(!mp.containsKey(tmp)) mp.put(tmp,1);
            else
            {
                mp.put(tmp,mp.get(tmp)+1);
            }
            
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0;i<m;i++)
        {
            int tmp = Integer.parseInt(st.nextToken());
            if(!mp.containsKey(tmp)) bw.write(0+" ");
            else bw.write(mp.get(tmp) + " ");
        }
        bw.flush();
    }
}
