package group5pokemon;

public class digimon {
    // how to create a public variables for name and type
    public String name;
    public String type;

    // How to create Private variables for level and health
    private int level;
    private int health;
   //below is a constructor presenting only the name and type of digimon. this is an after step
    public digimon(String name, String type) {
        this.name = name;
        this.type = type;
    }
    // Below is using a constructor to call on the  variables we created above
    public digimon(String name, String type, int level, int health ) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.health = health;
    }
        // this is where we use methods to access private variables
        public int getLevel() {
            return level;
        }
        public int getHealth() {
            return health;
        }
        public String setlevel(){
            return setlevel();
        }
        public String sethealth(){
            return sethealth();
        }

    public void displayinfo(){

        System.out.println(name + " is a " + type + " type ");
        System.out.println("The level is " + level  +   " and the health is " + health);
        }
    }


