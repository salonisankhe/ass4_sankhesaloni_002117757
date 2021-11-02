/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;

/**
 *
 * @author saloni
 */

    public class PatientDirectory {
 private HashMap<String, Patient> patientDetails;

    public HashMap<String, Patient> getPatientDetails() {
        return patientDetails;
    }

    public void setPatientDetails(HashMap<String, Patient> patientDetails) {
        this.patientDetails = patientDetails;
    }

    public PatientDirectory() {
        this.patientDetails = new HashMap<>();
    }
    
    public Patient addNewPatient(Person person)
    {
        Patient p = new Patient(person);
        this.patientDetails.put(person.getFirstName(), p);
        return p;
    }   
public void deletePerson(String P)
{
    patientDetails.remove(P);
}
    
}
