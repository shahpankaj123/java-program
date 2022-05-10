class shape
{
    private int x,y;
    public void setdata(int a,int b)
    {
        x=a;
        y=b;
    }
    public void getdata()
    {
        System.out.println("x="+x);
        System.out.println("y="+y);
    }

};
public class example1 {
    public static void main(String[] args)
    {
       System.out.println("you are in main function");
       shape s1=new shape();
       s1.setdata(5, 10);
       s1.getdata();
    }
    
}
