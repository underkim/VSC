import java.util.*;
public class 2816{
    public static void swap(String [] arr,int x,int y){
        String tmp = arr[x];
        arr[x]=arr[y];
        arr[y]=tmp;
    }

    public static void dg(String []arr)
    {
        int point  =0;
        
        while(!arr[0].equals("KBS1") ){
         
           
            
             if(arr[point].equals("KBS1"))
            {
                if(point==0){
                    break;
                }
                System.out.print("4");
                swap(arr,point,point-1);
                point--;
            }
            else if(point+1<arr.length&&arr[point+1].equals("KBS1"))
            {
                System.out.print("1");
                point++;
            }
            else
            {
                System.out.print("3");
                swap(arr,point,point+1);
                point++;
            }
        }

        point = 1;
        System.out.print("1");

        while(!arr[1].equals("KBS2"))
        {
            if(point+1<arr.length&&arr[point+1].equals("KBS2"))
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
   
        for(int i = 0 ; i<n;i++){
                String s =scanner.next();
                list[i]=s;
        }
        
        dg(list);
        
    }
}