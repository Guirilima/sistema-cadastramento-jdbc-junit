package generica;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenerica <T> { //Qualquer tipo que representar um generic

    List<T> list = new ArrayList<>();
    public void add(T t) {
        list.add(t);
    }
    public List<T> getList() {
        return list;
    }

    public <T> T get(int param) {
        return (T) list.get(param);
    }
}