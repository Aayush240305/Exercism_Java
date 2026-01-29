class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int coveredDistance = 0;
    private int battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return coveredDistance;
    }

    public void drive() {
           if(!batteryDrained()){
               coveredDistance += speed;
               battery -= batteryDrain;
           }
    }

    public static NeedForSpeed nitro() {
         return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
            if (car.distanceDriven() >= distance) {
                return true;
            }
        }
        return false;
    }
}
