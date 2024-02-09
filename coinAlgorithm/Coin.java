package coinAlgorithm;

public class Coin {
    private int nrOfTheCoin = 0;
    private int weightOfTheCoin = 0;

    public Coin (int nrOfTheCoin_, int weightOfTheCoin_){
        this.nrOfTheCoin = nrOfTheCoin_;
        this.weightOfTheCoin = weightOfTheCoin_;
    }

    public int getNrOfTheCoin() {
        return nrOfTheCoin;
    }

    public void setNrOfTheCoin(int nrOfTheCoin){
        this.nrOfTheCoin = nrOfTheCoin;
    }
    public int getWeightOfTheCoin(){
        return weightOfTheCoin;
    }
    public void setWeightOfTheCoin(int weightOfTheCoin){
        this.weightOfTheCoin = weightOfTheCoin;
    }
}
