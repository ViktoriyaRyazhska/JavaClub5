package javaclub5.classes.task1;

import lombok.*;

/**
 * Make class with Lombok library
 *
 * @author Popova Anna
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"anObject"})
@EqualsAndHashCode

@Data
public class EncapsulatedDemo {
    private int number;
    private String stringValue;
    private Object anObject;
}
