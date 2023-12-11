package app.model;

public class RandomHandmade {

    int[] userNums = {2, 5, 7, 9, 14, 17, 21, 6, 8, 15, 13, 19, 20,
            1, 3, 10, 4, 11, 16, 12, 18};

    public int getNumber(int userNum) {
        int searchNum = userNum - 1;
        return userNums[searchNum];
    }
}
