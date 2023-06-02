class SemException extends Exception{
    public SemException(String msg){
    super(msg);
}
}
class Student{
    String name;
    int sem;
    public Student(String name,int sem)throws SemException{
        if(sem<1||sem>8){
            throw new SemException("Sem must be between 1&8");
        }
        this.name=name;
        this.sem=sem;
    }
    public void display(){
        System.out.println(name);
        System.out.println(sem);
    }
} 
class test3{
    public static void main(String[] args){
        try{
            Student s=new Student("ab",7);
            s.display();
        }
        catch(SemException e){
            System.out.println(e.getMessage());
            
   }
 }
}