package pl.paniodprogramowania.strategy.kitchen.kneading;

import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import pl.paniodprogramowania.strategy.kitchen.Dough;
import pl.paniodprogramowania.strategy.kitchen.NoDoughException;

class ManualKneadWayTest {

  @Test
  public void shouldSlowlyKnead() {
    //given
    Dough dough = new Dough();
    DoughKneadWay doughKneadWay = new ManualKneadWay();

    //when
    await().atMost(31, TimeUnit.SECONDS)

        //then
        .until(() -> doughKneadWay.knead(dough).isKneaded());
  }

  @Test
  public void shouldThrowExceptionOnNoDough() {
    //given
    DoughKneadWay doughKneadWay = new ManualKneadWay();

    //when
    assertThrows(NoDoughException.class, () -> doughKneadWay.knead(null));
  }

}