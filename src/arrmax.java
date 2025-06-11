import java.util.*;
public class arrmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        { int temp=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print(arr[n-1]);
        for(int i=0;i<n;i++)
        {
          System.out.print(arr[i]);
        }
        int max=0;
for(int i=0;i<n;i++)
{
    if(arr[i]>max)
    {
        max=arr[i];
    }
}
        System.out.print(max);
    }
}
