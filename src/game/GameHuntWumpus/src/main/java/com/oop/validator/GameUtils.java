package src.game.GameHuntWumpus.src.main.java.com.oop.validator;

import src.game.GameHuntWumpus.src.main.java.com.oop.GameConfig;
import src.game.GameHuntWumpus.src.main.java.com.oop.model.Location;
import java.util.Random;
import java.util.Collection;

public class GameUtils {
    private static final Random RANDOM = new Random();

    private GameUtils() {}

    public static void validateGameConfig(GameConfig config) {
        if (config == null) {
            throw new NullPointerException("Game config must not be null");
        }
        if (config.getMapSize() < 4) {
            throw new IllegalArgumentException("Map size must be equal or larger than 4");
        }
    }

    public static Location generateRandomLocation(int mapSize) {
        final var x = RANDOM.nextInt(mapSize);
        final var y = RANDOM.nextInt(mapSize);
        return new Location(x, y);
    }

    public static Location generateRandomLocation(int mapSize, Collection<Location> ignoreLocations) {
        var x = RANDOM.nextInt(mapSize);
        var y = RANDOM.nextInt(mapSize);
        var location = new Location(x, y);
        boolean fail = ignoreLocations.stream().anyMatch(t -> t.equals(location));
        while (fail) {
            x = RANDOM.nextInt(mapSize);
            y = RANDOM.nextInt(mapSize);
            location.setX(x);
            location.setY(y);
            fail = ignoreLocations.stream().anyMatch(t -> t.equals(location));
        }
        return location;
    }

    public static boolean canMoveToNewLocation(Location newLocation, int boundary) {
        if (newLocation.getX() >= boundary || newLocation.getY() >= boundary) {
            return false;
        }
        return !(newLocation.getX() < 0 || newLocation.getY() < 0);
    }

}
