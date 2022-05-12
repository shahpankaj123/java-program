package pack2;
public class student {
    private int roll;
    private String name;
    public void setdata(String a,int b)
    {
       name=a;
       roll=b;
    }
    public void getdata()
    {
        System.out.println("Name:"+name);
        System.out.println("roll number:"+roll);
    }
}
