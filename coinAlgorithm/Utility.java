package coinAlgorithm;

public class Utility {

    public static int currentAmountOfCoins = 19863; //create a conversation, where per scanner the amount could get set
    public static int minAmountOfCoins = 0;
    public static int random_int = (int)Math.floor(Math.random() * (currentAmountOfCoins - minAmountOfCoins + 1) + minAmountOfCoins);
    public static int counterOfWeighing = 0;
    public static int subtractRest = 0;
    public static int endFirstThird = 0;
    public static int endSecondThird = 0;

    public static int actualCountOfCoins;
    public static Heap aFreshHeap;
    public static Heap firstThird;
    public static Heap secondThird;
    public static Heap thirdThird;

    public static int makeTheAmountDivisible (){
        int rest = 0;
        if (currentAmountOfCoins % 3 == 0) {
            rest = 0;
        } else if (currentAmountOfCoins % 3 == 1) {
            rest = 1;
        } else if (currentAmountOfCoins % 3 == 2) {
            rest = 2;
        }
        //here is an exception required
        return rest;
    }

    public static int cutIntoThirds (int rest_) {
        currentAmountOfCoins = (currentAmountOfCoins - rest_)*1/3 + rest_;
        return currentAmountOfCoins;
    }
    public static int sliceTheFirstThird (int rest_){
        currentAmountOfCoins = (currentAmountOfCoins - rest_)*1/3;
        return currentAmountOfCoins;
    }

    public static int sliceTheSecondThird (int rest_){
        currentAmountOfCoins = (currentAmountOfCoins - rest_)*2/3;
        return currentAmountOfCoins;
    }
}
