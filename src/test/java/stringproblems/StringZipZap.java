package stringproblems;

public class StringZipZap {
    public String zipZap(String str) {

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            // extract single letter and add them to th result
            result += str.substring(i, i+1);

            if(i > 0 && i < str.length()-1) {
                if(str.charAt(i-1)=='z' && str.charAt(i+1)=='p') {
                    result = result.substring(0, result.length()-1);
                }
            }
        }

        return result;
}
}
