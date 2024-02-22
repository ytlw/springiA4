package concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:encoreable.xml")
public class EncoreableXMLTest {

    @Autowired
    private Performance drama;
//
//    @Test
//    public void testPerformance() {
//        drama.perform();
//    }

    @Test
    public void testEncorable() {
        Encoreable encoreDrama = Encoreable.class.cast(drama);
        encoreDrama.performEncore();
    }

}
