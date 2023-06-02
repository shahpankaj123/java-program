class Employee{
    String name;
    int salary;
    public Employee(String name,int salary){
        this.name=name;
        this.salary=salary;

    }
    public String getname(){
        return this.name;
    }
    public int getsalary(){
        return this.salary;
    }
}
class Teacher extends Employee{
  private int No_subject;
  public Teacher(String name,int salary,int No_subject){
    super(name, salary);
    this.No_subject=No_subject;
  }
  public String get_info(){
    long sal=super.getsalary()+this.No_subject*1500;
    String data="Name of Teacher ="+super.getname()+"\nTotal Salary ="+ sal;
    return data;

  }

}
public class Test1 {
    public static void main(String[] args){
        Teacher t1=new Teacher("pankaj shah", 20000, 5);
        System.out.println(t1.get_info());
        

    }
}