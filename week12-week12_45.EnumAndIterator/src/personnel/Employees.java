/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author kevinkerin
 */
public class Employees {
    
    private List<Person> personList;
    
    public Employees(){
        personList = new ArrayList<Person>();
    }
    
    public void add(Person person){
        personList.add(person);
    }
    
    public void add(List<Person> persons){
        for(Person p : persons){
            personList.add(p);
        }
    }
    
    public void print(){
        Iterator<Person> iterator = personList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = personList.iterator();
        while(iterator.hasNext()){
            Person p = iterator.next();
            if(education == p.getEducation()){
                System.out.println(p);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = personList.iterator();
        while(iterator.hasNext()){
            if(education == iterator.next().getEducation()){
                iterator.remove();
            }
        }
    }
    
}
