package pl.paniodprogramowania.builder.patient;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Runner {

  public static void main(String[] args) {
    var patientRQ = new PatientRQ.PatientRqBuilder()
        .firstName("Dominik")
        .lastName("Kowalski")
        .admissionDate(LocalDate.of(2021, 02, 07))
        .birthDate(LocalDate.of(1990, 07, 18))
        .coexistingIllnesses(Set.of("Allergies"))
        .peopleMetBeforeAdmission(3)
        .placeOfBirth("Racibórz")
        .build();
  }
}
