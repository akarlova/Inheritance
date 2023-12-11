package app.controller;

import app.entity.Bet;
import app.model.NetWinCalc;
import app.view.AppView;
import app.utils.Rounder;


public class AppController {

    private final AppView view = new AppView();
    private final static String CURRENCY = "USD";

    public void getWinPayment() {

        String[] data = view.getData();
        Bet bet = getBet(data);
        int userNum = getUserNumber(data);
        String output;
        NetWinCalc winCalc = new NetWinCalc();
        String netWinPayment = Rounder.roundValue(winCalc.calcWinPayment(bet, userNum));
        output = "\nYour win payment is: " + CURRENCY +  " " + netWinPayment;
        view.getOutput(output);
    }

    private Bet getBet(String[] data) {
        return new Bet(Double.parseDouble(data[0]));
    }

    private int getUserNumber(String[] data) {
        int userNumber = Integer.parseInt(data[1]);
        return userNumber;
    }
}
