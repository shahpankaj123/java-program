import java.net.*;
public class tut25 {
    public static void main(String[] args) throws Exception {
       InetAddress net=InetAddress.getByName("www.pankajshah12.com.np") ;

       System.out.println(net.getHostName());
       System.out.println(net.getHostAddress());
       

       InetAddress[] inet=InetAddress.getAllByName("www.youtube.com");

       for(InetAddress i :inet){
        System.out.println(i.getHostAddress());
       }
    }
}
