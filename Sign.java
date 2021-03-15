import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Sign extends JPanel implements MouseInputListener{
    Point currePoint;
    Point latestPoint;
    Sign(){
        setPreferredSize(new Dimension(500,500));
        addMouseListener(this);
    }
    public void mousePressed(MouseEvent e){
        currePoint = new Point(e.getX(),e.getY());
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        latestPoint = new Point(e.getX(),e.getY());
        Graphics g = getGraphics();
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect((int)currePoint.getX(),(int)currePoint.getY(),(int)latestPoint.getX(),(int)latestPoint.getX());
        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

}
