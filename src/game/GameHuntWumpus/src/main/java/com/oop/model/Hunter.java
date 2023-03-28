package src.game.GameHuntWumpus.src.main.java.com.oop.model;

import src.game.GameHuntWumpus.src.main.java.com.oop.characteristic.Attackable;
import src.game.GameHuntWumpus.src.main.java.com.oop.characteristic.Moable;

public abstract class Hunter extends Character implements Moable, Attackable {
    protected Hunter(final Location location){
        super(location);
    }

    public abstract boolean outOfBullet();

}
