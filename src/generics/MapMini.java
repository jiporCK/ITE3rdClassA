package generics;

public class MapMini<Key, Value> {

    private Key key;
    private Value value;

    public void put(Key key, Value value) {
        this.key = key;
        this.value = value;
    }

    public Value get(Key key) {
        if (key.equals(this.key)) {
            return value;
        }
        return null;
    }

    public String entrySet() {
        return "{" + key + ":" + value + "}";
    }

}
