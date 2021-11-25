package mail;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Client {
    private int id;
    private String name;
    private int age;
    private Gender sex;

    public Client(){
        id = IDgenerator.generateID();
    }

    public static class IDgenerator {
        private static int counter = 0;

        public static int generateID(){
            counter++;
            return counter;
        }
    }
}
