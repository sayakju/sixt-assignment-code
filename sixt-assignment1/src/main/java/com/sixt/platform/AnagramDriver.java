package main.java.com.sixt.platform;

/**
 * Created by sghosh8 on 9/3/17.
 */
public class AnagramDriver {
    public static void main(String args[]){
        if(args.length != 2){
            throw new IllegalArgumentException("You must enter exactly two strings as arguments");
        }
        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram(args[0], args[1]));
    }
}
