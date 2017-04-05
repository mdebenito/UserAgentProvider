package loader;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Mario de Benito on 29/03/2017.
 */
public class UserAgentStringLoader {
    private List<String> userAgentStrings;
    private int lastUsedIndex;

    /**
     * Default constructor, initializes the list and loads the strings into it from the configuration file.
     * @throws FileNotFoundException
     */
    public UserAgentStringLoader() throws FileNotFoundException {
        this.userAgentStrings = new ArrayList<String>();
        this.lastUsedIndex = 0;
        loadStrings();
    }

    /**
     * Loads the User Agent strings from the file in resources
     * @throws FileNotFoundException
     */
    private void loadStrings() throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream file = classLoader.getResourceAsStream("browserstrings.dat");

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            this.userAgentStrings.add(line);
        }

        scanner.close();
    }

    /**
     * Returns the current list of User Agent strings.
     * @return a List object that contains all the User Agent Strings configured.
     */
    public List<String> getUserAgentStrings() {
        return userAgentStrings;
    }

    /**
     * Randomly selects one of the configured User Agent strings and returns it.
     * @return A random User Agent string.
     */
    public String getRandomUserAgentString(){
        int randomIndex = generateRandomInt(0,this.userAgentStrings.size()-1);
        if(randomIndex != lastUsedIndex) {
            lastUsedIndex = randomIndex;
            return this.userAgentStrings.get(randomIndex);
        }else{
            return getRandomUserAgentString();
        }
    }

    /**
     * Generates a random integer inside a range.
     * @param min Minimum integer to be generated.
     * @param max Maximum integer to be generated.
     * @return
     */
    private int generateRandomInt(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}
