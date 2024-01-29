import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfCharacterInArray {

    public static void main(String[] args) {
        String name = "Sagar Shrestha";
        char[] nameArray = name.toLowerCase().replaceAll(" ", "").toCharArray();
        char visited = '0';

        for (int i = 0; i < nameArray.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nameArray.length; j++) {
                if (nameArray[i] == nameArray[j]) {
                    count++;
                    nameArray[j] = visited;
                }
            }

            if (nameArray[i] != visited) {
                System.out.println("The frequency of " + nameArray[i] + " is: " + count);
            }
        }


    }
}
