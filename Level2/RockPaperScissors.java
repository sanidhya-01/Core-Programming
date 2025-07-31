import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "draw";
        if (user.equals("rock") && computer.equals("scissors")) return "user";
        if (user.equals("scissors") && computer.equals("paper")) return "user";
        if (user.equals("paper") && computer.equals("rock")) return "user";
        return "computer";
    }

    public static String[][] getStats(String[][] gameData, int totalGames) {
        int userWins = 0, computerWins = 0, draws = 0;
        for (int i = 0; i < totalGames; i++) {
            if (gameData[i][2].equals("user")) userWins++;
            else if (gameData[i][2].equals("computer")) computerWins++;
            else draws++;
        }
        String[][] stats = new String[3][3];
        stats[0][0] = "User Wins";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0) / totalGames) + "%";
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", (computerWins * 100.0) / totalGames) + "%";
        stats[2][0] = "Draws";
        stats[2][1] = String.valueOf(draws);
        stats[2][2] = String.format("%.2f", (draws * 100.0) / totalGames) + "%";
        return stats;
    }

    public static void displayResults(String[][] gameData, String[][] stats, int totalGames) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < totalGames; i++) {
            System.out.println((i + 1) + "\t" + gameData[i][0] + "\t" + gameData[i][1] + "\t\t" + gameData[i][2]);
        }
        System.out.println();
        System.out.println("Summary:");
        System.out.println("Type\t\tCount\tPercentage");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();
        String[][] gameData = new String[games][3];
        for (int i = 0; i < games; i++) {
            System.out.print("Game " + (i + 1) + " - Enter rock, paper, or scissors: ");
            String userChoice = sc.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);
            gameData[i][0] = userChoice;
            gameData[i][1] = computerChoice;
            gameData[i][2] = winner;
        }
        String[][] stats = getStats(gameData, games);
        displayResults(gameData, stats, games);
    }
}
