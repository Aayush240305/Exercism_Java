public class CarsAssemble {

    public double productionRatePerHour(int speed) {

        double rate = 221 * speed; 
        
        if(speed <= 4){
            return rate;
        }else if(speed >= 5 && speed <= 8){
            return (rate*90) / 100;
        }else if(speed == 9){
            return (rate*80) / 100;
        }else{
            return (rate*77) / 100;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed))/60;      
    }
}
