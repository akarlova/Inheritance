package app.model;

import app.entity.Bet;

public class NetWinCalc extends BaseWinCalc {

    double[] rates = {5, 10};

    @Override
    public double calcWinPayment(Bet bet, int userNum) {
        double winPayment = super.calcWinPayment(bet, userNum);
        RandomHandmade rand = new RandomHandmade();
        if (rand.getNumber(userNum) < edgeNumbers[0]) {
            return winPayment;
        } else if (rand.getNumber(userNum) <= edgeNumbers[1])
            return winPayment * (1 - rates[0] / 100);
        else {
            return winPayment * (1 - rates[1] / 100);
        }
    }
}

