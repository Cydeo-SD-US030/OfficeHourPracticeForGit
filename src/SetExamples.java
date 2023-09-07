import com.sun.jdi.event.StepEvent;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        String str = "uuuuuuoooooorrrrrrttttthhhhhllllkkkkk";

        List<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(str.split("")));

        System.out.println(list);

        Set<String> setHash = new HashSet<>();
        // takes out duplicates, does not have any order, takes null
        setHash.addAll(list);
        System.out.println(setHash); // [r, t, u, h, k, l, o]



        Set<String> setLinked = new LinkedHashSet<>(); // keeps insertion order
        setLinked.addAll(list);
        System.out.println(setLinked);


        Set<String> setTree = new TreeSet<>(); // does not take null, sorts them in asc order
        setTree.addAll(list);
        // setTree.add(null);
        System.out.println(setTree);
    }
}
