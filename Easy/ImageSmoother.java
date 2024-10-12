package Easy;

public class ImageSmoother {
    public int[][] imageSmoother(int[][] img) {
        int res[][] = new int[img.length][img[0].length];
        for(int i = 0; i<img.length;i++)
            for(int j =0; j<img[0].length; j++)
                res[i][j] = sm(img, i, j);
        
        return res;
    }
    
    public int sm(int[][] img, int x, int y) {
        int sum = 0;
        int count = 0;
        for(int i = -1; i <= 1; i++) {
            for(int j = -1; j <= 1; j++) {
                int TEMPx = x + i, TEMPy = y + j;
                if(TEMPx < 0 || TEMPx >= img.length || TEMPy < 0 || TEMPy >= img[0].length) 
                    continue;
                sum += img[TEMPx][TEMPy];
                count++;
            }
        }
        return sum/count;
        
    }
}
