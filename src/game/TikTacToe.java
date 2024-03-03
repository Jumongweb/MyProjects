package game;

import java.lang.reflect.Array;
import java.util.*;

public class TikTacToe {
    public static ArrayList<Integer> playerPositions = new ArrayList<>();
    public static ArrayList<Integer> computerPositions = new ArrayList<>();

    public static void main(String[] args) {
        char[][] gameBoard = new char[][]{
                {' ', '|', ' ', '|',' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', ' ', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };

        display(gameBoard);


        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your placement (1-9): ");
            int playerMove = scanner.nextInt();

            while (playerPositions.contains(playerMove) || computerPositions.contains(playerPositions)) {
                System.out.println("Position taken. Enter a correct position");
                playerMove = scanner.nextInt();
            }


            mark(gameBoard, playerMove, "player");

            String result = checkWinner();
            if (result.length() >  0) {
                System.out.println(result);
                break;
            }

            Random random = new Random();
            int computerMove = random.nextInt(9) + 1;
            while (playerPositions.contains(computerMove) || computerPositions.contains(computerMove)) {
                System.out.println("Position taken. Enter a correct position");
                computerMove = scanner.nextInt();
            }
            mark(gameBoard, computerMove, "computer");
            display(gameBoard);

            result = checkWinner();
            if (result.length() >  0) {
                System.out.println(result);
                break;
            }
        }

    }

    public static String checkWinner() {
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List bottomRow = Arrays.asList(7,8,9);
        List leftColumn = Arrays.asList(1,4,7);
        List midColumn = Arrays.asList(2,5,8);
        List rightColumn = Arrays.asList(3,6,9);
        List crossOne = Arrays.asList(1,5,9);
        List crossTwo = Arrays.asList(3,5,7);

        List<List> winning = new ArrayList<>();

        winning.add(topRow);
        winning.add(midRow);
        winning.add(bottomRow);
        winning.add(leftColumn);
        winning.add(midColumn);
        winning.add(rightColumn);
        winning.add(crossOne);
        winning.add(crossTwo);

        for (List l : winning){
            if (playerPositions.containsAll(l)) {
                return "Congrats, you won!!!";
            } 
            else if (computerPositions.containsAll(l)) {
                return "Sorry, Computer wins! :(";
            }
            else if (playerPositions.size() + computerPositions.size() == 9) {
                return "Tie!";
            }
        }

        return "";
    }

    private static void display(char[][] board) {
        for (char[] row : board) {
            System.out.print("\t");
            for (char column : row ){
                System.out.print(column);
            }
            System.out.println();
        }
    }

    public static void mark(char[][] gameBoard, int position, String user){
        char symbol = ' ';
        if (user.equals("player")){
            symbol = 'X';
            playerPositions.add(position);
        }
        else if (user.equals("computer")) {
            symbol = 'O';
            computerPositions.add(position);
        }

        switch (position){
            case 1 -> gameBoard[0][0] = symbol;
            case 2 -> gameBoard[0][2] = symbol;
            case 3 -> gameBoard[0][4] = symbol;
            case 4 -> gameBoard[2][0] = symbol;
            case 5 -> gameBoard[2][2] = symbol;
            case 6 -> gameBoard[2][4] = symbol;
            case 7 -> gameBoard[4][0] = symbol;
            case 8 -> gameBoard[4][2] = symbol;
            case 9 -> gameBoard[4][4] = symbol;
            default -> System.out.println("Invalid move");

        }
    }
}
