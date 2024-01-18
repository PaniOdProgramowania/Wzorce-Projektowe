package pl.paniodprogramowania.repository;

import java.util.List;
import java.util.NoSuchElementException;

public class PorcelainDollsShelf extends PorcelainDollsRepository {
  private List<PorcelainDoll> dolls;

  @Override
  public List<PorcelainDoll> findAll() {
    return dolls;
  }

  @Override
  public PorcelainDoll findByName(String name) {
    return dolls.stream()
        .filter(doll -> name.equals(doll.getName()))
        .findFirst()
        .orElseThrow(() -> new NoSuchElementException("No such doll"));
  }

  @Override
  public void changeDress(PorcelainDoll porcelainDoll, String newDress) {
    dolls.stream()
        .filter(doll -> doll.equals(porcelainDoll))
        .findFirst()
        .map(doll -> doll.toBuilder().dress(newDress).build())
        .orElseThrow(() -> new NoSuchElementException("No such doll"));
  }

  @Override
  public void removeDoll(PorcelainDoll porcelainDollToBeRemoved) {
    dolls.remove(porcelainDollToBeRemoved);
  }
}
