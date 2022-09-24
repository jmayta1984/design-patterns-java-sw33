package behavioral.command.example02;

public class Demo {

    public static void main(String[] args){

        Broker broker = new Broker();
        StockGMD stockGMD = new StockGMD(15);

        Command command = new SellStockGMD(stockGMD);

        stockGMD = new StockGMD(20);
        broker.takeCommand(command);

        command = new BuyStockGMD(stockGMD);
        broker.takeCommand(command);

        broker.processCommands();

    }
}
