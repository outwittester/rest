package com.xikai.validation;

import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by xikaixiong on 2/20/17.
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface IsValidHobby {
    String listofValidHobbies() default "";

    String message() default "please provide a valid Hobby"
            + "accepted hobbies are -Music, Football, Cricket and Hockey(choose anyone)";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
