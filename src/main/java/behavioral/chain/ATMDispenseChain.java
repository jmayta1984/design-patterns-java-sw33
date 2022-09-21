package behavioral.chain;

public class ATMDispenseChain {

    private DispenseChain initialChain;

    public ATMDispenseChain(){
        this.initialChain = new Dollar100Dispenser();
        DispenseChain c2 = new Dollar50Dispenser();
        DispenseChain c3 = new Dollar20Dispenser();
        DispenseChain c4 = new Dollar10Dispenser();

        initialChain.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
    }

    public DispenseChain getInitialChain() {
        return initialChain;
    }
}
