package com.Catalin;

public class Main {

    public static void main(String[] args) {
//        int highscoretablePosition = calculateHighScorePosition(1500); //1
//        displayHighScorePosition("Catalin", highscoretablePosition);
//
//        highscoretablePosition = calculateHighScorePosition(900);
//        displayHighScorePosition("Diana", highscoretablePosition);
//
//        highscoretablePosition = calculateHighScorePosition(400);
//        displayHighScorePosition("Cezar", highscoretablePosition);
//
//        highscoretablePosition = calculateHighScorePosition(50);
//        displayHighScorePosition("Edi", highscoretablePosition);
//    }
//
//    public static int calculateHighScorePosition(int playerScore){
//        if(playerScore >= 1000)
//            return 1;
//        if(playerScore >= 500 && playerScore < 1000)
//            return 2;
//        if(playerScore >= 100 && playerScore < 500)
//            return 3;
//        else
//            return 4;
//    }
//    public static void displayHighScorePosition(String playerName, int highscoretablePosition){
//        System.out.println(playerName + " managed to get into position "
//                + highscoretablePosition + " on the high score table!");

        displayHighScorePosition("Catalin", calculateHighScorePosition(1500));
        displayHighScorePosition("Dan", calculateHighScorePosition(900));
        displayHighScorePosition("Diana", calculateHighScorePosition(400));
        displayHighScorePosition("Irina", calculateHighScorePosition(50));
        /** Methods can also be called as an argument for another method, as seen in the example above.
         * The parameter for displayHighScorePosition was an integer, the calculateHighScorePosition returns an integer
         * so it can be used as an argument.
         * Alternatively you can store the calculateHighScorePosition return value in another variable and use that:
         */
        int highScoreTablePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Catalin", highScoreTablePosition);

        highScoreTablePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Catalin", highScoreTablePosition);

    }

    //Challenge
    // Create a method called displayHighScorePosition
    // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table".
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an in
    // the return data should be
    // 1 if the score is >=1000
    // 2 if the score is >=500 and < 1000
    // 3 if the score is >=100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400 and 50

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }
    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000){
//            return 1;
//        } else if (score >= 500 && score < 1000){
//            return 2;
//        } else if (score >= 100 && score < 500){
//            return 3;
//        } return 4;
        /** Another way to solve this challenge would be to get rid of the returns and user a variable:
         */
        int position = 4; //assuming position 4 will be returned
        if(score >= 1000){
            position = 1;
        } else if (score >= 500){
            position = 2;
        } else if (score >= 100){
            position = 3;
        }

        return position;
        /** If none of the if conditions are met, the code will return the value of position,
         * which was initially set to 4;
         */
    }
}

