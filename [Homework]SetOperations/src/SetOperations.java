import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public Set<Object> subtraction(Set<Object> arraySet, Set<Object> arraySetTwo) {
        Set<Object> arraySetNew = new HashSet<>();
        for (Object i : arraySet) {
            if (!arraySetTwo.contains(i)) {
                arraySetNew.add(i);
            }
        }
        return arraySetNew;
    }


    public static Set<Object> union(Set<Object> arraySet, Set<Object> arraySetTwo) {
        Set<Object> arraySetNew = arraySetTwo;
        for (Object i : arraySet) {
            if (!arraySetTwo.contains(i)) {
                arraySetNew.add(i);
            }
        }
        return arraySetNew;
    }

    public Set<Object> intersect(Set<Object> arraySet, Set<Object> arraySetTwo) {
        Set<Object> arraySetNew = new HashSet<>();
        for (Object i : arraySet) {
            if (arraySetTwo.contains(i)) {
                arraySetNew.add(i);
            }
        }
        return arraySetNew;
    }
}
