package pl.paniodprogramowania.builder.patient;

import java.time.LocalDate;
import java.util.HashSet;

public class Runner {

  public static void main(String[] args) {
    HashSet<String> coexistingIllnesses = new HashSet<>();
    coexistingIllnesses.add("Diabetes");

    PatientRQ patientRQ = new PatientRQ.PatientRqBuilder()
        .firstName("Dominik")
        .lastName("Kowalski")
        .admissionDate(LocalDate.of(2021, 02, 07))
        .birthDate(LocalDate.of(1990, 07, 18))
        .coexistingIllnesses(coexistingIllnesses)
        .peopleMetBeforeAdmission(3)
        .placeOfBirth("Racibórz")
        .build();

    System.out.println(patientRQ);
  }
}
