public class Main {
    public static void main(String[] args) {
        Gryffindor potter = new Gryffindor("Harry Potter", 100, 100, 100, 100, 100);
        Gryffindor granger = new Gryffindor("Hermione Granger", 90, 89, 90, 90, 100);
        Gryffindor weasley = new Gryffindor("Ron Weasley", 75, 60, 99, 87, 88);
        Hufflepuff smith = new Hufflepuff("Zacharias Smith", 56, 61, 45, 34, 78);
        Hufflepuff diggory = new Hufflepuff("Cedric Diggory", 62, 25, 78, 24, 89);
        Hufflepuff finchFletchley = new Hufflepuff("Justin Finch-Fletchley", 56, 29, 48, 90, 12);
        Ravenclaw chang = new Ravenclaw("Cho Chang", 45, 68, 34, 78, 78, 42);
        Ravenclaw patil = new Ravenclaw("Padma Patil", 45, 67 ,85, 33, 55, 66);
        Ravenclaw belby = new Ravenclaw("Marcus Belby", 35, 4, 79, 64, 2, 78);
        Slytherin malfoy = new Slytherin("Draco Malfoy", 45, 11, 97, 56, 43, 22, 100);
        Slytherin montague = new Slytherin("Graham Montague", 36, 78, 54, 36, 12, 56, 49);
        Slytherin goyle = new Slytherin("Gregory Goyle", 56, 89, 45, 77, 35, 67, 78);

        PrintService printService = new PrintService();
        printService.print(potter);
        printService.print(smith);
        printService.print(chang);
        printService.print(malfoy);

        weasley.compareGryffindor(granger);
        diggory.compareHufflepuff(finchFletchley);
        patil.compareRavenclaw(belby);
        montague.compareSlytherin(goyle);

        potter.compareHogwarts(malfoy);
        smith.compareHogwarts(chang);
    }
}