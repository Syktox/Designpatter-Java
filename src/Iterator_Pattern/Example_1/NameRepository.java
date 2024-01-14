package Iterator_Pattern.Example_1;

import Iterator_Pattern.Example_1.Container;
import Iterator_Pattern.Example_1.Iterator;

public class NameRepository implements Container {
    public String[] NameList = {"Markus", "Matthias", "Niklas", "Moritz", "Felix"};


    @Override
    public Iterator getIterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            return index < NameList.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return NameList[index++];
            }
            return null;
        }
    }
}
