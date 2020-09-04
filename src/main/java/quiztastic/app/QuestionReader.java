package quiztastic.app;

import quiztastic.core.Question;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.nio.file.Path;

/**
 * The Question Reader should read the questions from a file.
 */
public class QuestionReader {
    private final BufferedReader reader;

    public QuestionReader(BufferedReader reader) {
        this.reader = reader;
    }

    public QuestionReader(Reader reader) {
        this(new BufferedReader(reader));
    }

    public BufferedReader getReader() {
        return reader;
    }

    public Question readQuestion() throws IOException {
        String line = "";
        Question tmpQ = null;
        while((line=reader.readLine())!=null) {
            String[] lineArr = line.split("\t");

            for(int i=0;i<lineArr.length;i++) {
                System.out.println(lineArr[i]);
            }
        }
        return tmpQ;
    }

}
