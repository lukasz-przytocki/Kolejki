import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 33);
        Person person2 = new Person("Anna", "Zawada", 28);
        Person person3 = new Person("Piotr", "Nowak", 11);
        Person person4 = new Person("Katarzyna", "Las", 19);
        Person person5 = new Person("Aleksandra", "Drzewiecka", 55);

        Queue<Person> patiens = new LinkedList<>();
//        Queue<Person> patiens = new PriorityQueue<>();
        patiens.offer(person1);
        patiens.offer(person2);
        patiens.offer(person3);
        patiens.offer(person4);
        patiens.offer(person5);
        patiens.offer(new Person("Natalia", "Buksa", 34));

        while (!patiens.isEmpty()){
            System.out.println("Pacient proszony do gabinetu: "+patiens.peek());
            System.out.println("Obsłużony: "+patiens.poll());
        }
    }
}
