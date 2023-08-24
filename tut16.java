class example implements Runnable{
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
public class tut16{
    public static void main(String[] args){
        example e1=new example();
        example e2=new example();

        Thread t1=new Thread(e1);
        Thread t2=new Thread(e2);
        t1.start();
        t2.start();
    }
}