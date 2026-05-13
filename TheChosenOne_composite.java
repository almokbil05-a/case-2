
package the.chosen.one._composite;

import character.CharacterTeam;
import character.GameCharacter;

import map.GameMap;
import map.MapRegion;


public class TheChosenOne_composite {

    
    public static void main(String[] args) {
         GameCharacter kai = new GameCharacter(
                "Kai",
                "Fire",
                90,
                95,
                80,
                "Flame Dragon"
        );

        GameCharacter wyldfyre = new GameCharacter(
                "Wyldfyre",
                "Fire",
                85,
                88,
                75,
                "Wild Fire Blast"
        );

        GameCharacter zane = new GameCharacter(
                "Zane",
                "Ice",
                80,
                85,
                90,
                "Ice Shield"
        );

        // Teams

        CharacterTeam fireTeam = new CharacterTeam("Fire Team");

        fireTeam.add(kai);
        fireTeam.add(wyldfyre);

        CharacterTeam ninjaTeam = new CharacterTeam("Ninja Team");

        ninjaTeam.add(fireTeam);
        ninjaTeam.add(zane);

        // Maps

        GameMap lavaCave = new GameMap(
                "Lava Cave",
                "Volcano",
                90,
                "Hot"
        );

        GameMap iceTemple = new GameMap(
                "Ice Temple",
                "Frozen Land",
                70,
                "Snowy"
        );

        // Regions

        MapRegion elementalRegion = new MapRegion("Elemental Region");

        elementalRegion.add(lavaCave);
        elementalRegion.add(iceTemple);

        // Output

        System.out.println("========== CHARACTERS ==========");
        ninjaTeam.showDetails();

        System.out.println("\n========== MAPS ==========");
        elementalRegion.showDetails();
    
        
    }   
    }
    

