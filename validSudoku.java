/*
 * best method made a unique string for each value 
 * We use a HashSet<String> to keep track of whether we've seen a digit in:
 * A row → "5_ROW_2"
 * A column → "5_COL_8"
 * A 3x3 sub-box → "5_BOX_0_2"
 * If any of these already exist in the set, it means a duplicate → return false.
 * If no duplicates are found, return true.
 */


class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                String row=board[i][j]+"_ROW_"+i;
                String col=board[i][j]+"_COL_"+j;
                String box=board[i][j]+"_BOX_"+i/3+"_"+j/3;

                if(set.contains(row) || set.contains(col) || set.contains(box))return false;

                set.add(row);
                set.add(col);
                set.add(box);
            }
            
        }
        return true;
    }
}