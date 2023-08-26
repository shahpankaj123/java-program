import javax.swing.*;
import java.awt.*;

public class tut21 extends JFrame {
    JButton b1,b2,b3,b4;

    public tut21(){
        setSize(400, 400);

        b1=new JButton("a");
        b2=new JButton("a");
        b3=new JButton("a");
        b4=new JButton("a");

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setVisible(true);

        pack();



    }
    public static void main(String[] args) {
        new tut21();
    }
    
}
