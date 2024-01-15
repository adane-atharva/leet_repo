/*Problem Statement : 
You are given an array of strings words (0-indexed).

In one operation, pick two distinct indices i and j, where words[i] is a non-empty string, 
and move any character from words[i] to any position in words[j].

Return true if you can make every string in words equal using any number of operations, 
and false otherwise.
 */

public class make_all_equal {

    public boolean makeEqual(String[] words) {

        int count = words.length;
        int [] arr = new int[26];

        for (String s : words)
        {
            for (Character c : s.toCharArray())
            {
                arr[c - 'a'] +=1;
            }
        }

        for(int j : arr){
            if(j%count!=0)
                return false;
        }    
        return true;
    }
    
}
