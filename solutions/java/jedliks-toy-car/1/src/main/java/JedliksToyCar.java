public class JedliksToyCar {
    public int battery = 100;
    public int distance = 0;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if(battery == 0){
            return "Battery empty";
        }else{
            return "Battery at " + battery + "%";
        }
    }

    public void drive() {
        if(battery == 0){
            return;
        }else{
            distance+=20;
            battery--;
        }  
    }
}
