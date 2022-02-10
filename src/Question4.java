import java.util.*;

public class Question4<E,A> {

    private final HashMap<E,A> hashMap = new HashMap<>();

    public void put(E e,A a){
        hashMap.put(e,a);
    }

    public boolean containsKey(E e){
        return hashMap.containsKey(e);
    }

    public boolean isEmpty(){
        return hashMap.isEmpty();
    }

    public Collection<A> values(){
        return hashMap.values();
    }

    public void replace(E e,A oldValue,A newValue){
        hashMap.replace(e,oldValue,newValue);
    }
}
