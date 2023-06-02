import java.util.*;


public class Testing {



    public static void main(String[] args){

        int [] arr=new int[10];
        int [] cpy=new int[9];
        
        Scanner scann= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the"+arr[i]+"  element:");
            arr[i]=scann.nextInt();
        }
        System.out.println("array element:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
        System.out.println("\nenter delete index number:");
        int x= scann.nextInt();
        cpy= Delete(arr, x);
        for(int i=0;i<cpy.length;i++){
            System.out.print(cpy[i]+" ");
        }
         
    }
public static int [] Delete(int[] num,int x){
    int [] cpy1=new int[9];

    for(int i=0;i<num.length-1;i++){
        if(x>10 || x<0){
            System.out.println("operation cannot operate");
            break;
        }
        if(i>=x-1){
            cpy1[i]=num[i+1];

        }else{
        cpy1[i]=num[i];}}
    
    return cpy1;


}
}

