import java.util.*;
/*
time complexity: O(n)
space complexity: O(n)
 */

public class New21Game {
    public double new21Game(int n, int k, int maxPts) {
        double prob[] = new double[n+1];
        Arrays.fill(prob,0.0);
        prob[0]=1;

        double currprobsum=k>0?1:0;
        for(int i=1;i<=n;i++){
            prob[i]=currprobsum/maxPts;
            if(i<k){
                currprobsum+=prob[i];
            }
            if(i-maxPts>=0 && i-maxPts<k){
                currprobsum-=prob[i-maxPts];
            }
        }
        double res=0.0;
        for(int i=k;i<=n;i++){
            res+=prob[i];
        }
        return res;

    }

}
