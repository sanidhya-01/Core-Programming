import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int numOfCards = suits.length * ranks.length;
        String[] deck = initializeDeck(suits, ranks);

        shuffleDeck(deck);

        System.out.print("Enter number of cards to distribute (n): ");
        int n = sc.nextInt();

        System.out.print("Enter number of players (x): ");
        int x = sc.nextInt();

        if (x <= 0 || n <= 0 || n > numOfCards || n % x != 0) {
            System.out.println("Invalid distribution. Make sure n is divisible by x and within total cards.");
            return;
        }

        String[][] players = distributeCards(deck, n, x);

        printPlayers(players);
    }

    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int index = 0;
        String[] deck = new String[suits.length * ranks.length];
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int n, int x) {
        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }
}
