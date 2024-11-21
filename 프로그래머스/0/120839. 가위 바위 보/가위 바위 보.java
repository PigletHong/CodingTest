import java.util.*;

class Solution {
    public String solution(String rsp) {
        char[] temp = rsp.toCharArray();
        char[] asnwerArr = new char[temp.length];
        for (int i = 0; i < asnwerArr.length; i ++) {
            asnwerArr[i] = asd(temp[i]);
        }
        return String.valueOf(asnwerArr);
    }
    
    public char asd(char a) {
        switch(a) {
            case '2':
                return '0';
            case '0':
                return '5';
            case '5':
                return '2';
            default:
                return '0';
        }
    }
}