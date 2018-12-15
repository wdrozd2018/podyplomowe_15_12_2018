//package chapter2;

public class MarsRobot {
    public String status;
    public int speed;
    public float temperature;

    public MarsRobot(String status, int speed, float temperature){
        this.status=status;
        this.speed=speed;
        this.temperature=temperature;
    }

    public static void main(String[] args) {

        MarsRobot marsRobot=new MarsRobot("aaa", 200,-50);
        System.out.println("Parametry marsRobot:");
        marsRobot.showAttributes();

        System.out.println("-------------");

        System.out.println("Parametry marsRobot2:");
        MarsRobot marsRobot2= new MarsRobot("bbb", 90,-100 );
        marsRobot2.showAttributes();
    }

    public void checkTemperature() {
        if (temperature < -80) {
            status = "powrót do domu";
            speed = 5;
        }
    }

    public void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Prędkość: " + speed);
        System.out.println("Temperatura: " + temperature);
    }
}
