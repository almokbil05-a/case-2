package map;

public abstract class MapComponent {

    protected String mapName;

    public MapComponent(String mapName) {
        this.mapName = mapName;
    }

    public abstract void showDetails();

    public abstract int getDifficulty();
}