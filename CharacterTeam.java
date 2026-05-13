
package character;
import java.util.ArrayList;
import java.util.List;

public class CharacterTeam extends CharacterComponent {

    private String teamName;
    private List<CharacterComponent> members;

    public CharacterTeam(String teamName) {

        super(teamName, "Mixed");

        this.teamName = teamName;
        members = new ArrayList<>();
    }

    public void add(CharacterComponent character) {
        members.add(character);
    }

    public void remove(CharacterComponent character) {
        members.remove(character);
    }

    @Override
    public void showDetails() {

        System.out.println("Team Name: " + teamName);
        System.out.println("Team Members:");

        for (CharacterComponent member : members) {
            member.showDetails();
        }

        System.out.println("Total Team Power: " + getPower());
        System.out.println("Total Team Defense: " + getDefense());
        System.out.println("============================");
    }

    @Override
    public int getPower() {

        int totalPower = 0;

        for (CharacterComponent member : members) {
            totalPower += member.getPower();
        }

        return totalPower;
    }

    @Override
    public int getDefense() {

        int totalDefense = 0;

        for (CharacterComponent member : members) {
            totalDefense += member.getDefense();
        }

        return totalDefense;
    }
}