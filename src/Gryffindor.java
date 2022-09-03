public class Gryffindor extends Hogwarts{
    private int bravery;
    private int honor;
    private int nobleness;

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getNobleness() {
        return nobleness;
    }

    public void setNobleness(int nobleness) {
        this.nobleness = nobleness;
    }

    public Gryffindor(String name,
                      int magicPower,
                      int transgressionDistance,
                      int bravery,
                      int honor,
                      int nobleness) {
        super(name, magicPower, transgressionDistance);
        if (bravery < 0) {
            throw new IllegalArgumentException("Bravery is lower than 0!");
        } else if (bravery > 100) {
            throw new IllegalArgumentException("Bravery is higher than 100!");
        } else if (honor < 0) {
            throw new IllegalArgumentException("Honor is lower than 0!");
        } else if (honor > 100) {
            throw new IllegalArgumentException("Honor is higher than 100!");
        } else if (nobleness < 0) {
            throw new IllegalArgumentException("Nobleness is lower than 0!");
        } else if (nobleness > 100) {
            throw new IllegalArgumentException("Nobleness is higher than 100!");
        } else {
            this.bravery = bravery;
            this.honor = honor;
            this.nobleness = nobleness;
        }

    }
    public void compareGryffindor (Gryffindor studentToCompare) {
        int sumForStudent1 = this.getBravery() + this.getNobleness() + this.getHonor();
        int sumForStudent2 = studentToCompare.getBravery() + studentToCompare.getNobleness() + studentToCompare.getHonor();
        if (sumForStudent1 > sumForStudent2) {
            System.out.println(this.getName() + " is better Gryffindor student than " + studentToCompare.getName());
        } else if (sumForStudent2 > sumForStudent1) {
            System.out.println(studentToCompare.getName() + " is better Gryffindor student than " + this.getName());
        } else if (this.getName().equals(studentToCompare.getName())) {
            System.out.println("You're trying to compare student to himself (or herself)");
        } else {
            System.out.println(this.getName() + " and " + studentToCompare.getName() + " are equal Gryffindor students");
        }
    }
}
