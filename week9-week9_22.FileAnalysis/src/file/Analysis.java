/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author kevinkerin
 */
public class Analysis {
    
    private File file;
    
    public Analysis(File file){
        this.file = file;
    }
    
    public int lines() throws Exception {
        Scanner reader = new Scanner(file);
        int num = 0;
        while (reader.hasNextLine()){
            num++;
            reader.nextLine();
        }
        return num;
    }
    
    public int characters() throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");
        
        int num = 0;
        while (reader.hasNext()){
            String line = reader.nextLine();
            num += line.length() + 1;
        }
        return num;
    }
    
}
