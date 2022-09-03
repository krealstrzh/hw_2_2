public class PrintService {

    public void print(Gryffindor student) {
        System.out.println(student.getName() + "; Magic power -- " + student.getMagicPower() + "; Transgression distance -- " + student.getTransgressionDistance() + "; Bravery -- " + student.getBravery() + "; Honor -- " + student.getHonor() + "; Nobleness -- " + student.getNobleness());
    }

    public void print(Hufflepuff student) {
        System.out.println(student.getName() + "; Magic power -- " + student.getMagicPower() + "; Transgression distance -- " + student.getTransgressionDistance() + "; Diligence -- " + student.getDiligence() + "; Honesty -- " + student.getHonesty() + "; Loyalty -- " + student.getLoyalty());
    }

    public void print(Ravenclaw student) {
        System.out.println(student.getName() + "; Magic power -- " + student.getMagicPower() + "; Transgression distance -- " + student.getTransgressionDistance() + "; Creativity -- " + student.getCreativity() + "; Smartness -- " + student.getSmartness() + "; Wit -- " + student.getWit() + "; Wisdom -- " + student.getWisdom());
    }

    public void print(Slytherin student) {
        System.out.println(student.getName() + "; Magic power -- " + student.getMagicPower() + "; Transgression distance -- " + student.getTransgressionDistance() + "; Power thirst -- " + student.getPowerThirst() + "; Ambition -- " + student.getAmbition() + "; Determination -- " + student.getDetermination() + "; Ingenuity -- " + student.getIngenuity()  + "; Trickery -- " + student.getTrickery() );
    }
}
