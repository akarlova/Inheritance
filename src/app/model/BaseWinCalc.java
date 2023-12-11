package app.model;

import app.entity.Bet;

public class BaseWinCalc {

    double[] winRates = {125, 200};
    int[] edgeNumbers = {3, 7};

    public double calcWinPayment(Bet bet, int userNum) {
        double winPayment;
        RandomHandmade rand = new RandomHandmade();
        if (rand.getNumber(userNum) < edgeNumbers[0]) {
            winPayment = bet.getBet() * winRates[0] / 100;
        } else if (rand.getNumber(userNum) <= edgeNumbers[1])
            winPayment = (bet.getBet() * winRates[0] / 100);
        else {
            winPayment = (bet.getBet() * winRates[1] / 100);
        }
        return winPayment;
    }
}
