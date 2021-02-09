package collectionsset;

import java.util.*;

public class StringsHandler {


    public Set<String> filterUniqueStrings(Collection<String> stringCollection) {

        Set<String> Unique = new HashSet<>(stringCollection);
        return Unique;

    }


    public Set<String> selectIdenticalStrings(Set<String> setA, Set<String> setB) {
        setA.retainAll(setB);

        return setA;

    }

    public static void main(String[] args) {

        StringsHandler stringsHandler = new StringsHandler();

        Set<String> setTest = new HashSet<>();
        setTest.add("1");
        setTest.add("2");
        setTest.add("3");
        setTest.add("4");


        Set<String> anotherSetTest = new HashSet<>();
        anotherSetTest.add("1");
        anotherSetTest.add("4");


        List<String> ListTest = new ArrayList<>();
        ListTest.add("Alma");
        ListTest.add("Körte");
        ListTest.add("Barack");
        ListTest.add("Szamár");


        System.out.println(stringsHandler.selectIdenticalStrings(setTest, anotherSetTest));
        System.out.println(stringsHandler.filterUniqueStrings(ListTest));


    }


}
