package quiztastic.app;

import org.junit.jupiter.api.Test;
import quiztastic.domain.QuestionRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class ListQuestionRepositoryTest {

    Path pathToSmallQuestionFile() {
        URL url = this.getClass()
                .getClassLoader()
                .getResource("questions-small.tsv");
        if (url == null) fail();
        return Path.of(url.getFile());
    }
    @Test
    void shouldReadALine() throws IOException {
        Reader a = new StringReader("kurt\nViggo");
        BufferedReader br = new BufferedReader(a);
        assertEquals(br.readLine(),"kurt");
        assertEquals(br.readLine(),"Viggo");
    }

    @Test
    void shouldReadTheSmallQuestionFile() throws IOException {
        QuestionReader reader = new QuestionReader(
                Files.newBufferedReader(pathToSmallQuestionFile()));
        QuestionRepository repo =
                ListQuestionRepository.fromQuestionReader(reader);
        repo.getQuestion(0);
        // Perform tests of equality
    }

}