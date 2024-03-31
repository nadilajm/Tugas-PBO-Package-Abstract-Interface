public class Toshiba implements Laptop {
    
    private int volume;
    boolean is_power_on;
    public Toshiba(){
        this.volume=0;
    }

    public void powerOn(){
        is_power_on = true;
        System.out.println("Laptop is On");
        System.out.println("Toshiba Satellit");
    }
    
    public void powerOff(){
        is_power_on = false;
        System.out.println("Shutdown is process");
    
    }
    
    public void VolumeUp(){
        if(is_power_on){
            if(this.volume==MAX_VOL){
                System.out.println("Toshiba Volume is Full");
            }
            else {
                this.volume +=10;
                System.out.println("Toshiba Volume is :" + this.getVolume());
            }
        }
    
    }
    public void VolumeDown(){
        if(is_power_on){
            if(this.volume==MIN_VOL){
                System.out.println("Toshiba Volume is 0%");
            }
            else {
                this.volume -=10;
                System.out.println("Toshiba Volume is :" + this.getVolume());
            }
        }
    }

    public int getVolume(){
        return this.volume;
    }
}
