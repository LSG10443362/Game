import java.util.Scanner;

public class Lottery {
    public static int num1, num2, num3;
    public static void main(String[] args) {
    MatchLotteryNumber match = new MatchLotteryNumber();

        System.out.println("Hello and welcome to the lottery game!");
        match.generateLotteryNumbers();
        Scanner enterNumber = new Scanner(System.in);
        //asks the user to enter three numbers
        while (true) {
        System.out.println("Please enter a number between 1 and 100");
        num1 = Integer.parseInt(enterNumber.nextLine());
        System.out.println("Please enter a second number between 1 and 100");
        num2 = Integer.parseInt(enterNumber.nextLine());
        System.out.println("Please enter a third number between 1 and 100");
        num3 = Integer.parseInt(enterNumber.nextLine());



        //output "no matches" if none of the numbers match

            if (match.isFirstNumberMatch(num1) && match.isSecondNumberMatch(num2) && match.isThirdNumberMatch(num3)) {
                System.out.println("You've earned the Jackpot worth $1,000,000!");
                break;
            } else if ((match.isFirstNumberMatch(num1) && match.isSecondNumberMatch(num2)) || (match.isSecondNumberMatch(num2) && match.isThirdNumberMatch(num3)) || (match.isThirdNumberMatch(num3) && match.isFirstNumberMatch(num1))) {
                System.out.println("You've earned $1,000!");
                break;
            } else if (match.isFirstNumberMatch(num1) || match.isSecondNumberMatch(num2) || match.isThirdNumberMatch(num3)) {
                System.out.println("You've earned $10!");
                break;
            } else {
                System.out.println("No Matches, Try Again!");
            }
        }
    }
}









