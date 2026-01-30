class ReverseString {

    String reverse(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        int start = 0;
        int end = str.length()-1;

        while(start<end){
            char temp = str.charAt(start);
            str.setCharAt(start, str.charAt(end));
            str.setCharAt(end, temp);
            start++;
            end--;
        }
       return str.toString(); 
    }
  
}
