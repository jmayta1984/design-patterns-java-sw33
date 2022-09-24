package behavioral.command.example01;

public class LightOnOrder implements Order{

    private Light light;

    public LightOnOrder(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
