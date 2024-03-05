import java.util.HashSet;

import java.util.Iterator;

public class hashing {
    public static void main(String[] args) {

        // Creation
        HashSet<Integer> set = new HashSet<>();

        // insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(5);

        // search-> we use contains to check if the elem is present or not

        if (set.contains(1)) {
            System.out.println("It contains 1");
        }
        if (set.contains(4)) {
            System.out.println("It does contain");
        }

        // size of the set
        System.out.println(set.size());
        System.out.println(set);

        // delete element:
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("No, It does not contain because you deleted it.");
        }

        // Iterator -> we have two functions in it
        // 1. hasnext -> used to check if it contain a elem or not , returns true if
        // contains , false if not.

        // 2. next -> we use this function to go to next element, cuz in this iterator
        // it at starts points to the null so we have to go to the next elem to work.

        // import iterator
        Iterator it = set.iterator(); //
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // to yaha pe ye ho rha h ki pehle hasnext check kr rha ki elem hai ya nhi if hai then niche soutln next fucntion use krega and elements pe jaayega aur unhe print kr dega.

    }
}