package src.GameHuntWumpus.src.main.java.com.oop.characteristic;

import src.GameHuntWumpus.src.main.java.com.oop.model.Hunter;

public interface Damaged {
    void beAttacked(int hp);
    void attackedBy(Hunter hunter);
}
