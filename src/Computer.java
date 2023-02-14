public class Computer extends Technique {
    private int keyboard;


    public Computer(String name, String brand, String version, int keyboard) {
        super(name, brand, version);
        this.keyboard = keyboard;
    }

    public int getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(int keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public void turnOn() {
        System.out.println("Bключен");
    }

    @Override
    public void turnOff() {
        System.out.println("Выключен");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name:" +getName()+
                "brand=" +getBrand()+
                "version:" + getVersion()+
                "keyboard:"  +getKeyboard()+
                '}';
    }
}
