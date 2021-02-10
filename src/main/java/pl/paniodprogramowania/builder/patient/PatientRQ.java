package pl.paniodprogramowania.builder.patient;

import java.time.LocalDate;
import java.util.Set;

public class PatientRQ {
  private String firstName;
  private String lastName;
  private LocalDate birthDate;
  private String placeOfBirth;
  private int peopleMetBeforeAdmission;
  private LocalDate admissionDate;
  private Set<String> coexistingIllnesses;

  private PatientRQ(PatientRqBuilder patientRqBuilder) {
    this.firstName = patientRqBuilder.firstName;
    this.lastName = patientRqBuilder.lastName;
    this.birthDate = patientRqBuilder.birthDate;
    this.placeOfBirth = patientRqBuilder.placeOfBirth;
    this.peopleMetBeforeAdmission = patientRqBuilder.peopleMetBeforeAdmission;
    this.admissionDate = patientRqBuilder.admissionDate;
    this.coexistingIllnesses = patientRqBuilder.coexistingIllnesses;
  }

  @Override
  public String toString() {
    return "PatientRQ{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", birthDate=" + birthDate +
        ", placeOfBirth='" + placeOfBirth + '\'' +
        ", peopleMetBeforeAdmission=" + peopleMetBeforeAdmission +
        ", admissionDate=" + admissionDate +
        ", coexistingIllnesses=" + coexistingIllnesses +
        '}';
  }

  public static class PatientRqBuilder {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String placeOfBirth;
    private int peopleMetBeforeAdmission;
    private LocalDate admissionDate;
    private Set<String> coexistingIllnesses;

    public PatientRqBuilder() {
    }

    public PatientRqBuilder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public PatientRqBuilder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public PatientRqBuilder birthDate(LocalDate birthDate) {
      this.birthDate = birthDate;
      return this;
    }

    public PatientRqBuilder placeOfBirth(String placeOfBirth) {
      this.placeOfBirth = placeOfBirth;
      return this;
    }

    public PatientRqBuilder peopleMetBeforeAdmission(int peopleMetBeforeAdmission) {
      this.peopleMetBeforeAdmission = peopleMetBeforeAdmission;
      return this;
    }

    public PatientRqBuilder admissionDate(LocalDate admissionDate) {
      this.admissionDate = admissionDate;
      return this;
    }

    public PatientRqBuilder coexistingIllnesses(Set<String> coexistingIllnesses) {
      this.coexistingIllnesses = coexistingIllnesses;
      return this;
    }

    public PatientRQ build() {
      return new PatientRQ(this);
    }
  }

}
