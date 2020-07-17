public class Car extends Machine1 {

    @Override
    public void start() {
        System.out.println("Car started.");
    }
    public void wipewindShield(){
        System.out.println("Wiping windshield");
    }
    public void showInfo(){
        System.out.println("Car name : "+name);
    }
}
