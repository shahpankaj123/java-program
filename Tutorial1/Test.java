package Tutorial1;
import javax.swing.*;

public class Test extends JFrame {
    JButton b1,b2,b3,b4,b5;
    public Test(){
    
    setSize(1000,500);
    setTitle("Demo");
    b1=new JButton("Button1");
    b2=new JButton("Button2");
    b3=new JButton("Button3");
    b5=new JButton("5");
    b4=new JButton("Long named Button4");

    b1.setBounds(200,100,600,50);
    b1.setBounds(200,200,600,50);
    b1.setBounds(200,300,600,50);
    b1.setBounds(200,400,600,50);
    b1.setBounds(200,500,600,50);

    add(b1);
    add(b2);
    add(b2);
    add(b4);
    add(b5);

    setVisible(true);
    setLayout(null);




}
public static void main(String[] args){
    new Test();
}

    
}
