public class Light {
    private boolean isOn;

    public Light() {
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("The light is on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("The light is off.");
    }

    public void showStatus() {
        if (isOn) {
            System.out.println("The light is currently ON.");
        } else {
            System.out.println("The light is currently OFF.");
        }
    }
}
