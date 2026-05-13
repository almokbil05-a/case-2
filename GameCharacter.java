
package character;


public class GameCharacter extends CharacterComponent {

    private int speed;
    private int power;
    private int defense;
    private String specialAbility;

    public GameCharacter(String name, String element, int speed,
                         int power, int defense, String specialAbility) {

        super(name, element);

        this.speed = speed;
        this.power = power;
        this.defense = defense;
        this.specialAbility = specialAbility;
    }

    @Override
    public void showDetails() {

        System.out.println("Character Name: " + name);
        System.out.println("Element: " + element);
        System.out.println("Speed: " + speed);
        System.out.println("Power: " + power);
        System.out.println("Defense: " + defense);
        System.out.println("Special Ability: " + specialAbility);
        System.out.println("----------------------------");
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getDefense() {
        return defense;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    

