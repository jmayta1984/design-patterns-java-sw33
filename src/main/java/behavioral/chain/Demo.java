package behavioral.chain;

public class Demo {

    public static void main(String[] args){
        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();

        int amount = 350;

        if (amount % 10 !=0){
            System.out.println("Amount should be multiple of 10");
            return;
        }

        atmDispenseChain.getInitialChain().dispense(new Currency(amount));
    }
}
