class Employee{
    String name;
    int id;
    long monthly_salary;

    public Employee(String name,int id,long monthly_salary){
        this.name=name;
        this.id=id;
        this.monthly_salary=monthly_salary;
    }
    public long getsalary(){
        return this.monthly_salary *12;
    }

}
class Developer extends Employee{
    Boolean field;
    public Developer(String name,int id,int monthly_salary,Boolean field){
        super(name, id, monthly_salary);
        this.field=field;
    }
    public String toString(){
        if(field==true){
        long data= super.getsalary()+5000*12;
        return "Id="+super.id+"\nName="+super.name+"\nAnnual_salary for backend develpoer:"+data;}
        else{
            return "Id="+super.id+"\nName="+super.name+"\nAnnual_salary for frontend develpoer:  "+super.getsalary(); 
        }
    }
}


public class Test2 {
    public static void main(String[] args){
        Developer D = new Developer("ram", 200, 30000, false);
        System.out.println(D);

    }
    
}

