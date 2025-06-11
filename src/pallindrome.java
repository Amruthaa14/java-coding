public class pallindrome {
    public static void main(String[] args) {
        String str="madam";
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        System.out.print(rev);
        if(rev.equals(str))
        {
            System.out.print("pallllinrdrome");
        }
        else
        {
            System.out.print("no pallllinrdrome");
        }
    }
}
