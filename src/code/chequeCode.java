/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author M_Samly
 */
public class chequeCode {

    int b_id;
    String date;
    String time;
    String customer;
    int telephone;
    String nic;
    String ch_date;
    String ch_no;
    String bank;
    float amount;

    public chequeCode(int b_id, String date, String time, String customer, int telephone, String nic, String ch_date, String ch_no, String bank, float amount) {
        this.b_id = b_id;
        this.date = date;
        this.time = time;
        this.customer = customer;
        this.telephone = telephone;
        this.nic = nic;
        this.ch_date = ch_date;
        this.ch_no = ch_no;
        this.bank = bank;
        this.amount = amount;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getCh_date() {
        return ch_date;
    }

    public void setCh_date(String ch_date) {
        this.ch_date = ch_date;
    }

    public String getCh_no() {
        return ch_no;
    }

    public void setCh_no(String ch_no) {
        this.ch_no = ch_no;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
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

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

}
