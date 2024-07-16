package group5pokemon;
// you need a main when you are creating a class. this is the main for the digimon class we created
public class digimonRunner {
    public static void main(String[] args) {
        digimon greymon = new digimon("Greymon", "Dinosaur", 12, 300);
        digimon palamon = new digimon("palamon", "idk", 20, 100);

        greymon.displayinfo();
        }
    }

