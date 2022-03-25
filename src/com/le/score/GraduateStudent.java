package com.le.score;

public class GraduateStudent extends Student {
    int thesis;
    public GraduateStudent(
            String name,
            int english,
            int math,
            int thesis){
        super(name, english, math);
        //this.name=name;
        //this.english=english;
       // this.math=math;
        this.thesis=thesis;
    }

    public void print() {
        System.out.println(name+"\t"+english+"\t"+math+"\t"+getAverage()+ "\t"+thesis);
    }
}
