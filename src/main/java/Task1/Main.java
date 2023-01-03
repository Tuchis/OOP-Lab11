package Task1;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Vladyslav").name("Vlad").age(18).occupation("UCU").gender(Gender.MALE).build();
        System.out.println(user);
    }
}
