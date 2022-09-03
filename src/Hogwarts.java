public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        if (magicPower < 0) {
            throw new IllegalArgumentException("Magic Power is lower than 0!");
        } else if (magicPower > 100) {
            throw new IllegalArgumentException("Magic power is higher than 100!");
        } else if (transgressionDistance < 0) {
            throw new IllegalArgumentException("Transgression distance is lower than 0!");
        } else if (transgressionDistance > 100) {
            throw new IllegalArgumentException("Transgression distance is higher than 100!");
        } else {
            this.name = name;
            this.magicPower = magicPower;
            this.transgressionDistance = transgressionDistance;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void compareHogwarts (Hogwarts studentToCompare) {
        int sumForStudent1 = this.getMagicPower() + this.getTransgressionDistance();
        int sumForStudent2 = studentToCompare.getMagicPower() + studentToCompare.getTransgressionDistance();
        if (sumForStudent1 > sumForStudent2) {
            System.out.println(this.getName() + " has greater magic power than " + studentToCompare.getName());
        } else if (sumForStudent2 > sumForStudent1) {
            System.out.println(studentToCompare.getName() + " has greater magic power than " + this.getName());
        } else if (this.getName().equals(studentToCompare.getName())) {
            System.out.println("You're trying to compare student to himself (or herself)");
        } else {
            System.out.println(this.getName() + " and " + studentToCompare.getName() + " have equal magic power");
        }
    }
}
