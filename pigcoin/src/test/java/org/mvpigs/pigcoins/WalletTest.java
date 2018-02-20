package org.mvpigs.pigcoins;

import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.security.KeyPair;
import org.junit.Before;
import org.junit.Test;

public class WalletTest{
    Wallet wallet_1 = null;
    Wallet wallet_2 = null;
    @Before
    public void SetUp() {
        wallet_1 = new Wallet();
        wallet_1.generateKeyPair();

        wallet_2 = new Wallet();
        wallet_2.generateKeyPair();
    }

    @Test
    public void testComprobarWallet (){
        Wallet wallet = new Wallet();

        KeyPair pair = GenSig.generateKeyPair();

        wallet.setSK(pair.getPrivate());
        wallet.setAddress(pair.getPublic());

        //assertNotNull(wallet.generateKeyPair()); no funcionaria ver q no solo de nulo
        assertEquals(pair.getPublic(), wallet.getAddress());

    }
}