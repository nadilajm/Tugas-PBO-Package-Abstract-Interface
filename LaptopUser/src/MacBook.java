public class MacBook implements Laptop {
    
    private int volume;
    boolean is_power_on;
    public MacBook(){
        this.volume=100;
    }

    public void powerOn(){
        is_power_on = true;
        System.out.println("Laptop is On");
        System.out.println("MacBook Air");
    }
    
    public void powerOff(){
        is_power_on = false;
        System.out.println("Shutdown is process");
    
    }
    
    public void VolumeUp(){
        if(is_power_on){
            if(this.volume==MAX_VOL){
                System.out.println("MacBook Volume is Full");
            }
            else {
                this.volume +=10;
                System.out.println("MacBook Volume is :" + this.getVolume());
            }
        }
    
    }
    public void VolumeDown(){
        if(is_power_on){
            if(this.volume==MIN_VOL){
                System.out.println("MacBook Volume is 0%");
            }
            else {
                this.volume -=10;
                System.out.println("MacBook Volume is :" + this.getVolume());
            }
        }
    }

    public int getVolume(){
        return this.volume;
    }
}
