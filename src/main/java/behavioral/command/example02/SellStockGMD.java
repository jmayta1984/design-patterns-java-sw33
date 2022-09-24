package behavioral.command.example02;


// concreteCommand
public class SellStockGMD implements Command{

    StockGMD stockGMD;

    public SellStockGMD(StockGMD stockGMD) {
        this.stockGMD = stockGMD;
    }

    @Override
    public void execute() {
        this.stockGMD.sell();
    }
}
