public class Ravenclaw extends Hogwarts{
    private int smartness;
    private int wisdom;
    private int wit;
    private int creativity;


    public Ravenclaw(String name,
                     int magicPower,
                     int transgressionDistance,
                     int wit,
                     int smartness,
                     int wisdom,
                     int creativity) {
        super(name, magicPower, transgressionDistance);
        if (wit < 0) {
            throw new IllegalArgumentException("Wit is lower than 0!");
        } else if (wit > 100) {
            throw new IllegalArgumentException("Wit is higher than 100!");
        } else if (smartness < 0) {
            throw new IllegalArgumentException("Smartness is lower than 0!");
        } else if (smartness > 100) {
            throw new IllegalArgumentException("Smartness is higher than 100!");
        } else if (wisdom < 0) {
            throw new IllegalArgumentException("Wisdom is lower than 0!");
        } else if (wisdom > 100) {
            throw new IllegalArgumentException("Wisdom is higher than 100!");
        } else if (creativity < 0) {
            throw new IllegalArgumentException("Creativity is lower than 0!");
        } else if (creativity > 100) {
            throw new IllegalArgumentException("Creativity is higher than 100!");
        } else {
            this.wit = wit;
            this.wisdom = wisdom;
            this.smartness = smartness;
            this.creativity = creativity;
        }
    }

    public int getSmartness() {
        return smartness;
    }

    public void setSmartness(int smartness) {
        this.smartness = smartness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void compareRavenclaw (Ravenclaw studentToCompare) {
        int sumForStudent1 = this.getCreativity() + this.getWisdom() + this.getWit() + this.getSmartness();
        int sumForStudent2 = studentToCompare.getCreativity() + studentToCompare.getWisdom() + studentToCompare.getWit() + studentToCompare.getSmartness();
        if (sumForStudent1 > sumForStudent2) {
            System.out.println(this.getName() + " is better Ravenclaw student than " + studentToCompare.getName());
        } else if (sumForStudent2 > sumForStudent1) {
            System.out.println(studentToCompare.getName() + " is better Ravenclaw student than " + this.getName());
        } else if (this.getName().equals(studentToCompare.getName())) {
            System.out.println("You're trying to compare student to himself (or herself)");
        } else {
            System.out.println(this.getName() + " and " + studentToCompare.getName() + " are equal Ravenclaw students");
        }
    }
}
