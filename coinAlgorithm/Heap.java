package coinAlgorithm;

public class Heap {
    public Coin[] heapArray;

    public Heap(){};
    public Heap(int lengthForArray){
        this.heapArray = new Coin[lengthForArray];
    }

    public static int weightOfArray (Coin[] arrayToWeigh){
        int weight = 0;

        for (int i = 0; i < arrayToWeigh.length; i++){
            weight += arrayToWeigh[i].getWeightOfTheCoin();
        }
        return weight;
    }

    public static int weighTwoThirds (Coin[] firstThird_, Coin[] secondThird_){
        int resultOfWeighing = weightOfArray(firstThird_)-weightOfArray(secondThird_);
        return resultOfWeighing;
    }

}
