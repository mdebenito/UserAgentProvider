import loader.UserAgentStringLoader;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by tf05046 on 29/03/2017.
 */
public class RandomnessTest {
    @Test
    public void generateRandomUserAgentString(){
        try {
            UserAgentStringLoader sl = new UserAgentStringLoader();
            String uas = sl.getRandomUserAgentString();
            for(int i=0;i<99;i++){
                String generated = sl.getRandomUserAgentString();
                assertNotEquals(uas,generated);
                uas = generated;
                System.out.println("String generated: "+uas);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
