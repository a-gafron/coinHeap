public class Heap {
    private Coin[] heapArray;

    public Heap(int length){
        this.heapArray = new Coin[length];
    }

    public static int weightOfArray (Coin[] arrayToWeigh){
        int weight = 0;

        for (int i = 0; i < arrayToWeigh.length; i++){
            weight += arrayToWeigh[i].getWeightOfTheCoin();
        }
        return weight;
    }
}
