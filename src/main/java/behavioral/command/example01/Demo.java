package behavioral.command.example01;

public class Demo {

    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        Order order = new LightOffOrder(new Light());

        remoteControl.setOrder(order);
        remoteControl.pressButton();

    }
}
