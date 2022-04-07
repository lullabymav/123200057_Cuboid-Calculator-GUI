/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3pbo;

import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class GUI extends JFrame {
    JLabel ltitle = new JLabel ("Cuboid Calculator");
    
    JLabel llength = new JLabel ("Length "); 
    JTextField flength = new JTextField();
    
    JLabel lwidth = new JLabel ("Width ");
    JTextField fwidth = new JTextField();
    
    JLabel lheight = new JLabel ("Height ");
    JTextField fheight = new JTextField();
    
    JLabel lresult = new JLabel ("Result : ");
    
    JLabel lsqarea = new JLabel ("");
    JLabel lsqcircum = new JLabel ("");
    JLabel lcuvolume = new JLabel ("");
    JLabel lcusurface = new JLabel ("");
    
    JButton bcount = new JButton ("Count");
    JButton breset = new JButton ("Reset");
    
    public GUI(){
        setSize(400,450);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(ltitle);
        add(llength);
        add(flength);
        add(lwidth);
        add(fwidth);
        add(lheight);
        add(fheight);
        add(lresult);
        
        add(lsqarea);
        add(lsqcircum);
        add(lcuvolume);
        add(lcusurface);
        
        add(bcount);
        add(breset);
        
//        (x,y,panjang dalam, lebar dalam)
        ltitle.setBounds(150,0,150,70);
        llength.setBounds(50,80,50,20);
        flength.setBounds(150,80,180,20);
        lwidth.setBounds(50,130,50,20);
        fwidth.setBounds(150,130,180,20);
        lheight.setBounds(50,180,50,20);
        fheight.setBounds(150,180,180,20);
        lresult.setBounds(150,210,50,20);
        
        lsqarea.setBounds(50,240,150,20);
        lsqcircum.setBounds(50,270,180,20);
        lcuvolume.setBounds(50,300,150,20);
        lcusurface.setBounds(50,330,150,20);
        
        bcount.setBounds(110,370,80,20);
        breset.setBounds(200,370,80,20);
        
    }

    String getFlength() {
        return flength.getText();
    }

    String getFwidth() {
        return fwidth.getText();
    }

    String getFheight() {
        return fheight.getText();
    }
}
