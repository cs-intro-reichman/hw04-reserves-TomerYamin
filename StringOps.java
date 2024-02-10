public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {    
        System.out.println(camelCase(" Intro to coMPUter sCIEncE "));
       }
        

    public static String capVowelsLowRest (String string) {
        String lowerString = "";
        String ansString = "";
        
        for (int i = 0; i < string.length(); i++)  {
            if ((string.charAt(i) > 64) && (string.charAt(i) < 91)) {
                lowerString += (char)(string.charAt(i)+32); 
            }

            else {
                lowerString += (char)(string.charAt(i));
            }
        }
            for (int j = 0; j < lowerString.length(); j++)  {
                if ((lowerString.charAt(j) == 97) || (lowerString.charAt(j) == 101) || (lowerString.charAt(j) == 105) || (lowerString.charAt(j) == 111) || (lowerString.charAt(j) == 117)) {
                    ansString += (char)(lowerString.charAt(j) - 32);
            }
            
            else{
                ansString += (char)(lowerString.charAt(j));
            }

        }
        return ansString;
    }

    /////////////////////////////////////////////////////////////////////////



    public static String camelCase (String string) {
        String strFirstLower = "";
        String firstEachWord = "";
        String ansString = "";
        for (int i = 0; i < string.length() ; i++){
            if (string.charAt(i) < 91 && string.charAt(i) > 64 && string.charAt(i) != 32) {
                strFirstLower += (char)(string.charAt(i) + 32); 
            }
            else {
                strFirstLower += (char)string.charAt(i);
            }

        }

        firstEachWord += strFirstLower.charAt(0);


        for (int j = 1; j < strFirstLower.length(); j++) {
            if ((strFirstLower.charAt(j) > 96 && strFirstLower.charAt(j) < 123) && (strFirstLower.charAt(j - 1) == 32)){
                firstEachWord += (char)(strFirstLower.charAt(j) - 32);
            }
            else {
                firstEachWord += (char)(strFirstLower.charAt(j));
            }
            
        }
        
        for (int t = 0; t < firstEachWord.length(); t++) {
            if (firstEachWord.charAt(t) != 32) {
                ansString += (char)(firstEachWord.charAt(t));
            }
        }
        
        return ansString;
    }
    




    //////////////////////////////////////////////////////////////////////////

    public static int[] allIndexOf (String string, char chr) {
        int letterIndex = 0;
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == chr) {
                count++;
            }
        }

        int[] arr = new int[count];
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                arr[letterIndex] = i;
                letterIndex++;
            }
        }
        

        return arr;
    }
}
