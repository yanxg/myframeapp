/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myframeapp;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
/**
 *
 * @author xiaogang
 */
public class TablePanel extends JPanel{
    
    private Diner diner1, diner2, diner3, diner4, diner5, diner6; // create six objects to denote different tables 
    private final int XPOSITION = 400; // set a final variable to denote position and is shared with different diners 
    private final int YPOSITION = 400;
    
    /** constructor is a special method and thus should include brackets; 
     its function is to create different instances */
    public TablePanel(){
       diner1 = new Diner(XPOSITION-55, YPOSITION-210, "David", 1, Color.RED);
       diner2 = new Diner(XPOSITION+60, YPOSITION-100, "Clare", 2, Color.BLUE);
       diner3 = new Diner(XPOSITION+60, YPOSITION, "Michael", 3, Color.CYAN);
       diner4 = new Diner(XPOSITION-55, YPOSITION+100, "Metlria", 4, Color.GREEN);
       diner5 = new Diner(XPOSITION-160, YPOSITION-100, "Todd", 5, Color.PINK);
       diner6 = new Diner(XPOSITION-160, YPOSITION, "Jacqul", 6, Color.ORANGE);
       
       // set the size and background color of the panel 
        setPreferredSize(new Dimension(800, 800)); // this is to set the preferred size of this panel 
        setBackground(Color.WHITE); // this is to set the background of this panel 
    }
    
    /** all the graphics drawing in the program will be handled by the paintComponent() of a JPanel */
    public void paintComponent(Graphics g){
        super.paintComponent(g); // draws a panel of a size and background color by calling the paintComponent method of the inherited JPanel 
        diner1.draw(g); // in this panel, the diner call the draw() method to paint 
        diner2.draw(g); // all these other components are dealt with in the paintComponent() method 
        diner3.draw(g);
        diner4.draw(g);
        diner5.draw(g);
        diner6.draw(g);
        
        g.setColor(Color.BLACK); // this is to set the color to the following drawing for filling a rectangular 
        g.fillRect(XPOSITION-50, YPOSITION-100, 100, 200);
    }
}
