package exercise5;

class MyClass {
    static <T> String factoryMethod(T t){
        Class<T> aClass = (Class<T>) t.getClass();
        return aClass.getSimpleName();
    }
}
