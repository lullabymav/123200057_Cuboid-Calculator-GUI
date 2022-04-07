/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

/**
 *
 * @author Lenovo
 */
public class Persegi implements MenghitungBidang {
    //attribute
    public double length;
    public double width;
    public double areaResult;
    public double circumResult;
    
    //constructor
    public Persegi (double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    //method

    @Override
    public void area() {
        areaResult = length * width;
    }

    @Override
    public void circumference() {
        circumResult = 2 * (length + width);
    }

}
