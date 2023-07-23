import java.io.*;
class student implements Serializable{
	String name;
	public student(String name){
		this.name=name;
	}
	public void display(){
		System.out.println(name);
	}
}

public class serialize{
	public static void main(String[] args){
        try{ 
		student s=new student("ram");
        FileOutputStream fos= new FileOutputStream("student1.txt");
        ObjectOutputStream os =new ObjectOutputStream(fos);
        os.writeObject(s);
        os.close();
        fos.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
		catch(IOException e){
            System.out.println(e.getMessage());
        }

	}
}
