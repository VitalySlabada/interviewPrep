package DSA.Bind75.p8_FloodFill;

public class FloodFill {
    public static void main(String[] args) {


        int[][] arr = {{1, 1, 3}, {1, 1, 3}};

        System.out.println(arr[0].length);
        int [][] image = floodFill(arr, 1, 1, 2);
        System.out.println("finish");

    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {


        //check what is old color
        int oldColor = image[sr][sc];
        if (oldColor == newColor) return image;

        //change color
        image[sr][sc] = newColor;

        int height = image.length;
        int width = image[0].length;


        //go up
        if ((sr > 0)) {
            if (image[sr - 1][sc] == oldColor) {
                floodFill(image, sr - 1, sc, newColor);
            }
        }

        //go down
        if ((sr + 1) < height) {
            if (image[sr + 1][sc] == oldColor) {
                floodFill(image, sr + 1, sc, newColor);
            }
        }


        //go left
        if (sc > 0) {
            if (image[sr][sc - 1] == oldColor) {
                floodFill(image, sr, sc - 1, newColor);
            }
        }
        //go right
        if (sc + 1 < width) {
            if (image[sr][sc + 1] == oldColor) {
                floodFill(image, sr, sc + 1, newColor);
            }
        }

        return image;

    }

}
