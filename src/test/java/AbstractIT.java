import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
    locations = {"classpath:applicationContext.xml"}
)
public class AbstractIT {

//    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
}
