package com.example.demo.slides;

public class Adder {

    private int amount = 0;

    public int add(int toAdd){
        amount += toAdd;
        return amount;
    }

    public void reset(){
        amount = 0;
    }

    public int getAmount(){
        return amount;
    }
}



