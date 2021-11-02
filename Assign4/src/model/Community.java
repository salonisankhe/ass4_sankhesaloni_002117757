/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author saloni
 */
public class Community {
    private House address;
    private PatientDirectory patient;
    private HashMap<String, ArrayList<Patient>> patientDirect;

    public Community(PatientDirectory patient) {
        this.patient = patient;
        this.patientDirect=new HashMap<>();
    }

    public House getAddress() {
        return address;
    }

    public void setAddress(House address) {
        this.address = address;
    }

    public PatientDirectory getPatient() {
        return patient;
    }

    public void setPatient(PatientDirectory patient) {
        this.patient = patient;
    }

    public HashMap<String, ArrayList<Patient>> getPatientDirect() {
        return patientDirect;
    }

    public void setPatientDirect(HashMap<String, ArrayList<Patient>> patientDirect) {
        this.patientDirect = patientDirect;
    }
    
    public void createCommunity()
    {
        for(String firstName : this.patient.getPatientDetails().keySet())
        {
            String zip = this.patient.getPatientDetails().get(firstName).getPerson().getAddress().getZipcode();
            ArrayList<Patient> commPatient = new ArrayList<>();
            if(this.patientDirect.containsKey(zip))
            {
                ArrayList<Patient> newCommunity = this.patientDirect.get(zip);
                newCommunity.add(this.patient.getPatientDetails().get(firstName));
                this.patientDirect.replace(zip, newCommunity);
            }
            else
            {
                commPatient.add(this.patient.getPatientDetails().get(firstName));
                this.patientDirect.put(zip, commPatient);
            }
        }
    }
}
