public class Lenovo implements Laptop {
    
    private int volume;
    boolean is_power_on;
    public Lenovo(){
        this.volume=50;
    }

    public void powerOn(){
        is_power_on = true;
        System.out.println("Laptop is On");
        System.out.println("Lenovo Thinkpad");
    }
    
    public void powerOff(){
        is_power_on = false;
        System.out.println("Shutdown is process");
    
    }
    
    public void VolumeUp(){
        if(is_power_on){
            if(this.volume==MAX_VOL){
                System.out.println("Lenovo Volume is Full");
            }
            else {
                this.volume +=10;
                System.out.println("Lenovo Volume is :" + this.getVolume());
            }
        }
    
    }
    public void VolumeDown(){
        if(is_power_on){
            if(this.volume==MIN_VOL){
                System.out.println("Lenovo Volume is 0%");
            }
            else {
                this.volume -=10;
                System.out.println("Lenovo Volume is :" + this.getVolume());
            }
        }
    }

    public int getVolume(){
        return this.volume;
    }
}
