    class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            int biggerSideMax = 0;
            int smallerSideMax = 0;

            for (int[] size : sizes) {
                int currentBiggerSide = Math.max(size[0], size[1]);
                int currentSmallerSide = Math.min(size[0], size[1]);

                if (biggerSideMax < currentBiggerSide) biggerSideMax = currentBiggerSide;
                if (smallerSideMax < currentSmallerSide) smallerSideMax = currentSmallerSide;
            }

            return biggerSideMax * smallerSideMax;
        }
    }