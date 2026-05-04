class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int temp=0;
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<r;i++){
            int start=0;
            int end=c-1;
            while(start<end){
                temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
        System.out.print("[");
        for(int i=0;i<r;i++){
            System.out.print("[");
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]);
                if(j!=c-1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if(i!=r-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}