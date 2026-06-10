class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> map = new HashSet<>();
        for(int r =0;r<9;r++){
            for(int c=0;c<9;c++){
                char number = board[r][c];
                if(number!='.'){
                    if(!map.add(number +"in row"+r) ||
                      !map.add(number +"in col "+c) ||
                      !map.add(number +" in box"+ (r/3)+"-"+(c/3))){
                        return false;
                      }
                }
                
            }
            
        }
        return true;
    }
}
