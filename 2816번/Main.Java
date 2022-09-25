import java.util.*;
public class Main{
    
    public static void dg(String []arr)
    {
        int point  =0;
        if(!arr[0].equal("KBS1"))
        while(!arr[0].equal("KBS1") ){
            
            if(arr[point+1].equal("KBS1"))
            {
                System.out.print("1");
                point++;
            }
            else if(arr[point].equal("KBS1"))
            {
                if(point==0){
                    point++;
                    break;
                }
                System.out.print("4");
                swap(point,point-1);
                point--;
            }
            else
            {
                System.out.print("3");
                swap(point,point+1);
                point++;
            }
        }
        else
        while(!arr[1].equal("KBS2"))
        {
            if(arr[point+1].equal("KBS2"))
            {
                System.out.print("1");
                point++;
            }
            else if(arr[point].equal("KBS2"))
            {
                if(point==1)break;
                System.out.print("4");
                swap(point,point-1);
                point--;
            }
            else
            {
                System.out.print("3");
                swap(point,point+1);
                point++;
            }
        }
        
    }

    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in); 
        int n = scanner.nextInt();
        String [] list= new String[n];

        
    }
}