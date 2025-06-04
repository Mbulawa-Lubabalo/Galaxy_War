package game.code.clientSide.client.airCraft;

//import javax.swing.text.Position;

public class FighterJet {
     private String name;
     private int lives;
     private String status;

    public static final Position CENTRE = new Position(0,0);
    private Position position;


    public FighterJet(){
     this.name = "bob";
     this.lives = 3;
     this.status = "Ready";
     this.position = CENTRE;

    }

    public Position getPosition() {
        return position;
    }

    public void add(FighterJet fighterJet) {
    }
}
