/**This is a demo task.

        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.

        Assume that:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].
        Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
**/

class missingInteger {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(new missingInteger().solution(A));
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = 1000000;
        boolean[] positive = new boolean[N];

        for(int i : A) {
            if (i <= 0) continue;
            positive[i-1] = true;
        }

        int i = 0;
        for (i = 0; i < A.length; i++) {
            if (!positive[i]) return i+1;
        }
        return i+1;
    }
}