package stringproblems;

public class CountHi {
    public int countHi(String str) {
        int hiCount = 0;

        for ( int i = str.indexOf( "hi" ); i != -1; i = str.indexOf( "hi", i + 1 ) )
        {
            hiCount++;
        }

        return hiCount;
    }

}
