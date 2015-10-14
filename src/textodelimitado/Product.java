/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textodelimitado;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author oracle
 */
public class Product {

    private String cod;
    private String descr;
    private int precio;

    public Product() {

    }

    public Product(String cod, String descr, int precio) {

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
        String nf;
        return "Cod: " + cod + "\nDescripción: " + descr + "\nPrecio: " + (nf = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(precio));
    }

}
