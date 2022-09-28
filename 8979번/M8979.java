import java.util.*;
public class M8979 {
    
   
    
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in); 
        int country_n=scanner.nextInt();
         int country = scanner.nextInt()-1;
         int[] gold = new int[country_n],silver=new int[country_n],bronze=new int[country_n];
        int cnt =1;
         for (int i = 0 ; i< country_n;i++){
            int cou = scanner.nextInt();
            gold[cou-1] = scanner.nextInt();
            silver[cou-1] = scanner.nextInt();
            bronze[cou-1] = scanner.nextInt();
         }
         
         for(int i = 0 ; i < country_n;i++)
         {
            if(gold[i]>gold[country])
                cnt++;
            
            else if(gold[i]==gold[country] && silver[i]>silver[country])
            
                 cnt++; 
                
                
               
            else if(gold[i]==gold[country] && silver[i] == silver [country]&& bronze[i]>bronze[country])
                cnt ++;
            
         }
         System.out.println(cnt);

    }
}
