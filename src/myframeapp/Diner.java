/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myframeapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
/**
 *
 * @author xiaogang
 */
public class Diner {
    /** this is the data fields to describe a diner object, that is the attribute as well as state */
    private int x;
    private int y;
    private String name;
    private int seatNum;
    private Color color;
    private final int DIAMETER = 100;
    
    /** constructor is a method and should include round bracket, 
     which normally set values to data fields */
    public Diner(int x, int y, String name, int seatNum, Color color){
        this.x = x;
        this.y = y;
        this.name = name;
        this.seatNum = seatNum;
        this.color = color;
    }
    
    public void draw(Graphics g){
        g.setColor(color); // set the drawing color to the color held in the data field
        g.fillOval(x, y, DIAMETER, DIAMETER); // since the height == weight, it is a circle // the color statement above is the color to be filled in 
        g.setColor(Color.BLACK); // set the drawing color for the text
        // Font font = new Font("Courier", Font.PLAIN, 18); 
        // g.setFont(font);
        g.setFont(new Font("Courier", Font.PLAIN, 18)); // set the text font
        g.drawString(name, x+20, y+50); // this is to draw the diner's name
        g.setFont(new Font("Courier", Font.PLAIN, 16));
        g.drawString(String.valueOf(seatNum), x+40, y+20); // this is the number of the table 
        // g.drawString(Integer.toString(seatNum), x+10, y+10); // two different ways to convert an integer to a string representation 
    }
}
