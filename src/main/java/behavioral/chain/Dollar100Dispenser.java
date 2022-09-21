package behavioral.chain;

public class Dollar100Dispenser implements DispenseChain{

    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain chain) {
        this.nextChain = chain;
    }

    @Override
    public void dispense(Currency currency) {

        if (currency.getAmount()>=100){
            int num = currency.getAmount()/100;
            int reminder = currency.getAmount()%100;

            System.out.println("Dispensing "+num + " 100$ note");

            if (reminder !=0)
                this.nextChain.dispense(new Currency(reminder));

        } else {
            this.nextChain.dispense(currency);
        }
    }
}
