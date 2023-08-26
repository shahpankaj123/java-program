import java.awt.LayoutManager;

import javax.swing.*;

public class tut20 extends JFrame{
    JButton b1,b2,b3,b4;

    public tut20(){
        setSize(500,500 );

        b1=new JButton("1");
        b2=new JButton("1");
        b3=new JButton("1");
        b4=new JButton("1");
        

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        GridLayout g =new GridLayout();

        setLayout(g);
        setVisible(true);

    }
    public static void main(String[] args) {
        new tut20();
        
    }
}
