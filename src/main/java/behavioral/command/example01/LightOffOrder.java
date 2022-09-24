package behavioral.command.example01;

public class LightOffOrder implements Order{

    private Light light;

    public LightOffOrder(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
