public class Slytherin extends Hogwarts{
    private int trickery;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int powerThirst;


    public Slytherin (String name,
                      int magicPower,
                      int transgressionDistance,
                      int trickery,
                      int determination,
                      int ambition,
                      int ingenuity,
                      int powerThirst) {
        super(name, magicPower, transgressionDistance);
        if (trickery < 0) {
            throw new IllegalArgumentException("Trickery is lower than 0!");
        } else if (trickery > 100) {
            throw new IllegalArgumentException("Trickery is higher than 100!");
        } else if (determination < 0) {
            throw new IllegalArgumentException("Determination is lower than 0!");
        } else if (determination > 100) {
            throw new IllegalArgumentException("Determination is higher than 100!");
        } else if (ambition < 0) {
            throw new IllegalArgumentException("Ambition is lower than 0!");
        } else if (ambition > 100) {
            throw new IllegalArgumentException("Ambition is higher than 100!");
        } else if (ingenuity < 0) {
            throw new IllegalArgumentException("Ingenuity is lower than 0!");
        } else if (ingenuity > 100) {
            throw new IllegalArgumentException("Ingenuity is higher than 100!");
        } else if (powerThirst < 0) {
            throw new IllegalArgumentException("Thirst for power is lower than 0!");
        } else if (powerThirst > 100) {
            throw new IllegalArgumentException("Thirst for power is higher than 100!");
        } else {
            this.trickery = trickery;
            this.determination = determination;
            this.ambition = ambition;
            this.ingenuity = ingenuity;
            this.powerThirst = powerThirst;
        }
    }

    public int getTrickery() {
        return trickery;
    }

    public void setTrickery(int trickery) {
        this.trickery = trickery;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getPowerThirst() {
        return powerThirst;
    }

    public void setPowerThirst(int powerThirst) {
        this.powerThirst = powerThirst;
    }
    public void compareSlytherin (Slytherin studentToCompare) {
        int sumForStudent1 = this.getAmbition() + this.getTrickery() + this.getIngenuity() + this.getDetermination() + this.getPowerThirst();
        int sumForStudent2 = studentToCompare.getAmbition() + studentToCompare.getTrickery() + studentToCompare.getIngenuity() + studentToCompare.getDetermination() + studentToCompare.getPowerThirst();;
        if (sumForStudent1 > sumForStudent2) {
            System.out.println(this.getName() + " is better Slytherin student than " + studentToCompare.getName());
        } else if (sumForStudent2 > sumForStudent1) {
            System.out.println(studentToCompare.getName() + " is better Slytherin student than " + this.getName());
        } else if (this.getName().equals(studentToCompare.getName())) {
            System.out.println("You're trying to compare student to himself (or herself)");
        } else {
            System.out.println(this.getName() + " and " + studentToCompare.getName() + " are equal Slytherin students");
        }
    }
}
