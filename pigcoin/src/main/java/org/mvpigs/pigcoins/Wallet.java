package org.mvpigs.pigcoins;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Wallet {
    private PublicKey address = null;
    private PrivateKey SK = null;
    private double totalInput = 0.0d;
    private double totalOutput = 0.0d;
    private double balance = 0.0d;

    public void setAddress(PublicKey address) {
        this.address = address;
    }

    public PublicKey getAddress() {
        return this.address;
    }

    public void setSK(PrivateKey SK) {
        this.SK = SK;
    }

    public PrivateKey getSK(){
        return this.SK;
    }

    public void setTotalInput(double input) {
        this.totalInput += input;
    }

    public void setTotalOutput(double output) {
        this.totalOutput += output;
    }

    public void generateKeyPair(){
        KeyPair pair = GenSig.generateKeyPair();
        setAddress(pair.getPublic());
        setSK(pair.getPrivate());
    }

    public double getTotalInput() {
        return this.totalInput;
    }

    public double getTotalOutput() {
        return this.totalOutput;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance() {
        double balance =  getTotalInput() - getTotalOutput();
        if (balance >= 0) {
         this.balance = balance;
        }
    }