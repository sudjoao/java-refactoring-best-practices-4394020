package com.linkedin.mod4.challenges.two;

// We have a legacy healthcare application with a Patient class
// that uses primitive data types to represent patient information.
// Refactor the class to use objects instead of primitives.
// You can create a separate object for Name, Demographics, BloodType,
// and ContactInfo.

public class Patient {
    private PersonalInfo personalInfo;
    private ContactInfo contactInfo;
    private MedicalInfo medicalInfo;

    public MedicalInfo getMedicalInfo() {
        return medicalInfo;
    }

    public void setMedicalInfo(MedicalInfo medicalInfo) {
        this.medicalInfo = medicalInfo;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

}

