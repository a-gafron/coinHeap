package coinAlgorithm;

public class Main {
    public static void main(String[] args) {

        Utility.initialHeapWithCoins(Utility.aFreshHeap);

        Utility.subtractRest =  Utility.makeTheAmountDivisible( Utility.currentAmountOfCoins);
        Utility.endFirstThird =  Utility.sliceTheFirstThird( Utility.subtractRest,  Utility.currentAmountOfCoins);
        Utility.endSecondThird =  Utility.endFirstThird * 2;

        System.out.println(Utility.subtractRest);
        System.out.println(Utility.endFirstThird);
        System.out.println(Utility.endSecondThird);

        Utility.fillingTheFirstThird(Utility.firstThird, Utility.endFirstThird);
        Utility.fillingTheSecondThird(Utility.secondThird, (Utility.endSecondThird - Utility.endFirstThird));
        Utility.fillingTheThirdThird(Utility.thirdThird, (Utility.aFreshHeap.heapArray.length - Utility.endSecondThird));

        System.out.println(Utility.aFreshHeap.heapArray[5].getNrOfTheCoin());
        System.out.println(Utility.firstThird.heapArray[5].getNrOfTheCoin());

        Utility.solution();
    }
}
