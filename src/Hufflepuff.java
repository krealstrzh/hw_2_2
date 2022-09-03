public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name,
                      int magicPower,
                      int transgressionDistance,
                      int diligence,
                      int honesty,
                      int loyalty) {
        super(name, magicPower, transgressionDistance);
        if (diligence < 0) {
            throw new IllegalArgumentException("Diligence is lower than 0!");
        } else if (diligence > 100) {
            throw new IllegalArgumentException("Diligence is higher than 100!");
        } else if (honesty < 0) {
            throw new IllegalArgumentException("Honesty is lower than 0!");
        } else if (honesty > 100) {
            throw new IllegalArgumentException("Honesty is higher than 100!");
        } else if (loyalty < 0) {
            throw new IllegalArgumentException("Loyalty is lower than 0!");
        } else if (loyalty > 100) {
            throw new IllegalArgumentException("Loyalty is higher than 100!");
        } else {
            this.diligence = diligence;
            this.honesty = honesty;
            this.loyalty = loyalty;
        }
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void compareHufflepuff(Hufflepuff studentToCompare) {
        int sumForStudent1 = this.getHonesty() + this.getLoyalty() + this.getDiligence();
        int sumForStudent2 = studentToCompare.getHonesty() + studentToCompare.getLoyalty() + studentToCompare.getLoyalty();
        if (sumForStudent1 > sumForStudent2) {
            System.out.println(this.getName() + " is better Hufflepuff student than " + studentToCompare.getName());
        } else if (sumForStudent2 > sumForStudent1) {
            System.out.println(studentToCompare.getName() + " is better Hufflepuff student than " + this.getName());
        } else if (this.getName().equals(studentToCompare.getName())) {
            System.out.println("You're trying to compare student to himself (or herself)");
        } else {
            System.out.println(this.getName() + " and " + studentToCompare.getName() + " are equal Hufflepuff students");
        }
    }
}
