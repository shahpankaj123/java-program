class A{

    private int a;
    public void setdata(int a)
    {
        this.a=a;
    }
    public void display()
    {
        System.out.println("a="+a);
    }
    
}
public class example7 {
    public static void main(String [] args)
    {
        A a1=new A();
        a1.setdata(5);
        a1.display();
    }
}
