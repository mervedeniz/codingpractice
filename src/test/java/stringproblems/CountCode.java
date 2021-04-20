package stringproblems;

public class CountCode {

    public int countCode(String str) {
        int count = 0;

        for ( int i = 0; i < str.length() - 3; i++ )
        {
            if ( "co".equals( str.substring( i, i + 2 ) ) )
            {
                if ( str.charAt( i + 3 ) == 'e' )
                {
                    count++;
                }
            }
        }

        return count;
    }

}
