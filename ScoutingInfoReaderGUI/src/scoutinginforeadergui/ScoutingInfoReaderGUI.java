/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoutinginforeadergui;

import javax.swing.JFrame;

/**
 *
 * @author 19jdoll
 */
public class ScoutingInfoReaderGUI
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Scouting App Info Reader");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setContentPane(new HomePage(frame));
    }
    
}
