package pl.paniodprogramowania.iterator;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<String> christmasLights = new ArrayList<>(List.of(
                "czerwone", "zielone", "białe",
                "niebieskie", "różowe"));

        var listIterator = christmasLights.iterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            System.out.println(next);
            listIterator.remove();
        }
        System.out.println(christmasLights.isEmpty());
    }
}
