package behavioral.chain;

public class Dollar10Dispenser implements DispenseChain {

    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain chain) {
        this.nextChain = chain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount()>=10){
            int num = currency.getAmount()/10;
            int reminder = currency.getAmount()%10;

            System.out.println("Dispensing "+num + " 10$ note");

            if (reminder !=0)
                this.nextChain.dispense(new Currency(reminder));

        } else {
            this.nextChain.dispense(currency);
        }
    }
}
