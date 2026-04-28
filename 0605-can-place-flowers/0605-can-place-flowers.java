class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (len == 1) {
                    n--;
                    flowerbed[i] = 1;
                } else {

                    if (i == 0 && flowerbed[i + 1] == 0) {

                        flowerbed[i] = 1;
                        n--;
                    }
                    if (i == len - 1 && flowerbed[i - 1] == 0) {

                        flowerbed[i] = 1;
                        n--;

                    }
                    if (i < len - 1 && i > 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        //place the flower
                        flowerbed[i] = 1;
                        n--;
                    }
                }
            }
        }

        if (n <= 0) {
            return true;
        }
        return false;
    }
}