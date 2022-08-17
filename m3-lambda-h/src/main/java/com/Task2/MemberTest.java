package com.Task2;

import java.util.ArrayList;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {
        Person person1 = new Person(18,"Hira",Gender.FEMALE);
        Person person2 = new Person(56,"Nurbanu",Gender.FEMALE);
        Person person3 = new Person(78,"Ela",Gender.FEMALE);
        Person person4 = new Person(19,"Ozzy",Gender.MALE);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        CheckMember checkMember = person -> person.getGender()==Gender.MALE && (person.getAge()>=18 && person.getAge()<=25);
        print(personList, checkMember);
    }

    private static void print(List<Person> personList, CheckMember checkMember){
        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if(checkMember.checkPerson(person)){
                result.add(person);
            }
        }
        System.out.println(result);
    }
}
