public class LaptopUser {
    
    private Laptop laptop;

    public LaptopUser(Laptop laptop){
        this.laptop = laptop;
    }

    void turnOnLaptop(){
        this.laptop.powerOn();
    }
    void turnOffLaptop(){
        this.laptop.powerOff();
    }
    void makeLaptopLouder(){
        this.laptop.VolumeUp();
    }
    void makeLaptopSilence(){
        this.laptop.VolumeDown();
    }
}
