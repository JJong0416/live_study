package stream.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Person {
    private String name;
    private int age;
    private String phoneNumber;
    private double houseArea;
}
