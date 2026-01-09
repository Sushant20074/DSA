class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> rowList = new ArrayList<>();
        List<Integer> colList = new ArrayList<>();

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    rowList.add(i);
                    colList.add(j);
                }
            }
        }
        set(matrix, rowList, colList);
        
    }

    public void set(int[][] matrix, List<Integer> rowList, List<Integer> colList){
        for(int row: rowList){
            for(int i=0; i<matrix[0].length; i++){
                matrix[row][i] = 0;
            }
        }

        for(int col: colList){
            for(int i=0; i<matrix.length; i++){
                matrix[i][col] = 0;
            }
        }
        
    }
}