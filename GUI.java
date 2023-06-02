import javax.swing.*;


public class GUI extends JFrame {
    JFrame f;
    JButton b;
    JTextField t;
    public GUI(){
        f=new JFrame("Form");
        b=new JButton("Save");
        t=new JTextField("message");


        f.setSize(600, 500);
        t.setBounds(150,75 , 300, 50);
        b.setBounds(150,200 , 120, 50);
        f.add(b);
        f.add(t);
        f.setVisible(true);
        f.setLayout(null);




    }
    public static void main(String [] args) {
        new GUI();
        
    }
    
}
