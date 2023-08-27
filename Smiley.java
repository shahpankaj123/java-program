import javax.swing.*;
import java.awt.*;
class Smiley extends JFrame {
public Smiley(){
setSize(400,400);
setVisible(true);
}
public void paint(Graphics g){
// set the color
g.setColor(Color.YELLOW);
// draw a round face using fillOval
g.fillOval(100, 100, 200, 200);
// change the color to black to draw eyes
g.setColor(Color.BLACK);
// draw the left eye, keep x coordinate less than the right eye
g.fillOval(150,170,20,20);
// draw the right eye, the x coordinate must be more
g.fillOval(220, 170, 20, 20);
// draw an arc to create smiley; if the smiley is sad the starting angle must be 0
g.drawArc(150, 230, 100, 50, 0, 180);
// incase you want to draw a happy face, change the starting angle and adjust the y-coordinate
// g.drawArc(150, 200, 100, 50, 180, 180);
}
public static void main(String [] args){
new Smiley();
}
}

