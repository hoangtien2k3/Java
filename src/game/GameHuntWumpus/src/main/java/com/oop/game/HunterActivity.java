package src.game.GameHuntWumpus.src.main.java.com.oop.game;

import src.game.GameHuntWumpus.src.main.java.com.oop.model.Hunter;
import src.game.GameHuntWumpus.src.main.java.com.oop.model.Monster;
import src.game.GameHuntWumpus.src.main.java.com.oop.model.Location;

import java.util.List;

public class HunterActivity {
    private final Hunter hero;
    private final int boundary;
    private final List<Monster> monster;
    private final HunterActivityWatcher watcher;

    public HunterActivity(Hunter hero, int boundary, List<Monster> monster, HunterActivityWatcher observe) {
        this.hero = hero;
        this.boundary = boundary;
        this.monster = monster;
        this.watcher = observe;
    }

    public void moveUp() {
        System.out.println("Moving up");
        hero.moveUp(boundary);
        watcher.onComplete();
    }

    public void moveDown() {
        System.out.println("Moving down");
        hero.moveDown(boundary);
        watcher.onComplete();
    }

    public void moveLeft() {
        System.out.println("Moving left");
        hero.moveLeft(boundary);
        watcher.onComplete();
    }

    public void moveRight() {
        System.out.println("Moving right");
        hero.moveRight(boundary);
        watcher.onComplete();
    }



    public void shootUp() {
        System.out.println("Shoot up");
        final var heroLocation = hero.getLocation();
        final var shootLocation = heroLocation.transform(0, -1);
        shoot(shootLocation);
    }

    public void shootDown() {
        System.out.println("Shoot down");
        final var heroLocation = hero.getLocation();
        final var shootLocation = heroLocation.transform(0, 1);
        shoot(shootLocation);
    }

    public void shootLeft() {
        System.out.println("Shoot left");
        final var heroLocation = hero.getLocation();
        final var shootLocation = heroLocation.transform(-1, 0);
        shoot(shootLocation);
    }

    public void shootRight() {
        System.out.println("Shoot right");
        final var heroLocation = hero.getLocation();
        final var shootLocation = heroLocation.transform(1, 0);
        shoot(shootLocation);
    }

    public void shoot(Location shootLocation) {
        final var monter = monster
                .stream()
                .filter(m -> m.getLocation().equals(shootLocation))
                .findAny()
                .orElse(null);
        hero.shoot(monter);
        if (monster != null && !monter.alive()) {
            System.out.println("Good shoot");
            monster.remove(monster);
        }
        watcher.onComplete();
    }

}
