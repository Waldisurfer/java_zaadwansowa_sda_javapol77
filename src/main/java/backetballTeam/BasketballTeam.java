package backetballTeam;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BasketballTeam {
    Set<Player> team = new HashSet<>();

    void addPlayer(Player player) {
        team.add(player);
    }

    Set<Player> getPlayers() {
        return team;
    }

    public Optional<Player> getHigherThan(int height) {
        for (Player player : team) {
            if (player.getHeight() > 200) {
                return Optional.of(player);
            }
        }
        return Optional.empty();
    }

    public Set<Player> higherThan180() {
        Predicate<Player> predicate = new HigherThan180();
        Set<Player> playersHT180 = new HashSet<>();
        for (Player player : team) {
            if (predicate.test(player)) {
                playersHT180.add(player);
            }
        }
        return playersHT180;
    }

    public Set<Player> getHigherThan180Stream() {
        Predicate<Player> higherThan180 = new HigherThan180();
        Set<Player> passed = new HashSet<>();

        team.stream()
                .filter(higherThan180)
                .collect(Collectors.toSet());
        return passed;
    }

    public Set<Player> getHigherThan180Final(){
        return team.stream()
                .filter(player -> player.getHeight() > 180)
                .collect(Collectors.toSet());
    }

//    public Set<Player> getPlayerNames() {
//        Function<Player, String> getName = player -> player.getFirstName();
//        return team.stream()
//                .filter(player -> player.getHeight() > 180)
//                .map(player -> player.getFirstName())
//                .collect(Collectors.toSet());
//    }
//
//

}
