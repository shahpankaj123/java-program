class Employee{
    String name;
    int roll;
    public Employee(String name,int roll){
        this.name=name;
        this.roll=roll;

    }
    public String toString()
    {
        String data ="Name= "+this.name+" \nRoll_number="+this.roll;
        return data;

    }
}

public class Test {
    public static void main(String[] args){
        Employee e1= new Employee("pankaj", 2);
        System.out.println(e1);

    }
}
