import org.junit.jupiter.api.*;
import org.junitpioneer.jupiter.DisableIfTestFails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

//L'annotation @DisableIfTestFails permet d'arreter l'execution des tests une fois 1 echoue
@DisableIfTestFails

// this annotation ensures that tests are run in the order of
// the numbers passed to the `@Order` annotation below
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FirstTest {
    private static Logger logger = LoggerFactory.getLogger(FirstTest.class);

    @Test
    @Order(1)
    public void calculMathematique(){
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
        int x =0;
        int y =5;
        assertEquals(5, x / y);
    }

    @Test
    @Order(2)
    public void calculMathematiqueCorrect(){
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
        int x =0;
        int y =5;
        assertEquals(5, x + y);
    }

}
