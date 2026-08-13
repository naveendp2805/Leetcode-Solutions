class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for(int i=0; i<n; i++)
        {
            flip(image[i]);

            for(int j=0; j<n; j++)
                image[i][j] = image[i][j] == 0 ? 1 : 0;
        }

        return image;
    }

    private static void flip(int[] arr)
    {
        int i=0, j=arr.length-1;

        while(i < j)
        {
            int t = arr[i];
            arr[i++] = arr[j];
            arr[j--] = t;
        }
    }
}