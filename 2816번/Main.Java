import java.util.*;
public class Main{
    public static void swap(String [] arr,int x,int y){
        String tmp = arr[x];
        arr[x]=arr[y];
        arr[y]=tmp;
    }

    public static void dg(String []arr)
    {
        int point  =0;
        if(!arr[0].equals("KBS1"))
        while(!arr[0].equals("KBS1") ){
            
            if(arr[point+1].equals("KBS1"))
            {
                System.out.print("1");
                point++;
            }
            else if(arr[point].equals("KBS1"))
            {
                if(point==0){
                    point++;
                    break;
                }
                System.out.print("4");
                swap(arr,point,point-1);
                point--;
            }
            else
            {
                System.out.print("3");
                swap(arr,point,point+1);
                point++;
            }
        }
        else
        while(!arr[1].equals("KBS2"))
        {
            if(arr[point+1].equals("KBS2"))
            {
                System.out.print("1");
                point++;
            }
            else if(arr[point].equals("KBS2"))
            {
                if(point==1)break;
                System.out.print("4");
                swap(arr,point,point-1);
                point--;
            }
            else
            {
                System.out.print("3");
                swap(arr,point,point+1);
                point++;
            }
        }
        
    }

    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in); 
       
        int n = scanner.nextInt();
        
        String [] list= new String[n];

        for(int i = 0 ; i<n;i++)
        list[i]=scanner.next();
        
        dg(list);
        
    }
}