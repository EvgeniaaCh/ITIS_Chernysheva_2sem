import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class SetOperations {
    public Set arraySet;
    public Set arraySetTwo;

    public Set subtraction(Set arraySet, Set arraySetTwo) {
        Set<Object> arraySetNew = new LinkedHashSet<Object>();
        for (Object i:arraySet) {
            if (!arraySetTwo.contains(i)){
                arraySetNew.add(i);
            }
        }
        return arraySetNew;
    }


    static Set union(Set arraySet, Set <Object> arraySetTwo){
        Set<Object> arraySetNew = arraySetTwo;
        for (Object i:arraySet) {
            if (!arraySetTwo.contains(i)){
                arraySetNew.add(i);
            }
        }
        return  arraySetNew;
    }

    public Set intersect(Set arraySet, Set arratSetTwo){
        Set<Object> arraySetNew = new LinkedHashSet<Object>();
            for (Object i: arraySet) {
                for (Object j : arratSetTwo) {
                    if (i.equals(j)) {
                        arraySetNew.add(i);
                }
            }
        }
        return arraySetNew;
    }
}

