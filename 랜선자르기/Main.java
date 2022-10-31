import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s [] = br.readLine().split(" ");

        int k = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        int line[] = new int [k];
        int sum = 0;
        for(int i = 0; i<k;i++)
        {
            line[i]=Integer.parseInt(br.readLine());
            sum +=line[i];
        }
        
        int max = sum /n;
        int res=0;
        for(int i = max;i>0;i--)
        {
            int cnt= 0;
            for(int j =0; j<k;j++)
            {
                cnt += line[j]/i;
            }
            if(cnt==n){
                res = i;
                break;
            }
        }
        bw.write(res + "");
        bw.flush();
    }
}
