class Engine{
    boolean engine_type;
    public Engine(boolean engine_type){
        this.engine_type=engine_type;
    }
    public String toString(){
           String data=(this.engine_type?"This is petrol Engine":"this is diesel Engine");
            return data;
       
    }
}
class Car{
    String brand_name;
    long car_price;
    private Engine e;
    public Car(String brand_name,long car_price,Engine e){
        this.brand_name=brand_name;
        this.car_price=car_price;
        this.e=e;

    }
    public String toString(){
        return "Brand_name = "+this.brand_name + "\ncar_price=" + this.car_price +"\n" + this.e;
    }


}
public class Mercedes {
    public static void main(String[] args)
    {
        Engine e1= new Engine(true);
        Car c1=new Car("TATA", 5000,e1);
        System.out.println(c1);



    }
    
}
