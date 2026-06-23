class Solution {
    int maxPeopleDefeated(int p) {
        // code here
        int sum = 0;
        int count = 0;
        for(int i = 1; i < p; i++){
            sum += i*i;
            if(sum <= p){
                count++;
            }
            if(sum >= p){
                return count;
            }
        }
        return count;
    }
};