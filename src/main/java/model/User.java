/* src/domain/User.java
 * Domain-Klasse: User
 * Repräsentiert einen Benutzer (aus Klassendiagramm Bild 1)
 * SOLID: 
 * Single Responsibility - nur Daten und zugehörige Geschäftslogik
 * Open/Closed Principle:
 *   Die Klasse ist so gestaltet, dass sie durch Erweiterungen (z. B. neue Methoden)
 *   erweitert werden kann, ohne bestehende Methoden zu ändern.
 * Liskov Substitution Principle:
 *   Unterklassen müssen sich so verhalten, dass sie überall anstelle der Oberklasse genutzt werden können.
 * Interface Segregation Principle:
 *   Die Klasse ist so gestaltet, dass sie bei Bedarf in kleinere, spezifische Interfaces
 *   aufgeteilt werden kann
 * Dependency Inversion Principle:
 *   Die Klasse hängt nicht direkt von konkreten Implementierungen ab (z.B. Datenbank),
 *   sondern könnte z.B. über Interfaces oder Services mit externen Komponenten arbeiten.
 */
package model;
public class User {
    private int id;
    private String username;
    private int age;
    private double weight;
    private double height;
    private String sex;
    private String password;
    private Plan[] plans;
    private Day[] days;

    // Konstruktoren
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }


    public User(int id, String username, int age, double weight, double height, String sex, String password, Plan[] plans, Day[] days) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.password = password;
        this.plans = plans;
        this.days = days;
    }
  
    /* Beispielhafte Methoden delete und synchronize
    public void delete(List<User> users) {
        users.remove(this);
    }*/
  
    public void synchronize() {
        // Noch zu implementieren
    }

    // Getter und Setter
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getSex() {
        return sex;
    }

    public String getPassword() {
        return password;
    }

    public Plan[] getPlans() {
        return plans;
    }

    public Day[] getDays() {
        return days;
    }

    public void setPlans(Plan[] plans) {
        this.plans = plans;
    }

    public void setDays(Day[] days) {
        this.days = days;
    }
}
