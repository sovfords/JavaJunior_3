import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Dan","37");

        try(FileOutputStream fileInputStream= new FileOutputStream("person.bin")) {
            ObjectOutputStream objectInputStream = new ObjectOutputStream(fileInputStream);
            objectInputStream.writeObject(person);
        }

        try(FileInputStream fileInputStream = new FileInputStream("person.bin")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person copyPerson = (Person) objectInputStream.readObject();
            System.out.println(copyPerson);
        }
    }
}