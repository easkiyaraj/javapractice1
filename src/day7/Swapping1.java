package day7;

public class Swapping1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("before value:"+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After value:"+a+" "+b);
    }
}
