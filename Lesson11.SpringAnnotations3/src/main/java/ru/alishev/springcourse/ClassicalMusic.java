package ru.alishev.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component
@Scope("prototype")
public class ClassicalMusic implements Music {
    @Override

    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
