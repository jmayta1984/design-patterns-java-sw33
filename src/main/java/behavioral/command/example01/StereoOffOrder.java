package behavioral.command.example01;

public class StereoOffOrder implements Order{
    private Stereo stereo;


    public StereoOffOrder(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.off();
    }
}
