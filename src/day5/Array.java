package day5;

public class Array {
    public static void main(String[] args) {
        int[] n= {1,2,3,4,5};
        for(int i=0;i<=n.length;i++)
        {
            System.out.println(i);
        }
        int j=0;
        while(j<=n.length)
        {
            System.out.println(j);
            j++;
        }
        int k=0;
        do {
            System.out.println(k);
            k++;
        }while(k<=n.length);
    }
}
