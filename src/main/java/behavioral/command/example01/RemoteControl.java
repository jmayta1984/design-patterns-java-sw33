package behavioral.command.example01;

public class RemoteControl {

    private Order order;

    void setOrder(Order order){
        this.order = order;
    }

    void pressButton(){
        this.order.execute();
    }
}
