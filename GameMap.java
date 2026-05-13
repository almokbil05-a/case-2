
package map;


public class GameMap extends MapComponent {

    private String environment;
    private int difficulty;
    private String weather;

    public GameMap(String mapName, String environment,
                   int difficulty, String weather) {

        super(mapName);

        this.environment = environment;
        this.difficulty = difficulty;
        this.weather = weather;
    }

    @Override
    public void showDetails() {

        System.out.println("Map Name: " + mapName);
        System.out.println("Environment: " + environment);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Weather: " + weather);
        System.out.println("----------------------------");
    }

    @Override
    public int getDifficulty() {
        return difficulty;
    }
}
