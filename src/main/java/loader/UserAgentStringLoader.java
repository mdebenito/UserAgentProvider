package loader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by tf05046 on 29/03/2017.
 */
public class UserAgentStringLoader {
    private List<String> userAgentStrings;
    private int lastUsedIndex;

    public UserAgentStringLoader() throws FileNotFoundException {
        this.userAgentStrings = new ArrayList<String>();
        this.lastUsedIndex = 0;
        loadStrings();
    }

    private void loadStrings() throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("browserstrings.dat").getFile());

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            this.userAgentStrings.add(line);
        }

        scanner.close();
    }


    public List<String> getUserAgentStrings() {
        return userAgentStrings;
    }

    public String getRandomUserAgentString(){
        int randomIndex = generateRandomInt(0,this.userAgentStrings.size()-1);
        if(randomIndex != lastUsedIndex) {
            lastUsedIndex = randomIndex;
            return this.userAgentStrings.get(randomIndex);
        }else{
            return getRandomUserAgentString();
        }
    }

    private int generateRandomInt(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}
