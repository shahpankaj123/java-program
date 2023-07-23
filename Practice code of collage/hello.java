import java.util.Scanner;
public class hello{
    public static void main(String[] args)
    {
        int a,b;

        System.out.println("hello world");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println(a+b);
        int s=a*b;
        System.out.println(s);
    }
}