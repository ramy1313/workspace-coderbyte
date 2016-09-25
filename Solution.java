// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public String solution(String S) {
        // write your code in Java SE 8
        Map<String, String> rules = new HashMap<String, String>();
        rules.put("AB", "AA");
        rules.put("BA", "AA");
        rules.put("CB", "CC");
        rules.put("BC", "CC");
        rules.put("AA", "A");
        rules.put("CC", "C");
        int i = 0;
        int l = S.length() - 1;
        while (i < l) {
            String sub = S.substring(i, i+2);
            String replacement = rules.get(sub);
            if (replacement == null) {
            	i++;
                continue;
            }
            S = S.replaceAll(sub, replacement);
            i = 0;
            l = S.length() - 1;
        }
        return S;
    }
    /**
     * @author rami 
     * @param args 
     * @return
     *
     */
    public static void main (String[] args) {
    	Solution sol = new Solution();
    	System.out.print(sol.solution("ABBCC"));
    }
}
