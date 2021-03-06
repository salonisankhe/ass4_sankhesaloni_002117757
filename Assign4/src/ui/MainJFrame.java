/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.City;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VitalSigns;

/**
 *
 * @author saloni
 */
public class MainJFrame extends javax.swing.JFrame {
    PersonDirectory personDirect;
    PatientDirectory pd;
    EncounterHistory encounterHist;
    City city;
    
    public MainJFrame() {
        initComponents();
        
        this.personDirect = new PersonDirectory();
        this.pd = new PatientDirectory();
        this.encounterHist = new EncounterHistory();
        this.city = new City(pd);
        
        Person person = personDirect.addNewPerson();
        //Static Data for Patient1 details
        person.setFirstName("Mrunal");
        person.setLastName("Bhalerao");
        person.setAge(170);
        person.setPhNumber("8601234567");
        person.setBlood("O+ve");
        person.getAddress().setStreet("Tremont St.");
        person.getAddress().setCity("Boston");
        person.getAddress().setState("MA");
        person.getAddress().setZipcode("02120");
        
        Patient patient = pd.addNewPatient(person);        
        VitalSigns vitals = pd.getPatientDetails().get(person.getFirstName()).addNewVitals();       
      
        vitals.setRespiratoryRate(15);
        vitals.setHeartRate(60);
        vitals.setWeight(60);
        vitals.setBloodPressure(115);
        
        Person person1 = personDirect.addNewPerson();
        //Static Data for Patient2 details
        person1.setFirstName("Saloni");
        person1.setLastName("Sankhe");
        person1.setAge(0);
        person1.setPhNumber("12345678");
        person1.setBlood("O+ve");  
        person1.getAddress().setStreet("Tremont St.");
        person1.getAddress().setCity("Boston");
        person1.getAddress().setState("MA");
        person1.getAddress().setZipcode("02120");
        
        Patient patient1 = pd.addNewPatient(person1);        
        VitalSigns vitals1 = pd.getPatientDetails().get(person1.getFirstName()).addNewVitals();       
      
        vitals1.setRespiratoryRate(44);
        vitals1.setHeartRate(129);
        vitals1.setWeight(2.5);
        vitals1.setBloodPressure(89);
        
        Person person2 = personDirect.addNewPerson();
        //Static Data for Patient2 details
        person2.setFirstName("Abhinav");
        person2.setLastName("Singh");
        person2.setAge(0);
        person2.setPhNumber("12345678");
        person2.setBlood("O+ve");  
        person2.getAddress().setStreet("Tremont St.");
        person2.getAddress().setCity("Boston");
        person2.getAddress().setState("MA");
        person2.getAddress().setZipcode("02120");
        
        Patient patient2 = pd.addNewPatient(person2);        
        VitalSigns vitals2 = pd.getPatientDetails().get(person2.getFirstName()).addNewVitals();       
      
        vitals2.setRespiratoryRate(49);
        vitals2.setHeartRate(125);
        vitals2.setWeight(89);
        vitals2.setBloodPressure(80);
        
        Person person3 = personDirect.addNewPerson();
        //Static Data for Patient2 details
        person3.setFirstName("Jharna");
        person3.setLastName("Doda");
        person3.setAge(0);
        person3.setPhNumber("12345678");
        person3.setBlood("O+ve");  
        person3.getAddress().setStreet("Tremont St.");
        person3.getAddress().setCity("Boston");
        person3.getAddress().setState("MA");
        person3.getAddress().setZipcode("02120");
        
        Patient patient3 = pd.addNewPatient(person3);        
        VitalSigns vitals3 = pd.getPatientDetails().get(person3.getFirstName()).addNewVitals();       
      
        vitals3.setRespiratoryRate(44);
        vitals3.setHeartRate(190);
        vitals3.setWeight(67);
        vitals3.setBloodPressure(90);
        
    }

    /**
     * Creates new form MainJFrame
     */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        WorkArea = new javax.swing.JPanel();
        CreateArea = new javax.swing.JPanel();
        btnCreatePerson = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnCheckVitals = new javax.swing.JButton();
        btnEncounterDetails = new javax.swing.JButton();
        btnCommunity = new javax.swing.JButton();
        btnUpdateDelete = new javax.swing.JButton();
        btnVitalCheck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout WorkAreaLayout = new javax.swing.GroupLayout(WorkArea);
        WorkArea.setLayout(WorkAreaLayout);
        WorkAreaLayout.setHorizontalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        WorkAreaLayout.setVerticalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        jSplitPane2.setRightComponent(WorkArea);

