package mail;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() throws IOException {

        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        Path path = Paths.get(s);
        byte[] bytes = Files.readAllBytes(path);
        List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);

        String text = "";
        for (int i = 0; i < allLines.size(); i++) {
            text += allLines.get(i);
            return text;
        }
    }
}
