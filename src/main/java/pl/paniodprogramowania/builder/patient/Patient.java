package pl.paniodprogramowania.builder.patient;

import java.time.LocalDate;
import java.util.Set;

public class Patient {
  private String firstName;
  private String lastName;
  private LocalDate birthDate;

  public Patient(String firstName, String lastName, LocalDate birthDate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
  }

  public Patient(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Patient(String firstName, LocalDate birthDate) {
    this.firstName = firstName;
    this.birthDate = birthDate;
  }
}
