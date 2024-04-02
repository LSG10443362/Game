public class MatchLotteryNumber {
    int[] randomNums = new int[3];

    public void generateLotteryNumbers() {
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int) (Math.random() * 10);
        }
    }
    //match the first user entered number with the first random number

    public boolean isFirstNumberMatch(int num1) {
        return randomNums[0] == num1;
    }

    public boolean isSecondNumberMatch(int num2) {
        return randomNums[1] == num2;
    }

    public boolean isThirdNumberMatch(int num3) {
        return randomNums[2] == num3;
    }
} //Remember to do a sort function cause this gives a logical error in the main class













    /*different way of doing it using a getter method in LotteryNumber class
    public boolean matchLotteryNumbers(int index) {
       return randomNums[index].getNumber() == Lottery.getNum(index);
   }*/

