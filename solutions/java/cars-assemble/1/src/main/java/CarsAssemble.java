public class CarsAssemble {

    static private int car_per_hour = 221;
    public double productionRatePerHour(int speed) {
        double rate = 0.0;
        if (speed == 10){
            rate = speed * car_per_hour * 0.77;
        }
        else if (speed == 9){
            rate = speed * car_per_hour * 0.8;
        }
        else if (speed < 9 && speed > 4){
            rate = speed * car_per_hour * 0.9;
        }
        else {
            rate = speed * car_per_hour;
        }
        return rate;
    }

    public int workingItemsPerMinute(int speed) {
       return (int)(productionRatePerHour(speed)/60);
    }
}
