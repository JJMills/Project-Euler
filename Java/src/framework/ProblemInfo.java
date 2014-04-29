package framework;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ProblemInfo {
    String description() default "No problem specified";

    int number() default 0;
}
