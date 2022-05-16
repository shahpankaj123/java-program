import pack2.student;
class C 
{
    int x;
  public void f1()
  {
      System.out.println("your are in parent class:");
  }

}
class D extends C{
    private int x;
    public void f1()
    {
        super.f1();
       super.x=5;
       x=6;
    }
    public void dispaly()
    {
        System.out.println("x="+super.x);
        System.out.println("x="+x);
    }
}
public class example8 {
   public static void main(String [] args)
   {
       student s1=new student();
      D d1=new D();
      s1.setdata("pankaj",20);
      s1.getdata();
      d1.f1();
      d1.dispaly();
   }
}
