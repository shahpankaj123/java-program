import java.io.*;

public class deserialize{
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("student1.txt");
            ObjectInputStream os =new ObjectInputStream(fis);
            student obj = (student) os.readObject();
            obj.display();
            os.close();
            fis.close();
        }
         catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
		catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }

}