import java.util.Random;
import static java.lang.System.out;


public class player {
    Random rand = new Random();
    String race = new String();
    String color = new String("red");
    int id = rand.nextInt(16 + 1);
    String name = new String("Player" + id);

    public String getRace(int id) {
        Race.getRaceValueById(id);
        return race;
    }
    /*public Color getColor(id) {
        Color.getColorValueById(id);
    }*/
    public player(String race, String color, String name){
        this.name = name;
        this.race = race;
        this.color = color;
    }

}

