public class FrequencyOfNumberInArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 4, 5, 2, 3, 6, 5};
        int visited = -1;

//        for (int i = 0; i < array.length; i++) {
//            int count = 0;
//            boolean matched = false;
//            boolean firstTime = true;
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] == array[j] && array[j] != visited) {
//                    count++;
//                    if (matched) {
//                        array[j] = visited;
//                    }
//                    if (firstTime) {
//                        matched = true;
//                        firstTime = false;
//                    }
//                }
//            }
//            if (array[i] != visited) {
//                System.out.println("The frequency of " + array[i] + " is: " + count);
//            }
//            array[i] = visited;
//        }

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    array[j] = visited;
                }
            }
            if (array[i] != visited) {
                System.out.println("The frequency of " + array[i] + " is: " + count);
            }
        }

    }
}
