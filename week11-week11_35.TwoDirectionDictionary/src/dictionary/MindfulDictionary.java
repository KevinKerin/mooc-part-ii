/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author kevinkerin
 */
public class MindfulDictionary {

    private Map<String, String> dictionary;
    private String file;
    public Scanner reader;

    public MindfulDictionary() {
        dictionary = new HashMap<String, String>();
        reader = new Scanner(System.in);
    }

    public MindfulDictionary(String file) {
        dictionary = new HashMap<String, String>();
        this.file = file;
        reader = new Scanner(System.in);
    }

    public boolean load() {
        try {
            FileReader fr = new FileReader(file);
            Scanner fileReader = new Scanner(new File(file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // the line is split at :
                dictionary.put(parts[0], parts[1]); // the part of the line after :
                //dictionary.put(parts[0], parts[1]);
            }
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    public void run() {
        System.out.println("Enter a command:" + "\n");
        System.out.println("[1] Translate word" + "\n");
        System.out.println("[2] Add new word" + "\n");
        String str = reader.nextLine();
        if (str.equals("1")) {
            System.out.print("\nEnter word to be translated: ");
            String word = reader.nextLine();
            String translation = translate(word);
            if(translation == null){
                System.out.println("Word not found.");
                run();
            } else {
                System.out.println("Translation: " + translation);
                run();
            }
        } else if (str.equals("2")) {
            System.out.print("Enter word in English: ");
            String key = reader.nextLine();
            System.out.println("");
            System.out.print("Enter word in Irish: ");
            String value = reader.nextLine();
            add(key, value);
            System.out.println("New entry to dictionary complete. " + key + " = " + value);
            run();
        }
    }

    public boolean save() {
        try {
            FileWriter fw = new FileWriter(file);
            for (Entry<String, String> entry : dictionary.entrySet()) {
                fw.write(entry.getKey() + ":" + entry.getValue() + "\n");
            }
            fw.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public void add(String word, String translation) {
        boolean contains = false;
        for (String str : dictionary.keySet()) {
            if (str.equals(word)) {
                contains = true;
            }
        }
        if (!contains) {
            dictionary.put(word, translation);
        }
    }

    public String translate(String word) {
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(word)) {
                return entry.getValue();
            } else if (entry.getValue().equalsIgnoreCase(word)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void remove(String word) {
        String removeMe = null;
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(word)) {
                removeMe = entry.getKey();
            } else if (entry.getValue().equalsIgnoreCase(word)) {
                removeMe = entry.getKey();
            }
        }
        dictionary.remove(removeMe);
    }

}
