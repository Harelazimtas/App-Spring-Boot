package com.example.demo.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    //@GeneratedValue
    private Integer  no;

    private String name;
    private int amount;
    private String inventoryCode;

    public Item(int no, String name, int amount, String inventoryCode){
        this.no=no;
        this.amount=amount;
        this.name=name;
        this.inventoryCode=inventoryCode;
    }

    public Item() {

    }

    //get
    public int getAmount() {
        return amount;
    }

    public int getNo() {
        return no;
    }

    public String getInventoryCode() {
        return inventoryCode;
    }

    public String getName() {
        return name;
    }
    //set
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setInventoryCode(String inventoryCode) {
        this.inventoryCode = inventoryCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "item{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", inventoryCode='" + inventoryCode + '\'' +
                '}';
    }
}