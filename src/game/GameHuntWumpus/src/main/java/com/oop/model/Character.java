package src.game.GameHuntWumpus.src.main.java.com.oop.model;

public abstract class Character {
    private final Location location;

    protected Character(final Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return Location.clone(location);
    }

    public void moveTo(Location newLocation) {
        location.setX(newLocation.getX());
        location.setY(newLocation.getY());
    }

    public abstract boolean alive();
    public abstract String name();

}
