package lab03;

import java.util.ArrayList;
import java.util.List;

public class MultiList<T> {

    private List<List<T>> multiList;

    public MultiList() {
        this.multiList = new ArrayList<>();
    }

    public void addSublist(List<T> sublist) {
        multiList.add(sublist);
    }

    public void addElementToSublist(int sublistIndex, T element) {
        if (sublistIndex >= 0 && sublistIndex < multiList.size()) {
            multiList.get(sublistIndex).add(element);
        } else {
            throw new IndexOutOfBoundsException("Sublist index out of bounds.");
        }
    }

    public ArrayList<T> getSublist(int sublistIndex) {
    if (sublistIndex >= 0 && sublistIndex < multiList.size()) {
        return (ArrayList<T>) multiList.get(sublistIndex);
    } else {
        throw new IndexOutOfBoundsException("Sublist index out of bounds.");
    }
}

    public void printMultiList() {
        for (int i = 0; i < multiList.size(); i++) {
            System.out.println("Sublist " + i + ":");
            for (T element : multiList.get(i)) {
                System.out.println(element);
            }
        }
    }

    public boolean isMultiListEmpty() {
        return multiList.isEmpty();
    }
    
    public int size() {
        return multiList.size();
    }

    public static void main(String[] args) {
        MultiList<String> multiList = new MultiList<>();

        List<String> sublist1 = new ArrayList<>();
        sublist1.add("Element 1A");
        sublist1.add("Element 1B");
        sublist1.add("Element 1C");

        List<String> sublist2 = new ArrayList<>();
        sublist2.add("Element 2A");
        sublist2.add("Element 2B");

        multiList.addSublist(sublist1);
        multiList.addSublist(sublist2);

        multiList.addElementToSublist(0, "New Element 1D");

        multiList.printMultiList();
    }
}
