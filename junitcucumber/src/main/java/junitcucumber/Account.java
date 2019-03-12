package junitcucumber;


import java.util.ArrayList;
import java.util.Collection;

public class Account {
 
    public String name;// should be private but no time
    public float currentBalance;// should be private but no time
 
    public float getBalance() {
        return currentBalance;
    }
 
    public void setBalance(float currentBalance) {
        this.currentBalance = currentBalance;
    }
    
    public Collection<Transaction> transactions;
    
    public Account(String name) {
    	transactions = new ArrayList<Transaction>();
    	currentBalance = 100;
    }
 
}