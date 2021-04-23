package stringproblems;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        String result =str.substring(0,n);
        for(int i=1;i<n;i++)
        {
            result=result +str.substring(0,n-i);
        }
        return result;
    }
}
