package day5;

public class Arrayreverse {
    public static void main(String[] args) {
        int[] n= {1,2,3,4,5};
        for(int i=n.length;i>=0;i--)
        {
            System.out.println(i);
        }
        int j=n.length;
        while(j>=0)
        {
            System.out.println(j);
            j--;
        }
        int k=n.length;
        do
        {
            System.out.println(k);
            k--;
        }while(k>=0);
    }
}
