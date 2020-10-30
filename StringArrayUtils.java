
/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean result = false;
        for(int i=0; i<array.length;i++){
            if(array[i]==null) {
        		return false;
        	}
            if(array[i].equalsIgnoreCase(value)){
                result = true;
                break;}
        }
        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String temp;
        for (int start = 0, end = array.length - 1; start <= end; start++, end--) {
            temp = array[start];
            array[start]=array[end];
            array[end]=temp;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        for (int start = 0, end = array.length - 1; start <= end; start++, end--) {
            if(array[start]!=array[end]){
                return false;
            }
        }
        return true;

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String s= new String();
        for(String i : array){
            s=s.concat(i);
        }
        String s2 = s.replaceAll(" ", "");
        char[] ccc=s2.toCharArray();
        int c=0;
        
        String[] l= new String[26];
        
        for(char cc:ccc){        
          if(!contains(l,String.valueOf(cc))){
                l[c]=String.valueOf(cc);
                
               c++;}
         
        }
        
        return c>25;
        
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int c = 0;
        for(int i=0; i<array.length;i++){
            if(array[i].equals(value)){
                c ++;
                }
        }
        return c;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int c=0;
        for(int i = 0; i<array.length;i++){
               if(array[i].equals(valueToRemove)){
                   c++;
                }
        }
        String[] result= new String[array.length-c];
        int b=0;
        for(int i = 0; i<array.length;i++){
               if(!array[i].equals(valueToRemove)){
                   result[b]=array[i];
                   b++;
                }
        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int c=0;
        for(int i = 1; i<array.length;i++){
               if(array[i].equals(array[i-1])){
                   c++;
                }
        }
        String[] result= new String[array.length-c];
        int b=1;
        for(int i = 1; i<array.length;i++){
               if(!array[i].equals(array[i-1])){
                   result[b]=array[i];
                   b++;
                }
        }
        result[0]=array[0];
        return result;
    }
    

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int c=1;
        for(int i = 1; i<array.length;i++){
               if(!array[i].equals(array[i-1])){
                   c++;
                }
        }
        String[] result= new String[c];
        int b=0;
        result[0]=array[0];
        String temp;
        for(int i = 1; i<array.length;i++){
               if(array[i].equals(array[i-1])){
                    temp=result[b].concat(array[i]);
                   result[b]=temp;
                   
                }
                else{
                    b++;
                    result[b]=array[i];}
                    
                    
        }
        
        return result;
    }

}
