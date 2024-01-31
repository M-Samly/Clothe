/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author M_Samly
 */
public class productCode {

    String barcode;
    String name;
    int qty;
    float bprice;
    float wprice;
    float rprice;

    public productCode(String barcode, String name, int qty, float bprice, float wprice, float rprice) {
        this.barcode = barcode;
        this.name = name;
        this.qty = qty;
        this.bprice = bprice;
        this.wprice = wprice;
        this.rprice = rprice;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getBprice() {
        return bprice;
    }

    public void setBprice(float bprice) {
        this.bprice = bprice;
    }

    public float getWprice() {
        return wprice;
    }

    public void setWprice(float wprice) {
        this.wprice = wprice;
    }

    public float getRprice() {
        return rprice;
    }

    public void setRprice(float rprice) {
        this.rprice = rprice;
    }

}
