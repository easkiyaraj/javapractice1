package day6;

public class Methods {
    public void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    public void sum(double a,double b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Methods M=new Methods();
        M.sum(11, 11);
        M.sum(10.2,11.3);
    }
}
