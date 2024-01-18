package pl.paniodprogramowania.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
public class PorcelainDoll {
  private String name;
  private String dress;
}
