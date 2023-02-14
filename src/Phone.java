public class Phone extends Technique {
    private int number;


    public Phone(String name, String brand, String version, int number) {
        super(name, brand, version);
        this.number = number;
    }




    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
        return "Phone{" +
                "name:"  +getName()+
                "brand:" +getBrand()+
                "version:" +getVersion()+
                "number=" + number +
                '}';
    }
}





