package exercise2_3;

public class Main {
    public static <TKey, TValue> void main(String[] args) {
        MyDictionary<TKey, TValue> dictionary = new MyDictionary<>();

        Pair pair = new Pair<>(1, "One");
        Pair pair1 = new Pair<>(2, "Two");

        dictionary.put(pair1);
        dictionary.put(pair);



        System.out.println(dictionary.getValueByKey(1));

    }
}
