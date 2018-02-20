package org.mvpigs.pigcoins;

import java.security.PrivateKey;
import java.security.PublicKey;

public class Transaction{
    private String hash = "";
    private String prevHash = "";
    private PublicKey pKeySender = null;
    private PublicKey pKeyRecipient = null;
    private int pigCoins = 0;
    private String message = "";
    private byte[] signature;

    //Esta clase no tiene lógica, sólo getters y setters
    public String getHash() {
        return this.hash;
    }

    public String getPrevHash() {
        return this.prevHash;
    }

    public PublicKey getPkeySender() {
        return this.pKeySender;
    }

    public PublicKey getPkeyRecipient() {
        return this.pKeyRecipient;
    }

    public double getPigCoins() {
        return this.pigCoins;
    }

    public String getMessage() {
        return this.message;
    }
    
    
    public String toString(){
        return signature
    }



}