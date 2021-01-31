package pl.paniodprogramowania.kitchen;

public class NoDoughException extends IllegalStateException {
  public NoDoughException(String message) {
    super(message);
  }
}
