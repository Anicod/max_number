public class Maxnumber {
    public static void main(String[] args) {
        Integer array[] = {3, 8, 10};
        Float array1[] = {1.2f, 2.1f, 3.2f};
        String array2[] = {"animesh", "harsh", "navneet"};

        maxNumber(array);
        maxFract(array1);
        maxString(array2);


    }

    static void maxNumber(Integer array[]) {
        Integer max = array[0];
        for (int index = 1; index < 3; index++) {
            if (array[index].compareTo(max) > 0)
                max = array[index];
        }

        array[2] = array[1];
        array[1] = array[0];
        array[0] = max;
        System.out.println("The given array max number at first position");
        for (int index : array) {
            System.out.println(index);
        }
    }
    static void maxFract(Float array1[]) {
        Float max = array1[0];
        for (int index = 1; index < 3; index++) {
            if (array1[index].compareTo(max) > 0)
                max = array1[index];
        }
        array1[2] = array1[1];
        array1[1] = array1[0];
        array1[0] = max;
        System.out.println("The given array max number at first position");
        for (float index : array1) {
            System.out.println(index);
        }
    }

    static void maxString(String array2[]){
        String max = array2[0];
        for (int index = 1; index < 3; index++) {
            if (array2[index].compareTo(max) > 0)
                max = array2[index];
        }
        array2[2] = array2[1];
        array2[1] = array2[0];
        array2[0] = max;
        System.out.println("The given array max number at first position");
        for (String index : array2) {
            System.out.println(index);
        }

    }

}


