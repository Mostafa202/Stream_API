package test2;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

    String str="string";
    System.out.println(Stream.of(str).allMatch(s->s!=""&&s!=null&&s.chars().allMatch(Character::isLetter)));



    }
}
