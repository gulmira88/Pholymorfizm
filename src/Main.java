public class Main {
    public static void main(String[] args){

        Technique phone = new Phone("Samsung","Samsung","A30",+70387644);
        System.out.println(phone);
        phone.turnOff();
        phone.turnOn();



        Technique computer = new Computer("Asus","Asus","X15",123);
        System.out.println(computer);
        computer.turnOff();
        computer.turnOn();



        Technique SmartWatch = new SmartWatch("Apple","Lux","P70","black");
        System.out.println(SmartWatch);
        SmartWatch.turnOff();
        SmartWatch.turnOn();
    }


    }
