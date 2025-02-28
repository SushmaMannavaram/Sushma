import java.util.*;
public class mixedbag1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        int ans[]=new int[n+m];
        for(int i=0;i<n;i++)
        arr1[i]=sc.nextInt();
        for(int i=0;i<m;i++)
        arr2[i]=sc.nextInt();
        int p=0;
        for(int i=0;i<n;i++)
        {
            ans[p]=arr1[i];
            p++;
        }
        for(int i=0;i<m;i++)
        {
            ans[p]=arr2[i];
            p++;
        }
        System.out.println(Arrays.toString(ans));
    }
}