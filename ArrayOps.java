public class ArrayOps {
    public static void main(String[] args) {

     System.out.println(isSorted(new int[] {1, -2, 3})); 
     
    }

    public static int findMissingInt (int [] array) {
        int firstInt = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j=0; j < array.length; j++) {
                    if (firstInt == array[j]) {
                        firstInt++;
                    }
                }

         }

        return firstInt;
        }
        
    //////////////////////////////////////////////////////////

    public static int secondMaxValue(int [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        } 
        return array[array.length-2];
    }


    //////////////////////////////////////////////////////////

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean array1Check = false;
        for (int i =0; i < array1.length; i++) {
            array1Check = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array1[j]) {
                    array1Check = true;
                } 
            
            }

            if (array1Check == false) {
                return false;
            }
        }

        boolean array2Check = false;
        for (int i =0; i < array2.length; i++) {
            array2Check = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    array2Check = true;
                } 
            
            }

            if (array2Check == false) {
                return false;
            }
        }
        return true;
    }

    //////////////////////////////////////////////////////////


    public static boolean isSorted(int [] array) {
        boolean flagIncrease = true;
        boolean flagDecrease = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                flagIncrease = false;
            }
            
        }

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i+1]) {
                flagDecrease = false;
            }
        }

        return (flagIncrease || flagDecrease);
    }
}
