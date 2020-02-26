package Stone;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class LexerTest {
    private Lexer lexer;

    @BeforeAll
    static void initAll() {

    }

    @BeforeEach
    void init() {
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 1;
            }
        };
        Reader reader = new LineNumberReader(new InputStreamReader(inputStream));
        lexer = new Lexer(reader);
    }


    @Test
    void read() {
    }

    @Test
    void readLine() {
    }

    @Test
    void addToken() {
    }

    @Test
    void toStringLiteral() {
        String initialString = "\\123\\\"\\n";
        lexer.toStringLiteral(initialString);
//        assertEquals(expectedString, lexer.toStringLiteral(initialString));
    }
}