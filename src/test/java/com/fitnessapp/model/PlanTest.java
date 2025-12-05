package test.java.com.fitnessapp.model;

import main.java.com.fitnessapp.model.Exercise;
import org.junit.Test;
import main.java.com.fitnessapp.model.Plan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlanTest {
    /**
     This class tests the constructor and methods of the Plan class.
     */
    @Test
    public void testConstructor(){
        List<Exercise> excercises = new ArrayList<Exercise>();
        Plan p = new Plan(
                4,
                "Strenghtening the core",
                new Date(),
                new Date(),
                excercises
        );

        assertEquals(4, p.getId());
        assertEquals("Strenghtening the core", p.getName());

    }
}
