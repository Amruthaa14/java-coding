public class fabino {
    public static void main(String[] args) {
        int n=5;
        //0 1 1 2 3
        int t1=0;
        int t2=1;
        System.out.print(t1+" "+t2+" ");
        int t3=0;
        for(int i=1;i<=n-2;i++)
        {
            t3=t1+t2;
            System.out.print(t3+" ");
            t1=t2;
            t2=t3;
        }

        }
    }

