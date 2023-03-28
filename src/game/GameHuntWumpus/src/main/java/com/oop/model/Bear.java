package src.game.GameHuntWumpus.src.main.java.com.oop.model;

public class Bear extends Monster {
    private int hp;

    public Bear(final Location location) {
        super(location);
        hp = 100;
    }

    @Override
    public void beAttacked(int hp) {
        this.hp -= hp;
    }

    @Override
    public void attackedBy(Hunter hunter) {
        beAttacked(100);
    }

    @Override
    public boolean alive() {
        return hp > 0;
    }

    @Override
    public String name() {
        return "X";
    }
}
