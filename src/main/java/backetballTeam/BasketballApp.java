package backetballTeam;

import java.util.*;
import java.util.function.Predicate;

public class BasketballApp {
    public static void main(String[] args) {
        BasketballTeam basketballTeam = new BasketballTeam();
        Player player = new Player("Michael", "Jordan", 298);
        basketballTeam.addPlayer(player);
        basketballTeam.addPlayer(player);
        Player player1 = new Player("Michael", "Jordan", 198);
        basketballTeam.addPlayer(player1);
        basketballTeam.addPlayer(player1);
        Player player2 = new Player("Adam", "Małysz", 141);
        Player player3 = new Player("Jan", "Paweł II", 222);
        Player player4 = new Player("Zbigniew", "Ziobro", 0);
        basketballTeam.addPlayer(player1);
        basketballTeam.addPlayer(player2);
        basketballTeam.addPlayer(player3);
        basketballTeam.addPlayer(player4);


        List<Player> playerList = new ArrayList<>();
        playerList.add(player);
        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);
        System.out.println("PRZED");
        System.out.println(playerList);
        playerList.sort(null);
        Collections.sort(playerList);
        System.out.println("NATURAL ORDER");
        System.out.println(playerList);
        playerList.sort(Comparator.reverseOrder());
        System.out.println("REVERSE ORDER");
        System.out.println(playerList);
        Collections.sort(playerList, Collections.reverseOrder());


        System.out.println("xxxaaaaaaxxxxxxxxx ");

        System.out.println(basketballTeam.getPlayers());
        System.out.println(basketballTeam.higherThan180());


        System.out.println(basketballTeam.getPlayers());

        System.out.println(player.compareTo(player1));

        System.out.println("GET HIGHER THAN");

        System.out.println(basketballTeam.getHigherThan(200));

        System.out.println("STREAM");

        System.out.println(basketballTeam.getHigherThan180Stream());

    }
}
