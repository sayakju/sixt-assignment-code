package main.java.com.sixt.platform;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sghosh8 on 9/3/17.
 */
public class Anagram {
    public boolean isAnagram(String lhs, String rhs) {
        if(lhs.length() != rhs.length()){
            return false;
        }
        Map<Character, Integer> characterMap = new HashMap<>();
        for(int i=0; i<lhs.length(); i++){
            char currentCharacter = Character.toLowerCase(lhs.charAt(i));
            Integer currentCharacterCount = characterMap.get(currentCharacter);
            if(currentCharacterCount == null){
                characterMap.put(currentCharacter, 1);
            } else {
                characterMap.put(currentCharacter, currentCharacterCount+1);
            }
        }
        for(int i=0; i<rhs.length(); i++){
            char currentCharacter = Character.toLowerCase(rhs.charAt(i));
            Integer currentCharacterCount = characterMap.get(currentCharacter);
            if(currentCharacterCount == null){
                return false;
            } else {
                characterMap.put(currentCharacter, currentCharacterCount-1);
            }
        }
        for(Map.Entry<Character, Integer> characterMapEntry : characterMap.entrySet()){
            if(characterMapEntry.getValue() != 0){
                return false;
            }
        }
        return true;
    }
}
