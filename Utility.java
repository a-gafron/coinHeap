public class Utility {

    public static int currentAmountOfCoins = 19863;
    public static int minAmountOfCoins = 0;
    public static int random_int = (int)Math.floor(Math.random() * (currentAmountOfCoins - minAmountOfCoins + 1) + minAmountOfCoins);
    public static int counterOfWeighing = 0;

    public static int subtractRest = 0;
    public static int endFirstThird = 0;
    public static int endSecondThird = 0;

    public static Heap aFreshHeap;
    public static Heap firstThird;
    public static Heap secondThird;
    public static Heap thirdThird;
}
