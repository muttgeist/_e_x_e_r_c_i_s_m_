public class Lasagna {
    // define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven (){
        return 40;
    }
    // define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minut){
        return expectedMinutesInOven() - minut;
    }

    //  define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return 2 * layers;
    }
    // define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minuts){
        return preparationTimeInMinutes(layers) + minuts ;
    }
}
