package generics;

public class User implements Comparable<User> {

    private Long id;
    private String name;
    private Double height;

    public User(Long id, String name, Double height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format(
                "User{ID = %d, Name = %s, Height = %.2f}",
                id, name, height
        );
    }

    @Override
    public int compareTo(User o) {
//        return this.id.compareTo(o.id); // 2, 1, 4
        return this.name.compareTo(o.name);
    }
}
