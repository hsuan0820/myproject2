package com.le.score;

public class Scoring {
    public static void main(String[] args) {
        Student jack=new Student("Jack",70,60);
        //Jack.name="Jack";
        Student hank=new Student("hank",40,60);
        GraduateStudent jane=new GraduateStudent("Jane",80,62,90);
        //jane.name="Jane";

        jack.print();
        hank.print();
        jane.print();




    }
}
