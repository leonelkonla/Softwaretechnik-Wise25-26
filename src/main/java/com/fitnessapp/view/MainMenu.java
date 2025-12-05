package com.view;/* src/view/domain.view.MainMenu.java
 * Domain-Klasse: domain.view.MainMenu
 * Repräsentiert das Hauptmenü der Anwendung mit den grundlegenden Informationen und Auswahlmöglichkeiten (aus Klassendiagramm Bild)
 * SOLID:
 * Single Responsibility - zuständig für die Darstellung des Hauptmenüs und Navigation
 * Open/Closed Principle:
 *   Die Klasse kann durch Hinzufügen neuer Menüpunkte oder Funktionen erweitert werden, ohne bestehende Methoden zu ändern.
 * Liskov Substitution Principle:
 *   Subklassen von domain.view.MainMenu müssen sich so verhalten, dass sie überall dort eingesetzt werden können, wo domain.view.MainMenu erwartet wird.
 * Interface Segregation Principle:
 *   Die Klasse kapselt klar Verantwortungen, was bei Bedarf eine Aufteilung in kleinere Interfaces ermöglicht.
 * Dependency Inversion Principle:
 *   Die Klasse sollte idealerweise von Abstraktionen abhängen, hier ist sie direkt an konkrete Typen gebunden.
 */

import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.stage.Stage;

public class MainMenu {
    private int id;
    private Stage stage;
    private SubScene profilePanel;
    private SubScene trainingPanel;

    // Konstruktor
    public MainMenu(int id, Stage stage, SubScene profilePanel, SubScene trainingPanel) {
        this.id = id;
        this.stage = stage;
        this.profilePanel = profilePanel;
        this.trainingPanel = trainingPanel;
    }

    // Methode zur Anzeige des Hauptmenüs
    public void show() {
        // Noch zu implementieren
    }

    // Getter und Setter
    public int getId() {
        return id;
    }

    public Stage getStage() {
        return stage;
    }

    public SubScene getProfilePanel() {
        return profilePanel;
    }

    public SubScene getTrainingPanel() {
        return trainingPanel;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setProfilePanel(SubScene profilePanel) {
        this.profilePanel = profilePanel;
    }

    public void setTrainingPanel(SubScene trainingPanel) {
        this.trainingPanel = trainingPanel;
    }

}
