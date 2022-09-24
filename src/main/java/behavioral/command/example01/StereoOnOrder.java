package behavioral.command.example01;

public class StereoOnOrder implements Order{

    private Stereo stereo;

    public StereoOnOrder(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setVolumen(10);
    }
}
