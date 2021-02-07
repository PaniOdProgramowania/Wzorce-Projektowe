package pl.paniodprogramowania.strategy.kitchen;

public class NoDoughException extends IllegalStateException {
  public NoDoughException(String message) {
    super(message);
  }
}
