package behavioral.chain;

public class Dollar50Dispenser implements DispenseChain{

    private DispenseChain nextChain;
    @Override
    public void setNextChain(DispenseChain chain) {
        this.nextChain = chain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount()>=50){
            int num = currency.getAmount()/50;
            int reminder = currency.getAmount()%50;

            System.out.println("Dispensing "+num + " 50$ note");

            if (reminder !=0)
                this.nextChain.dispense(new Currency(reminder));

        } else {
            this.nextChain.dispense(currency);
        }
    }
}
