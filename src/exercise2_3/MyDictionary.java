package exercise2_3;

import java.util.ArrayList;
import java.util.List;

public class MyDictionary<TKey, TValue> {


  List<Pair<TKey, TValue>> list;

    public MyDictionary() {
        list = new ArrayList<>();
    }

    public void put(Pair<TKey, TValue> a) {
        Pair<TKey, TValue> tPair = a;
        list.add(tPair);
    }

    public Pair<TKey,TValue> getValueByKey(int key) {

        return list.get(1);

    }

    public int size(){
        return list.size();
    }
}
