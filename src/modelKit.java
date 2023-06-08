import java.io.Serializable;

public class modelKit implements Serializable {

    //default serialVersion id
    private static final long serialVersionUID = 1L;
    private String gameSystem;
    private String faction;
    private int numberOfModels;
    private int priority;


    public modelKit(String gameSystem, String faction, int numberOfModels, int priority) {
        this.gameSystem = gameSystem;
        this.faction = faction;
        this.numberOfModels = numberOfModels;
        this.priority = priority;
    }

    public String getGameSystem() {
        return gameSystem;
    }

    public void setGameSystem(String gameSystem) {
        this.gameSystem = gameSystem;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public int getNumberOfModels() {
        return numberOfModels;
    }

    public void setNumberOfModels(int numberOfModels) {
        this.numberOfModels = numberOfModels;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }


    @Override
    public String toString() {
       String outputString = "";
       outputString += "Game System: " + this.gameSystem;
        outputString += " || Faction: " + this.faction;
        outputString += " || Number of Models: " + this.numberOfModels;
        outputString += " || Priority: " + this.priority;
       outputString += ".\n";
        return outputString;
    }
}
