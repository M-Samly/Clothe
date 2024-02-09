/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author M_Samly
 */
public class reportCode {

    int bilno;
    String cashier;
    String date;
    String time;
    int item;
    String customer;
    String type;
    float total;
    float discount;
    float payment;
    float balance;

    public reportCode(int bilno, String cashier, String date, String time, int item, String customer, String type, float total, float discount, float payment, float balance) {
        this.bilno = bilno;
        this.cashier = cashier;
        this.date = date;
        this.time = time;
        this.item = item;
        this.customer = customer;
        this.type = type;
        this.total = total;
        this.discount = discount;
        this.payment = payment;
        this.balance = balance;
    }

    public int getBilno() {
        return bilno;
    }

    public void setBilno(int bilno) {
        this.bilno = bilno;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getPayment() {
        return payment;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

}
