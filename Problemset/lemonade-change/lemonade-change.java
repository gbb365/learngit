
// @Title: 柠檬水找零 (Lemonade Change)
// @Author: 15218859676
// @Date: 2020-12-10 20:43:31
// @Runtime: 2 ms
// @Memory: 39.3 MB

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0 ;
        int ten = 0;
        for(int bill : bills){
            if(bill == 5){
                five++;
            }else if(bill == 10){
                if(five == 0 ){
                    return false;
                }
                five--;
                ten++;
            }else{
                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                }else if(five >= 3){
                    five -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
