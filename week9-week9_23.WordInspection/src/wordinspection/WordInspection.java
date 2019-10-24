/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kevinkerin
 */
public class WordInspection {
    
    private File file;
    
    public WordInspection(File file){
        this.file = file;
    }
    
    public int wordCount() throws Exception{
        Scanner reader = readFile();
        int num = 0;
        while(reader.hasNext()){
            num++;
            reader.next();
        }
        return num;
    }
    
    public List<String> wordsContainingZ() throws Exception{
        List<String> list = new ArrayList<String>();
        Scanner reader = readFile();
        while(reader.hasNext()){
            String word = reader.next();
            if (word.contains("z")){
                list.add(word);
            }
        }
        return list;
    }
    
    public List<String> wordsEndingInL() throws Exception{
        List<String> list = new ArrayList<String>();
        Scanner reader = readFile();
        while(reader.hasNext()){
            String word = reader.next();
            int lastCharIndex = word.length()-1;
            if(word.charAt(lastCharIndex) == 'l'){
                list.add(word);
            }
        }
        return list;
    }
    
    public Scanner readFile() throws FileNotFoundException{
        return new Scanner(file, "UTF-8");
    }
    
    public List<String> palindromes() throws Exception{
        List<String> list = new ArrayList<String>();
        Scanner reader = readFile();
        
        while(reader.hasNext()){
            String currentWord = reader.next();
            boolean isPalindrome = true;
            int front = 0;
            int back = currentWord.length() - 1;

            while (front < back) {

                if (currentWord.charAt(front) != currentWord.charAt(back)) {
                    isPalindrome = false;
                    break;
                } else {
                    front++;
                    back--;
                }
            }
            if(isPalindrome){
                list.add(currentWord);
            }
        }
        return list;        
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException{
        List<String> list = new ArrayList<String>();
        String[] array = new String[]{"a", "e", "i", "o", "u", "y", "ä", "ö"};
        Scanner reader = readFile();
        
        while (reader.hasNext()) {
            String currentWord = reader.next();
            boolean containsAll = true;
            for (String str : array) {
                if (!currentWord.contains(str)) {
                    containsAll = false;
                }
            }
            if (containsAll) {
                list.add(currentWord);
            }
        }
        
        return list;
    }
    
    
}
