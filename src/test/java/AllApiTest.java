import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        GetTest.class,
        PostTest.class,
})
//@RunWith(GetTest.class)
public class AllApiTest {
}
