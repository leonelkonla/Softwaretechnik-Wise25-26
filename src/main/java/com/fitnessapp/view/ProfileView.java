package com.view;/* src/view/domain.view.ProfileView.java
 * Domain-Klasse: domain.view.ProfileView
 * Repräsentiert die Profilansicht mit Benutzerinformationen und Fortschrittsanzeige (aus Klassendiagramm Bild)
 * SOLID:
 * Single Responsibility - zuständig für die Darstellung und Aktualisierung der Profilansicht
 * Open/Closed Principle:
 *   Die Klasse kann durch Erweiterung neuer Anzeigeelemente erweitert werden, ohne bestehende Methoden zu ändern.
 * Liskov Substitution Principle:
 *   Subklassen der domain.view.ProfileView müssen sich so verhalten, dass sie überall dort eingesetzt werden können, wo domain.view.ProfileView erwartet wird.
 * Interface Segregation Principle:
 *   Die Klasse kapselt klar abgegrenzte Verantwortungen, was bei Bedarf eine Aufteilung in kleinere Interfaces ermöglicht.
 * Dependency Inversion Principle:
 *   Die Klasse sollte idealerweise von Abstraktionen abhängen, hier ist sie noch direkt an konkrete Typen gebunden.
 */

public class ProfileView {
    private int id;
    private Stage stage;
    private User user;
    private LineChart progressChart;

    // Konstruktor
    public ProfileView(int id, Stage stage, User user, LineChart progressChart) {
        this.id = id;
        this.stage = stage;
        this.user = user;
        this.progressChart = progressChart;
    }

    // Zeigt die Benutzerdaten in der Ansicht an
    public void showUserData() {
        // noch zu implementieren
    }

    // Aktualisiert die Ansicht mit einem neuen Benutzer
    public void updateProfileData(User user) {
        this.user = user;
        // noch zu implementieren
    }

    // Getter und Setter
    public int getId() {
        return id;
    }

    public Stage getStage() {
        return stage;
    }

    public User getUser() {
        return user;
    }

    public LineChart getProgressChart() {
        return progressChart;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setProgressChart(LineChart progressChart) {
        this.progressChart = progressChart;
    }

    @Override
    public String toString() {
        return "domain.view.ProfileView{" +
                "id=" + id +
                ", stage=" + stage +
                ", user=" + user +
                ", progressChart=" + progressChart +
                '}';
    }
}
