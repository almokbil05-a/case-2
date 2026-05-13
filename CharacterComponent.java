
package character;

public abstract class CharacterComponent {
    
    protected String name;
    protected String element;

    public CharacterComponent(String name, String element) {
        this.name = name;
        this.element = element;
    }

    public abstract void showDetails();

    public abstract int getPower();

    public abstract int getDefense();
}
    
   
