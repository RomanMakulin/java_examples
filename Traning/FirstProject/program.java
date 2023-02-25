package FirstProject;

public class program {
    public static void main(String[] args) {

        Worker w1 = new Worker();
        w1.id = 0;
        w1.firstName = "Roman";
        w1.lastName = "Makulin";
        w1.salary = 300000;
        w1.position = "Team Lead";

        Worker w2 = new Worker();
        w2.id = 1;
        w2.firstName = "Olga";
        w2.lastName = "Makulina";
        w2.salary = 200000;
        w2.position = "Middle+";

        System.out.printf("%s\n%s", w1.toString(), w2.toString());

    }
}
