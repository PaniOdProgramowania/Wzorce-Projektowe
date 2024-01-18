package pl.paniodprogramowania.repository;

import java.util.List;

public abstract class PorcelainDollsRepository {
  abstract List<PorcelainDoll> findAll();
  abstract PorcelainDoll findByName(String name);
  abstract void changeDress(PorcelainDoll porcelainDoll, String newDress);
  abstract void removeDoll(PorcelainDoll porcelainDollToBeRemoved);
}
