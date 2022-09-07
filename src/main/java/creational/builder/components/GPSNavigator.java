package creational.builder.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Go to UPC, go home";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
