package com.cydeo.task;

import com.cydeo.Course;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CharStreamTask {
    public static void main(String[] args) {
        /*String[] courses = {"Java", "Spring", "Agile"};

        Stream<String> course = Arrays.stream(courses);

        //Creating stream from Collection
        List<String> courseList = Arrays.asList("Java", "Spring", "Agile");

        List<Course> myCourses = Arrays.asList(new Course("Java", 100),
                new Course("DS", 101), new Course("MS", 102));

        Stream<Course> myCourseStream = myCourses.stream();*/

        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        words.stream()
                .map(str -> str.length())
                .forEach(System.out::println);

    }//end of main
}//end of class
