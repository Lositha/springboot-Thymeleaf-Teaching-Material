package lk.lalithk90.springbootthymelaf.exampleResourceClass;

import lombok.*;

import java.util.UUID;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Something {

    private UUID id;
    private String name;
    private Simple simple;
    private OneValue oneValue;
}
