import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n ; i++)
        {
            String s[]=br.readLine().split(" ");
            int cnt = 1;
            for( int j = 0 ; j<Integer.parseInt(s[0]);j++)
            {
                String s2[] = br.readLine().split(" ");
                
                if(Integer.parseInt(s2[Integer.parseInt(s[1])]) > Integer.parseInt(s2[j])) cnt++;
            }
            
            bw.write(cnt + "\n");
            bw.flush();
           
        }

    }
}
