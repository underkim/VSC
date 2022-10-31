import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.io.*;
public class Main {
    
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s [] = br.readLine().split(" ");

        int k = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        long line[] = new long [k];  //
        long max =0; //이분탐색 시작 끝값
        for(int i = 0; i<k;i++)
        {
            line[i]=Integer.parseInt(br.readLine());
            if(max < line[i])max=line[i];
        }
        long start=0;
        int cnt ;
        //이분탐색 하여 길이를 나누어 n개로 만들었을 때 경우의 수 
         long mid=max;
        while(true){
           
            cnt =0;
        for(int i = 0; i<k;i++)
        {
            cnt +=line[i]/mid;
        }
        mid = (start+max)/2;
        if(n>cnt){
           max = mid;
        }
        else if(n==cnt) {break;
         }
        else {
            start =mid;
        }
    }
        bw.write(max + "");
        bw.flush();
    }
    
   
}
