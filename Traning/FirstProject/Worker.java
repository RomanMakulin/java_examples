package FirstProject;

public class Worker {
    int id;
    String firstName;
    String lastName;
    int salary;
    String position;

    @Override
    public String toString() {
        return String.format("id:%d, first name: %s, last name: %s, salary:%d, position:%s", id, firstName, lastName, salary, position);
    }
}
