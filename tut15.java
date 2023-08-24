class example extends Thread{
    public void run(){
    try{
        for(int i=0;i<5;i++){
            System.out.println(i);
            Thread.sleep(2000);
        }
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}

public class tut15 {
     public static void main(String[] args) {
        example e1= new example();
        example e2= new example();
        e1.start();
        e2.start();
        
    }
    
}
