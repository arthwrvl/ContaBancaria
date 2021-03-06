import junit.extensions.TestSetup;
import org.junit.Before;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    Conta conta = new Conta();

    public ContaTest(){

    }

    @org.junit.jupiter.api.Test
    void deposito() {
        assertTrue(conta.deposito(100));
        assertFalse(conta.deposito(0));
        assertFalse(conta.deposito(-100));
    }

    @org.junit.jupiter.api.Test
    void saque() {
        //conta.deposito(100);
        assertFalse(conta.saque(50));
        /*assertTrue(conta.saque(50));
        assertFalse(conta.saque(60));
        assertFalse(conta.saque(-20));*/
    }

    @org.junit.jupiter.api.Test
    void saldo() {
        /*conta.deposito(100);
        assertEquals(100, conta.saldo());
        conta.saque(50);
        assertEquals(50, conta.saldo());*/

        assertEquals(0, conta.saldo());
    }
}