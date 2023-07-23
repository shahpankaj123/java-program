import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class tut10  extends JFrame implements ActionListener,MouseListener{
    JPopupMenu menu;
    JMenuItem a,b;
    JLabel l;
    public tut10(){
        setSize(500, 500);
        menu= new JPopupMenu(); 
        add(menu);
        a=new JMenuItem("one");
        menu.add(a);
        b=new JMenuItem("two");
        menu.add(b);

        l=new JLabel();
        l.setBounds(300, 100, 150, 150);

        add(l);

        a.addActionListener(this);
        b.addActionListener(this);
        setLayout(null);


        setVisible(true);
        addMouseListener(this);
          
    }
    public void mouseClicked(MouseEvent e){
        menu.show(this,e.getX(), e.getY());

    }
    public void mousePressed(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}

    public static void main(String[] args){
        new tut10();
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==a){
       l.setText("hello and bye");}
       else{
        l.setText("two clicked");
       }
    }


    
}
