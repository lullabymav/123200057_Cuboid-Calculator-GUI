/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3pbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ruang.Balok;

/**
 *
 * @author Lenovo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUI gui = new GUI();
        
        gui.bcount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try{
                    double length = Double.valueOf(gui.getFlength());
                    double width = Double.valueOf(gui.getFwidth());
                    double height = Double.valueOf(gui.getFheight());
                    
                    Balok hasil = new Balok(height, length, width);
                    hasil.area();
                    gui.lsqarea.setText("Square Area      : " + hasil.areaResult);
                    hasil.circumference();
                    gui.lsqcircum.setText("Square Circumference  : " + hasil.circumResult);
                    hasil.volume();
                    gui.lcuvolume.setText("Cuboid Volume    : " + hasil.volumeResult);
                    hasil.surface();
                    gui.lcusurface.setText("Cuboid Surface    : " + hasil.surfaceResult);
                }catch(Exception ee){
                    JOptionPane.showMessageDialog(null, ee.getMessage());
                }
            }
        });
        
        gui.breset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                gui.lsqarea.setText("");
                gui.lsqcircum.setText("");
                gui.lcuvolume.setText("");
                gui.lcusurface.setText("");
                
                gui.flength.setText("");
                gui.fwidth.setText("");
                gui.fheight.setText("");
            }
        });
    }
    
}
