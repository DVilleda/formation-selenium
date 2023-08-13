import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/** Les Tags ici sont necessaire pour pouvoir definir quelles classes font
 * partie de ma suite */
@Suite
@SelectClasses({FirstTest.class,FlightsTest.class})
public class SuiteTest {
}
