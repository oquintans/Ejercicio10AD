/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textodelimitado;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

/**
 *
 * @author oracle
 */
public class Product {

    private String cod;
    private String descr;
    private int precio;
    NumberFormat nf;

    public Product() {
        this.nf = new NumberFormat() {

            @Override
            public StringBuffer format(double d, StringBuffer sb, FieldPosition fp) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public StringBuffer format(long l, StringBuffer sb, FieldPosition fp) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Number parse(String string, ParsePosition pp) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }

    public Product(String cod, String descr, int precio) {
        this.nf = new NumberFormat() {

            @Override
            public StringBuffer format(double d, StringBuffer sb, FieldPosition fp) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public StringBuffer format(long l, StringBuffer sb, FieldPosition fp) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Number parse(String string, ParsePosition pp) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        this.cod = cod;
        this.descr = descr;
        this.precio = precio;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cod: " + cod + "\nDescripción: " + descr + "\nPrecio: " + precio;
    }

}
