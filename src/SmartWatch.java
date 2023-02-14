public class SmartWatch extends Technique {
    private String color;

    public SmartWatch(String name, String brand, String version, String color) {
        super(name, brand, version);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void turnOn() {
        System.out.println("Включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Выключен");
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "name:"  + getName() +
                "brand:" + getBrand() +
                "version:" + getVersion() +
                "color:" +getColor()+

                '}';
    }
}
