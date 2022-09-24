package behavioral.command.example02;

// concreteCommand
public class BuyStockGMD implements Command{

    StockGMD stockGMD;

    public BuyStockGMD(StockGMD stockGMD) {
        this.stockGMD = stockGMD;
    }

    @Override
    public void execute() {
        this.stockGMD.buy();
    }
}
