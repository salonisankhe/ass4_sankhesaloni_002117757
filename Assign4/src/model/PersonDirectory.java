/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author saloni
 */
public class PersonDirectory {
    private ArrayList<Person> personDirectory;
    
    public PersonDirectory() {
        this.personDirectory = new ArrayList<>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public Person addNewPerson()
    {   Person p = new Person();
        personDirectory.add(p);
        return p;
    }
    
    public void deletePerson(Person p)
    {
        personDirectory.remove(p);
    }
    
    
}
