package com.controller;/* src/controller/domain.controller.MainController.java
 * Domain-Klasse: domain.controller.MainController
 * Repräsentiert den Haupt-Controller für die Anwendung
 * SOLID: 
 * Single Responsibility - verwaltet nur Steuerungslogik der Anwendung
 * Open/Closed Principle:
 *   Die Klasse ist so gestaltet, dass sie durch Hinzufügen neuer Methoden erweitert
 *   werden kann, ohne bestehende zu verändern.
 * Liskov Substitution Principle:
 *   Unterklassen müssen sich so verhalten, dass sie überall anstelle der Oberklasse genutzt werden können.
 * Interface Segregation Principle:
 *   Die Klasse kapselt klare Verantwortungen, was bei Bedarf
 *   eine Aufteilung in kleinere Interfaces ermöglicht.
 * Dependency Inversion Principle:
 *   Der Controller arbeitet idealerweise mit Abstraktionen (Interfaces) für User und Views,
 *   ist aber in dieser einfachen Implementierung direkt an konkrete Typen gebunden.
 */

public class MainController {
    private User currentUser;
    private int[] views;

    // Konstruktor
    public MainController(User currentUser, int[] views) {
        this.currentUser = currentUser;
        this.views = views;
    }

    public void startApp() {
        // Start-Logik der Anwendung, z.B. Initialisierung
    }

    public void openMainMenu() {
        // Logik zum Öffnen des Hauptmenüs
    }

    public void openProfileView() {
        // Logik zum Öffnen der Profilansicht
    }

    public void logout() {
        // Logik zum Abmelden des aktuellen Benutzers
        currentUser = null;
        // Weitere Aufräumarbeiten
    }

    // Getter und Setter
    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public int[] getViews() {
        return views;
    }

    public void setViews(int[] views) {
        this.views = views;
    }
}
