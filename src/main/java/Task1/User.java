package Task1;

import lombok.AllArgsConstructor;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

enum Gender {
    MALE, FEMALE
}

@AllArgsConstructor
@SuperBuilder
@ToString
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    @Singular
    private List<String> occupations;
}