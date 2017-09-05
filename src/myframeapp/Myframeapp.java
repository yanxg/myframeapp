/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myframeapp;

import javax.swing.JFrame;

/**
 *
 * @author xiaogang
 */
public class Myframeapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        JFrame frame = new JFrame("Table Setting"); // create an JFrame  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set default close operation 
        frame.getContentPane().add(new TablePanel()); // getContentPane() is a method to get a container and then add a panel 
        frame.pack(); // fit the size and layout of its components 
        frame.setVisible(true); // at the end, it is set to be visible 
    }
    
}
