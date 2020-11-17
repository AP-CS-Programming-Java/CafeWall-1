
import java.awt.*;
class Main {
    public static void main(String[ ] args) {
        DrawingPanel panel = new DrawingPanel(650,400);
        panel.setBackground(Color.GRAY);
        Graphics g = panel.getGraphics();
        drawRowA(g, 0, 0, 20);
        drawRowB(g, 50, 70, 30);
        drawGridD(g, 10, 150, 25);
      }    
    public static void drawBoxPair(Graphics g, int x, int y, int s) {
        g.setColor(Color.BLACK);
        g.fillRect(x,y,s,s);
        g.setColor(Color.WHITE);
        g.fillRect(x+s,y,s,s);
        g.setColor(Color.BLUE);
        g.drawLine(x,y+s,x+s,y);
        g.drawLine(x,y,x+s,y+s);
    }
    public static void drawRowA(Graphics g, int x, int y, int s) {
        for (int i = 0; i<= 4; i++) {
          drawBoxPair(g, x, y, 20);
          x=x+40;
       }
    }
    public static void drawRowB(Graphics g, int x, int y, int s) {
        for (int i = 0; i<= 4; i++) {
          drawBoxPair(g, x, y, s);
          x=x+60;
        }
    } 
    //public static void drawGrid(Graphics g, int x, int y) {
       // for (int i = 0; i<= 4; i++) {
        //  drawRowA(g, x, y);
        //  y=y+20;
        //  x=x+35;
       // }
  //  }
    public static void drawGridD(Graphics g, int x, int y, int s) {
      for (int i = 0; i<= 10; i++);
        drawRowA(g, x, y, 25);
        y=y+25;
    }
}
    
    
    
    
    


