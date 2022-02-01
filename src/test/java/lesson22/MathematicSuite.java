package lesson22;

import lesson21.CalculatorTest;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({AverageServiceTest.class, CalculatorTest.class})
public class MathematicSuite {

}
