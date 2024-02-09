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
    public static Heap aFreshHeap = new Heap(currentAmountOfCoins);
    public static Heap firstThird;
    public static Heap secondThird;
    public static Heap thirdThird;

    public static int makeTheAmountDivisible (int currentAmountOfCoins_){
        int rest = 0;
        if (currentAmountOfCoins_ % 3 == 0) {
            rest = 0;
        } else if (currentAmountOfCoins_ % 3 == 1) {
            rest = 1;
        } else if (currentAmountOfCoins_ % 3 == 2) {
            rest = 2;
        }
        //here is an exception required
        return rest;
    }

    public static int cutIntoThirds (int rest_, int currentAmountOfCoins_) {
        currentAmountOfCoins_ = (currentAmountOfCoins_ - rest_)*1/3 + rest_;
        return currentAmountOfCoins_;
    }

    public static int sliceTheFirstThird (int rest_, int currentAmountOfCoins_ ){
        currentAmountOfCoins_ = (currentAmountOfCoins_ - rest_)*1/3;
        return currentAmountOfCoins_;
    }

    public static int sliceTheSecondThird (int rest_,int currentAmountOfCoins_){
        currentAmountOfCoins_ = (currentAmountOfCoins_ - rest_)*2/3;
        return currentAmountOfCoins_;
    }

    public static void initialHeapWithCoins (Heap toGetFilled){
        for (int i = 0; i < currentAmountOfCoins; i++){
            if (i == random_int){
                toGetFilled.heapArray[i] = new Coin(i, 1);
            }
            else {
                toGetFilled.heapArray[i] = new Coin(i, 2);
            }
        }
    }

    public static void fillingTheThirds (Heap third, int lengthOfThird){
        third = new Heap(lengthOfThird);
        for (int i = 0; i < endFirstThird; i++){
            third.heapArray[i] = aFreshHeap.heapArray[i];
        }
    }

    public static int solution (){
        Utility.initialHeapWithCoins(aFreshHeap);

        while (aFreshHeap.heapArray.length > 1) {
            subtractRest = makeTheAmountDivisible(currentAmountOfCoins);
            endFirstThird = sliceTheFirstThird(subtractRest, currentAmountOfCoins);
            endSecondThird = endFirstThird * 2;

            fillingTheThirds(firstThird, endFirstThird);
            fillingTheThirds(secondThird, (endSecondThird - endFirstThird));
            fillingTheThirds(thirdThird, aFreshHeap.heapArray.length - endSecondThird);

            if (Heap.weighTwoThirds(firstThird.heapArray, secondThird.heapArray) == 0) {
                aFreshHeap.heapArray = thirdThird.heapArray;
            } else if (Heap.weighTwoThirds(firstThird.heapArray, secondThird.heapArray) == 1) {
                aFreshHeap.heapArray = secondThird.heapArray;
            } else if (Heap.weighTwoThirds(firstThird.heapArray, secondThird.heapArray) == -1) {
                aFreshHeap.heapArray = firstThird.heapArray;
            }
            System.out.println(aFreshHeap.heapArray.length);

        }
        return aFreshHeap.heapArray.length;
    }

}
