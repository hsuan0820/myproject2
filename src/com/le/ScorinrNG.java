package com.le;

public class ScorinrNG {
    public static void main(String[] args) {
        String[]names={"Jack","Benny","Karen"};
        int[] english={70,90,60};
        int[]math={60,55,80};
        for(int i=0;i<3;i++){
            System.out.println(names[i] + "\t" + english[i] + "\t" + math[i] + "\t" + (english[i]+math[i])/2 );
        }
    }
}
