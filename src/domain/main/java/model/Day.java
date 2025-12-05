/* src/domain/Day.java
 * Domain-Klasse: Day
 * Repräsentiert einen Tag mit Aktivitäten und Übungen
 * SOLID:
 * Single Responsibility - speichert Tagesdaten und zugehörige Geschäftslogik
 * Open/Closed Principle:
 *   Die Klasse ist erweiterbar durch neue Methoden, ohne bestehende zu ändern.
 * Liskov Substitution Principle:
 *   Unterklassen müssen sich so verhalten, dass sie überall anstelle der Oberklasse genutzt werden können.
 * Interface Segregation Principle:
 *   Die Klasse kann bei Bedarf in spezialisierte Interfaces aufgeteilt werden.
 * Dependency Inversion Principle:
 *   Die Klasse hängt nicht direkt von konkreten Implementierungen ab.
 */
package model;
import java.util.Date;

public class Day {
    private int id;
    private Date date;
    private int steps;
    private int caloriesIntake;
    private int caloriesBurned;
    //private Exercise[] exercises;
    private boolean exercisesCompleted;

    // Konstruktor
    public Day(int id, Date date, int steps, int caloriesIntake, int caloriesBurned, /*Exercise[] exercises, */boolean exercisesCompleted) {
        this.id = id;
        this.date = date;
        this.steps = steps;
        this.caloriesIntake = caloriesIntake;
        this.caloriesBurned = caloriesBurned;
        //this.exercises = exercises;
        this.exercisesCompleted = exercisesCompleted;
    }

    // Geschäftslogik: Übung hinzufügen
    /*public void addExercise(Exercise newExercise) {
        //noch zu implementieren
    }

    // Geschäftslogik: Übung löschen
    public void deleteExercise(Exercise deleteEx) {
        //noch zu implementieren
    }*/

    // Geschäftslogik: Schritte aktualisieren
    public void updateSteps(int steps) {
        this.steps = steps;
    }

    // Getter und Setter
    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getSteps() {
        return steps;
    }

    public int getCaloriesIntake() {
        return caloriesIntake;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    /*public Exercise[] getExercises() {
        return exercises;
    }*/

    public boolean isExercisesCompleted() {
        return exercisesCompleted;
    }

    public void setCaloriesIntake(int caloriesIntake) {
        this.caloriesIntake = caloriesIntake;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public void setExercisesCompleted(boolean exercisesCompleted) {
        this.exercisesCompleted = exercisesCompleted;
    }

    public void setDate(Date date) {
        this.date = date;
    }
  
}
