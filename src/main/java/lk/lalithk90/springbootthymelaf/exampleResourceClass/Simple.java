package lk.lalithk90.springbootthymelaf.exampleResourceClass;

import lombok.AllArgsConstructor;
import lombok.Getter;



@Getter
@AllArgsConstructor
public enum Simple {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private String simple;
}

