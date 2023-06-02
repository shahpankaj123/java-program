public class test_2 {
   public static void main(String[] args) {
    try{
    int a=3;
    int b=0;
    int ans=a/b;
    System.out.println(ans);
   }
   catch(ArithmeticException e){
    System.out.println(e.getMessage());
   }
}
}