        btnCreatePerson.setText("Add Person Details");
        btnCreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePersonActionPerformed(evt);
            }
        });

        btnView.setText("View Person Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnCheckVitals.setText("Do a Vital Check");
        btnCheckVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckVitalsActionPerformed(evt);
            }
        });

        btnEncounterDetails.setText("Check Encounter Details");
        btnEncounterDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncounterDetailsActionPerformed(evt);
            }
        });

        btnCommunity.setText("Check for Community");
        btnCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityActionPerformed(evt);
            }
        });

        btnUpdateDelete.setText("View/Update/Delete");
        btnUpdateDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDeleteActionPerformed(evt);
            }
        });

        btnVitalCheck.setText("Check Latest Vitals");
        btnVitalCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVitalCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreateAreaLayout = new javax.swing.GroupLayout(CreateArea);
        CreateArea.setLayout(CreateAreaLayout);
        CreateAreaLayout.setHorizontalGroup(
            CreateAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CreateAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateAreaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(CreateAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CreateAreaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnEncounterDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCheckVitals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(CreateAreaLayout.createSequentialGroup()
                        .addGroup(CreateAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreatePerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCommunity)
                            .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(btnUpdateDelete))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateAreaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVitalCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        CreateAreaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCheckVitals, btnCommunity, btnCreatePerson, btnEncounterDetails, btnUpdateDelete, btnView, btnVitalCheck});

        CreateAreaLayout.setVerticalGroup(
            CreateAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAreaLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnCreatePerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCheckVitals)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEncounterDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVitalCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCommunity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateDelete)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(CreateArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        ViewJPanel getPersonPanel = new ViewJPanel(personDirect,pd,encounterHist);
        jSplitPane2.setRightComponent(getPersonPanel);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnCreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePersonActionPerformed
        // TODO add your handling code here:
         CreatePersonJPanel getPersonPanel = new CreatePersonJPanel(personDirect,pd,encounterHist,city);
        jSplitPane2.setRightComponent(getPersonPanel);
    }//GEN-LAST:event_btnCreatePersonActionPerformed

    private void btnCheckVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckVitalsActionPerformed
        // TODO add your handling code here:
         TakeVitalsJPanel getVitalsPanel = new TakeVitalsJPanel(personDirect,pd,encounterHist);
        jSplitPane2.setRightComponent(getVitalsPanel);
    }//GEN-LAST:event_btnCheckVitalsActionPerformed

    private void btnEncounterDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncounterDetailsActionPerformed
        // TODO add your handling code here:
        EncounterDetailsJPanel getEncounterDetailsPanel = new EncounterDetailsJPanel(personDirect,pd,encounterHist);
        jSplitPane2.setRightComponent(getEncounterDetailsPanel);
    }//GEN-LAST:event_btnEncounterDetailsActionPerformed

    private void btnVitalCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVitalCheckActionPerformed
        // TODO add your handling code here:
        CheckVitalsJPanel getVitalDetailsPanel = new CheckVitalsJPanel(personDirect,pd,encounterHist);
        jSplitPane2.setRightComponent(getVitalDetailsPanel);
    }//GEN-LAST:event_btnVitalCheckActionPerformed

    private void btnCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityActionPerformed
        // TODO add your handling code here:
        CheckCommunityJPanel getVitalDetailsPanel = new CheckCommunityJPanel(personDirect,pd,encounterHist,city);
        jSplitPane2.setRightComponent(getVitalDetailsPanel);
    }//GEN-LAST:event_btnCommunityActionPerformed

    private void btnUpdateDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDeleteActionPerformed
        // TODO add your handling code here:
        UpdateDeleteJPanel getVitalDetailsPanel = new UpdateDeleteJPanel(personDirect,pd,encounterHist);
        jSplitPane2.setRightComponent(getVitalDetailsPanel);
    }//GEN-LAST:event_btnUpdateDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateArea;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JButton btnCheckVitals;
    private javax.swing.JButton btnCommunity;
    private javax.swing.JButton btnCreatePerson;
    private javax.swing.JButton btnEncounterDetails;
    private javax.swing.JButton btnUpdateDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnVitalCheck;
    private javax.swing.JSplitPane jSplitPane2;
    // End of variables declaration//GEN-END:variables
}
