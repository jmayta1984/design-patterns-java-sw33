package behavioral.chain;

public interface DispenseChain {

    void setNextChain(DispenseChain chain);

    void dispense(Currency currency);
}
