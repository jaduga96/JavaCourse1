package module2;

public class UN7EXC5 {
    public static void main(String[] args) {
        String trafficLights = "yellow1";
        trafficLightsCheck(trafficLights);
    }

    public static void trafficLightsCheck(String trafficLights) {
        switch (trafficLights) {
            case "red":
                System.out.println("Stop");
                return;
            case "yellow":
                System.out.println("Get Ready");
                return;
            case "green":
                System.out.println("Lets go");
                return;
            default:
                System.out.println("Whats going on????");
                return;
        }
    }
}
