package kyu7.ListFiltering;

import java.util.ArrayList;
import java.util.List;

public class Kata {

    public static List<Object> filterList(final List<Object> list) {
        ArrayList<Object> intList = new ArrayList<>();

        for (Object element : list) {
            if (element instanceof Integer) {
                intList.add(element);
            }
        }

        return intList;
    }

}
