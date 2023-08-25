import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
 class tut17 extends JFrame implements ItemListener {

    JTextField t;
    JCheckBox c;
    public tut17(){
        setSize(500, 500);
        t=new JTextField();
        t.setColumns(10);
        c=new JCheckBox();

        add(t);
        add(c);

        setLayout(new FlowLayout());
        setVisible(true);

        c.addItemListener(this);

    }

    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==c){
            if(e.getStateChange()==1){
                Font f=new Font("Arial",Font.BOLD,20);
                t.setFont(f);

            }
        }
    }

    public static void main(String[] args) {
        new tut17();
        
    }
    
}
