package de.wwi23ama.vl_2024_03_22;

public class Complex {
    private double real;
    private double img;    

    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public String String() {
        return this.real + " + " + this.img + "i";
    }
}
