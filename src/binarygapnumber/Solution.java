package binarygapnumber;
public class Solution {

    
    public static int solution(int N) {
 String bin = Integer.toBinaryString(N);

    String[] gaps = bin.split("1");

    String bigGap ="";
    //find the max length of an Array of string
    for (int i = 0; i < gaps.length; i++) {

        if (gaps[i].length()>bigGap.length())
        bigGap = gaps[i];

    }

    return bigGap.length();
}
}
