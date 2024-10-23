// There are N children standing in a line. Each child is assigned a rating value given in the integer array ratings.
// You are giving candies to these children subjected to the following requirements:
// Each child must have atleast one candy.
// Children with a higher rating than its neighbors get more candies than their neighbors.
// Return the minimum number of candies you need to have to distribute.

public class Candy{
    public int candy(int[] ratings, int N) {
        int[] candies = new int[N];
        for (int i = 0; i < N; i++) {
            candies[i] = 1;
        }
        for (int i = 1; i < N; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        for (int i = N - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += candies[i];
        }
        return sum;
                
    }
    public static void main(String args[]){
        Candy obj = new Candy();
        int[] ratings = {1, 2, 2};
        System.out.println(obj.candy(ratings, ratings.length));
    }
}

// The time complexity is O(N) due to three loops over the array, and space complexity is O(N) for the `candies` array.