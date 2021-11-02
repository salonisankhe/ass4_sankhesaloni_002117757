/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author saloni
 */
public class Patient {
     private Person person;
    private String category;
    private EncounterHistory encounterHist;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public EncounterHistory getEncounterHist() {
        return encounterHist;
    }

    public void setEncounterHist(EncounterHistory encounterHist) {
        this.encounterHist = encounterHist;
    }

    public Patient(Person person) {
        this.person = person;
        this.encounterHist = new EncounterHistory();
        this.chooseCategory();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
       
    public VitalSigns addNewVitals() {
        Encounter e = this.encounterHist.addNewEncounter();
        return e.getVitals();
    }

    public void chooseCategory() {

        int group;
        if (this.person.getAge() < 1) {
            this.category = "Newborn";
            group = 1;
        } else if (this.person.getAge() >= 1 && this.person.getAge() <= 12) {
            group = 2;
            this.category = "Infant";
        } else if (this.person.getAge() > 12 & this.person.getAge() <= 36) {
            group = 3;
            this.category = "Toddler";
        } else if (this.person.getAge() > 36 & this.person.getAge() <= 60) {
            group = 4;
            this.category = "Pre-Schooler";
        } else if (this.person.getAge() > 60 & this.person.getAge() <= 156) {
            group = 5;
            this.category = "School Age";
        } else if (this.person.getAge() > 156) {
            group = 6;
            this.category = "Adolescent";
        }

    }

    public Boolean isPatientNormal() {
        VitalSigns vitals = this.encounterHist.getEncounterHist().get(this.encounterHist.getEncounterHist().size() - 1).getVitals();
        switch (this.category) {
            case "Newborn":
                if (vitals.getRespiratoryRate() >= 51) {
                    System.out.println("Critical Respiratory Rate! Immediate Action Required! Consult A Doctor");
                    return false;
                }
                if (vitals.getRespiratoryRate() < 30 || vitals.getRespiratoryRate() > 50) {
                    System.out.println("Respiratory rate is not normal");
                    return false;
                }
                if (vitals.getHeartRate() < 120 || vitals.getHeartRate() > 160) {
                    System.out.println("Heart rate is not normal");
                    return false;
                }
                if (vitals.getWeight() < 2 || vitals.getWeight() > 3) {
                    System.out.println("Weight is not normal");
                    return false;
                }
                if (vitals.getBloodPressure() < 50 || vitals.getBloodPressure() > 70) {
                    System.out.println("Blood pressure is not normal");
                    return false;
                }

                break;
            case "Infant":
                if (vitals.getRespiratoryRate() >= 35) {
                    System.out.println("Critical Respiratory rate! Immediate Action Required! Consult A Doctor");
                    return false;
                }
                if (vitals.getRespiratoryRate() < 20 || vitals.getRespiratoryRate() > 30) {
                    System.out.println("Respiratory rate is not normal");
                    return false;
                }
                if (vitals.getHeartRate() < 80 || vitals.getHeartRate() > 140) {
                    System.out.println("Heart rate is not normal");
                    return false;
                }
                if (vitals.getWeight() < 4 || vitals.getWeight() > 10) {
                    System.out.println("Weight is not normal");
                    return false;
                }
                if (vitals.getBloodPressure() < 70 || vitals.getBloodPressure() > 100) {
                    System.out.println("Blood pressure is not normal");
                    return false;
                }

                break;
            case "Toddler":
                if (vitals.getRespiratoryRate() >= 35) {
                    System.out.println("Critical Respiratory rate! Immediate Action Required! Consult A Doctor");
                    return false;
                }
                if (vitals.getRespiratoryRate() < 20 || vitals.getRespiratoryRate() > 30) {
                    System.out.println("Respiratory rate is not normal");
                    return false;
                }
                if (vitals.getHeartRate() < 80 || vitals.getHeartRate() > 130) {
                    System.out.println("Heart rate is not normal");
                    return false;
                }
                if (vitals.getWeight() < 10 || vitals.getWeight() > 14) {
                    System.out.println("Weight is not normal");
                    return false;
                }
                if (vitals.getBloodPressure() < 80 || vitals.getBloodPressure() > 110) {
                    System.out.println("Blood pressure is not normal");
                    return false;
                }

                break;
            case "Pre-Schooler":
                if (vitals.getRespiratoryRate() >= 35) {
                    System.out.println("Critical Respiratory rate! Immediate Action Required! Consult A Doctor");
                    return false;
                }
                if (vitals.getRespiratoryRate() < 20 || vitals.getRespiratoryRate() > 30) {
                    System.out.println("Respiratory rate is not normal");
                    return false;
                }
                if (vitals.getHeartRate() < 80 || vitals.getHeartRate() > 120) {
                    System.out.println("Heart rate is not normal");
                    return false;
                }
                if (vitals.getWeight() < 14 || vitals.getWeight() > 18) {
                    System.out.println("Weight is not normal");
                    return false;
                }
                if (vitals.getBloodPressure() < 80 || vitals.getBloodPressure() > 110) {
                    System.out.println("Blood pressure is not normal");
                    return false;
                }
                break;

            case "School Age":
                if (vitals.getRespiratoryRate() >= 35) {
                    System.out.println("Critical Respiratory rate! Immediate Action Required! Consult A Doctor");
                    return false;
                }
                if (vitals.getRespiratoryRate() < 20 || vitals.getRespiratoryRate() > 30) {
                    System.out.println("Respiratory rate is not normal");
                    return false;
                }
                if (vitals.getHeartRate() < 70 || vitals.getHeartRate() > 110) {
                    System.out.println("Heart rate is not normal");
                    return false;
                }
                if (vitals.getWeight() < 20 || vitals.getWeight() > 42) {
                    System.out.println("Weight is not normal");
                    return false;
                }
                if (vitals.getBloodPressure() < 80 || vitals.getBloodPressure() > 120) {
                    System.out.println("Blood pressure is not normal");
                    return false;
                }
                break;

            case "Adolescent":
                if (vitals.getRespiratoryRate() >= 25) {
                    System.out.println("Critical Respiratory rate! Immediate Action Required! Consult A Doctor");
                    return false;
                }
                if (vitals.getRespiratoryRate() < 12 || vitals.getRespiratoryRate() > 20) {
                    System.out.println("Respiratory rate is not normal");
                    return false;
                }
                if (vitals.getHeartRate() < 55 || vitals.getHeartRate() > 105) {
                    System.out.println("Heart rate is not normal");
                    return false;
                }
                if (vitals.getWeight() < 50) {
                    System.out.println("Weight is not normal");
                    return false;
                }
                if (vitals.getBloodPressure() < 110 || vitals.getBloodPressure() > 120) {
                    System.out.println("Blood pressure is not normal");
                    return false;
                }
                break;
        }

        return true;
    }

    public Boolean isThisVitalSignNormal(String vitalName) {
        VitalSigns vitals = this.encounterHist.getEncounterHist().get(this.encounterHist.getEncounterHist().size() - 1).getVitals();

        if (vitalName.equalsIgnoreCase("RespiratoryRate")) {
            if (this.category.equals("Newborn")) {
                if (vitals.getRespiratoryRate() < 30 || vitals.getRespiratoryRate() > 50) {
                    return false;
                }
            } else if (this.category.equals("Infant")) {
                if (vitals.getRespiratoryRate() < 20 || vitals.getRespiratoryRate() > 30) {
                    return false;
                }
            } else if (this.category.equals("Toddler")) {
                if (vitals.getRespiratoryRate() < 20 || vitals.getRespiratoryRate() > 30) {
                    return false;
                }
            } else if (this.category.equals("Pre-Schooler")) {
                if (vitals.getRespiratoryRate() < 20 || vitals.getRespiratoryRate() > 30) {
                    return false;
                }
            } else if (this.category.equals("School Age")) {
                if (vitals.getRespiratoryRate() < 20 || vitals.getRespiratoryRate() > 30) {

                    return false;
                }
            } else if (this.category.equals("Adolescent")) {
                if (vitals.getRespiratoryRate() < 12 || vitals.getRespiratoryRate() > 20) {
                    return false;
                }
            }
        } else if (vitalName.equalsIgnoreCase("HeartRate")) {
            if (this.category.equals("Newborn")) {
                if (vitals.getHeartRate() < 120 || vitals.getHeartRate() > 160) {
                    return false;
                }
            } else if (this.category.equals("Infant")) {
                if (vitals.getHeartRate() < 80 || vitals.getHeartRate() > 140) {
                    return false;
                }
            } else if (this.category.equals("Toddler")) {
                if (vitals.getHeartRate() < 80 || vitals.getHeartRate() > 130) {
                    return false;
                }
            } else if (this.category.equals("Pre-Schooler")) {
                if (vitals.getHeartRate() < 80 || vitals.getHeartRate() > 120) {
                    return false;
                }
            } else if (this.category.equals("School Age")) {
                if (vitals.getHeartRate() < 70 || vitals.getHeartRate() > 110) {

                    return false;
                }
            } else if (this.category.equals("Adolescent")) {
                if (vitals.getHeartRate() < 55 || vitals.getHeartRate() > 105) {
                    return false;
                }
            }
        } else if (vitalName.equalsIgnoreCase("Weight")) {
            if (this.category.equals("Newborn")) {
                if (vitals.getWeight() < 2 || vitals.getWeight() > 3) {
                    return false;
                }
            } else if (this.category.equals("Infant")) {
                if (vitals.getWeight() < 4 || vitals.getWeight() > 10) {
                    return false;
                }
            } else if (this.category.equals("Toddler")) {
                if (vitals.getWeight() < 10 || vitals.getWeight() > 14) {
                    return false;
                }
            } else if (this.category.equals("Pre-Schooler")) {
                if (vitals.getWeight() < 14 || vitals.getWeight() > 18) {
                    return false;
                }
            } else if (this.category.equals("School Age")) {
                if (vitals.getWeight() < 20 || vitals.getWeight() > 42) {

                    return false;
                }
            } else if (this.category.equals("Adolescent")) {
                if (vitals.getWeight() < 50) {
                    return false;
                }
            }
        } else if (vitalName.equalsIgnoreCase("BloodPressure")) {
            if (this.category.equals("Newborn")) {
                if (vitals.getBloodPressure() < 50 || vitals.getBloodPressure() > 70) {
                    return false;
                }
            } else if (this.category.equals("Infant")) {
                if (vitals.getBloodPressure() < 70 || vitals.getBloodPressure() > 100) {
                    return false;
                }
            } else if (this.category.equals("Toddler")) {
                if (vitals.getBloodPressure() < 80 || vitals.getBloodPressure() > 110) {
                    return false;
                }
            } else if (this.category.equals("Pre-Schooler")) {
                if (vitals.getBloodPressure() < 80 || vitals.getBloodPressure() > 110) {
                    return false;
                }
            } else if (this.category.equals("School Age")) {
                if (vitals.getBloodPressure() < 80 || vitals.getBloodPressure() > 120) {

                    return false;
                }
            } else if (this.category.equals("Adolescent")) {
                if (vitals.getBloodPressure() < 110 || vitals.getBloodPressure() > 120) {
                    return false;
                }
            }
        }
        return true;
    }
   
    
}
