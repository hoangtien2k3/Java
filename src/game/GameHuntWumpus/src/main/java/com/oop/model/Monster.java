package src.game.GameHuntWumpus.src.main.java.com.oop.model;

import src.game.GameHuntWumpus.src.main.java.com.oop.characteristic.Damaged;

public abstract class Monster extends Character implements Damaged {
    protected Monster(final Location location) {
        super(location);
    }
}
