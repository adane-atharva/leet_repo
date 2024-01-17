/*Problem Statement : 
Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.

Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, so she asks Bob for help. Bob can remove some balloons from the rope to make it colorful. You are given a 0-indexed integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove the ith balloon from the rope.

Return the minimum time Bob needs to make the rope colorful.
 * 
 */
class Solution {
    public int minCost(String colors, int[] neededTime) {

        int ans = 0;
        int len = neededTime.length;
        if(len == 1)
            return ans;
        int cp = 0;
        int next = 1;

        while (next < len) {
            if (colors.charAt(cp) == colors.charAt(next)) {
                
                if (neededTime[cp] < neededTime[next]) {
                    ans += Math.min(neededTime[cp], neededTime[next]);
                    cp = next;
                    next+= 1;
                    continue;
                } 
                if (neededTime[cp] > neededTime[next]) 
                {
                    ans += Math.min(neededTime[cp], neededTime[next]);
                    next+=1;
                    continue;
                }
                if (neededTime[cp] == neededTime[next])
                {
                    ans+=neededTime[cp];
                    cp = next;
                    next+=1;
                    continue;
                }

            } else {
                cp = next;
                next+=1;
            }

        }
        return ans;

    }
}
public class colorful_rope {
    
}
