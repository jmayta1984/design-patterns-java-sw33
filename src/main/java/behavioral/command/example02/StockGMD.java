package behavioral.command.example02;


// Receiver: execute operations
public class StockGMD {

    private int quantity;

    public StockGMD(int quantity) {
        this.quantity = quantity;
    }

    void buy(){
        System.out.println("Stock GMD: buying " + quantity);
    }

    void sell(){
        System.out.println("Stock GMD: selling " + quantity);

    }
}
