package com.amazon.milan.flink.apps;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface NamedArgument {
    String Name();

    String ShortName() default "";

    boolean Required() default true;

    String DefaultValue() default "";

    boolean IsFlag() default false;
}
