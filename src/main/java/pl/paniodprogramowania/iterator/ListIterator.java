package pl.paniodprogramowania.iterator;

import java.util.List;

public class ListIterator implements Iterator {
    private List<String> list;
    private int listSize;
    private int currentIndex;

    public ListIterator(List<String> list) {
        this.list = list;
        this.listSize = list.size();
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < listSize;
    }

    @Override
    public String next() {
        var result = list.get(currentIndex);
        currentIndex++;
        return result;
    }
}
