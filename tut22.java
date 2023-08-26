import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class tut22 extends JFrame implements ActionListener {
    
    JButton b1,b2,b3;
    CardLayout crd;
    Container cn;

    public tut22(){
        
        setSize(400, 400);
        cn=getContentPane();
        
        b1=new JButton("a");
        b2=new JButton("b");
        b3= new JButton("c");

        cn.add(b1);
        cn.add(b2);
        cn.add(b3);

        crd=new CardLayout();

        cn.setLayout(crd);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent e){
        crd.next(cn);
    }

    public static void main(String[] args) {
        new tut22();
    }

    
}
