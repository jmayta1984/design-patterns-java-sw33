package behavioral.chain;

public class Dollar20Dispenser implements DispenseChain{
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain chain) {
        this.nextChain = chain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount()>=20){
            int num = currency.getAmount()/20;
            int reminder = currency.getAmount()%20;

            System.out.println("Dispensing "+num + " 20$ note");

            if (reminder !=0)
                this.nextChain.dispense(new Currency(reminder));

        } else {
            this.nextChain.dispense(currency);
        }
    }
}
