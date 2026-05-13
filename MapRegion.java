
package map;

import java.util.ArrayList;
import java.util.List;

public class MapRegion extends MapComponent {

    private String regionName;
    private List<MapComponent> maps;

    public MapRegion(String regionName) {

        super(regionName);

        this.regionName = regionName;
        maps = new ArrayList<>();
    }

    public void add(MapComponent map) {
        maps.add(map);
    }

    public void remove(MapComponent map) {
        maps.remove(map);
    }

    @Override
    public void showDetails() {

        System.out.println("Region Name: " + regionName);
        System.out.println("Maps Inside Region:");

        for (MapComponent map : maps) {
            map.showDetails();
        }

        System.out.println("Total Region Difficulty: " + getDifficulty());
        System.out.println("============================");
    }

    @Override
    public int getDifficulty() {

        int totalDifficulty = 0;

        for (MapComponent map : maps) {
            totalDifficulty += map.getDifficulty();
        }

        return totalDifficulty;
    }
}