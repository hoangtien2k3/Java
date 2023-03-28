package src.game.GameHuntWumpus.src.main.java.com.oop.game;

import src.game.GameHuntWumpus.src.main.java.com.oop.GameConfig;
import src.game.GameHuntWumpus.src.main.java.com.oop.model.*;
import src.game.GameHuntWumpus.src.main.java.com.oop.model.Character;
import src.game.GameHuntWumpus.src.main.java.com.oop.validator.GameUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Game {
    private final Hunter hero;
    private final GameConfig gameConfig;
    private final List<Monster> monster;
    private final HunterActivity heroActivity;


    public Game(GameConfig config) {
        gameConfig = config;
        hero = generateHero(config.getBulletCount());
        monster = generateMonsters(hero, config.getNumberOfMonsters());
        heroActivity = new HunterActivity(hero, gameConfig.getMapSize(), monster, this::printMap);

        printMap();
    }

    private Hunter generateHero(int bulletCount) {
        final Location location = GameUtils.generateRandomLocation(gameConfig.getMapSize());
        return new RobinHood(bulletCount, location);
    }

    private List<Monster> generateMonsters(Hunter hero, int noOfMonsters) {
        final var generatedMonsters = new ArrayList<Monster>(noOfMonsters);
        for (int i = 0; i < noOfMonsters; i++) {
            final var ignoreLocations = generatedMonsters.stream().map(Monster::getLocation).collect(Collectors.toList());
            ignoreLocations.add(hero.getLocation());
            final var monsterLocation = GameUtils.generateRandomLocation(gameConfig.getMapSize(), ignoreLocations);
            final var bat = new Bear(monsterLocation);
            generatedMonsters.add(bat);
        }
        return generatedMonsters;
    }

    private void printMap() {
        System.out.println("\n");
        System.out.println("-------------------------------------------------\n");
        for (int y = 0; y < gameConfig.getMapSize(); y++) {
            for (int x = 0; x < gameConfig.getMapSize(); x++) {
                System.out.print(printText(x, y));
                System.out.print(" ");
            }
            System.out.println();
        }

        if (monster.isEmpty()) {
            win();
            return;
        }

        if (hero.getLocation().nearAnyLocation(monster.stream().map(Character::getLocation).collect(Collectors.toList()))) {
            System.out.println("Near the monster");
        }

        checkHeroIsOnMonster();
        checkHeroIsOutOfBullet();
    }

    private void win() {
        System.out.println("Win!!!");
        System.exit(0);
    }

    private void checkHeroIsOutOfBullet() {
        if (hero.outOfBullet()) {
            lose();
        }
    }

    private void lose() {
        System.out.println("Game over!!!");
        System.exit(1);
    }

    private void checkHeroIsOnMonster() {
        boolean stepOnMonster = monster
                .stream()
                .map(Monster::getLocation)
                .anyMatch(l -> l.equals(hero.getLocation()));
        if (stepOnMonster) {
            lose();
        }
    }

    private String printText(int x, int y) {
        final var currentLocation = new Location(x, y);
        if (currentLocation.equals(hero.getLocation())) {
            return hero.name();
        }

        final var monsterOpt = monster
                .stream()
                .filter(monster -> monster.getLocation().equals(currentLocation))
                .findFirst();
        if (monsterOpt.isEmpty()) {
            return "-";
        }
        if (gameConfig.isHideMonsterLocation()) {
            return "-";
        }
        return monsterOpt.get().name();
    }

    public HunterActivity hero() {
        return heroActivity;
    }
}
