import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Contains the basic user menu. Wont be used in actual app.
        /*  Contains an array of players in a tournament with multiple brackets.
         *  Within each bracket the players have their own scores, in which they can
         *  be incremented or decremented. Upon the tournament finishing, the score is saved
         *  to a file and then the data is cleared.
        */
        ArrayList<Player> playerList = new ArrayList<Player>();
        Scanner scnr = new Scanner(System.in);
        String userInput;

        System.out.println("Let's begin a new tournament!");
        System.out.println("Add the Names of each player, press 1 to begin.");

        userInput = scnr.nextLine();
        while (!userInput.equals("1")) {
            playerList.add(new Player(userInput));
            userInput = scnr.nextLine();
        }
    }
}

class Player {
    /* Contains each player's score information.
    */
    private HashMap<String, Score> playerScores;
    private ArrayList<String> bracketNames;
    private String playerName;

    public Player() {
        playerScores = new HashMap<String, Score>();
        playerName = "";

        bracketNames = new ArrayList<String>();
        bracketNames.add("Single Short");
        bracketNames.add("Sword and Board");
        bracketNames.add("Florentine");
        bracketNames.add("Open");
    }

    public Player(String p_playerName) {
        playerScores = new HashMap<String, Score>();
        playerName = p_playerName;

        bracketNames = new ArrayList<String>();
        bracketNames.add("Single Short");
        bracketNames.add("Sword and Board");
        bracketNames.add("Florentine");
        bracketNames.add("Open");
    }
}

class Score {
    //Contains an individual score.

    private int score;

    public Score() {
        score = 0;
    }
}