# Architektur-Dokument

## 1. Architekturüberblick

Dieses Dokument beschreibt die Architektur der Anwendung [Projektname] (Fitness-Tracker-Beispiel).  
Ziel der Architektur ist es, eine **klar strukturierte**, **wartbare** und **erweiterbare** Anwendung zu schaffen,  
die sich gut mit den in der Lehrveranstaltung vermittelten Prinzipien (SOLID, Design Patterns, Schichtenarchitektur) deckt.

Die Anwendung verfolgt einen klassischen **3-Schichten-Ansatz** (GUI, Service/Business, Daten/Repository) mit einer separaten **Domain-Schicht** für die fachlichen Modelle.  
Ein Überblick über die Komponenten ist im Diagramm `docs/architektur-diagramm.png` dargestellt.


## 2. Architekturstil

### 2.1 Gewählter Architekturstil

- **Architekturmuster:** 3-Schichten-Architektur (Presentation / Business / Data)
- **Zusätzliche Struktur:** Domain-Schicht für zentrale Geschäftsobjekte

Begründung:

- Die Anwendung lässt sich natürlich in **Benutzeroberfläche**, **Geschäftslogik** und **Datenzugriff** trennen.
- Das Muster ist **verständlich**, **bewährt** und im Rahmen eines Semesterprojekts gut umsetzbar.
- Es unterstützt die Anwendung von **SOLID-Prinzipien** und **Design Patterns** (z.B. Repository, Strategy).

Komplexere Stile wie Hexagonal / Ports & Adapters sind für spätere Ausbaustufen denkbar, würden aber aktuell zusätzlichen Overhead erzeugen, ohne einen klaren Mehrwert für den Projektumfang zu liefern.


### 2.2 Schichten und Abhängigkeiten

Die Architektur folgt dem Prinzip:  
**GUI → Service/Business → Repository → Datenbank**,  
wobei keine Abhängigkeiten „rückwärts“ oder quer zwischen den Schichten erlaubt sind.

- **GUI-Schicht**
  - Klassen: `TrainingView`, `DashboardView`, `ReportView`
  - Aufgabe: Darstellung der Daten, Entgegennahme von Nutzereingaben, Weitergabe von Aktionen an die Services.
  - Abhängigkeiten: nur auf Service-Schicht.

- **Service-/Business-Schicht**
  - Klassen: `TrainingService`, `StatistikService`, `BenutzerService`
  - Aufgabe: Geschäftslogik, Validierung, Koordination von Abläufen, Nutzung von Design Patterns (Strategy, Repository).
  - Abhängigkeiten: auf Domain-Klassen und Repository-Interfaces.

- **Daten-/Repository-Schicht**
  - Klassen/Interfaces: `TrainingRepository`, `BenutzerRepository`, `InMemoryTrainingRepository`, später z.B. `SqlTrainingRepository`.
  - Aufgabe: Kapselung des Datenzugriffs (In-Memory oder persistente DB).
  - Abhängigkeiten: auf Domain-Klassen und technische Infrastruktur (z.B. `DatabaseConnection`).

- **Domain-Schicht**
  - Klassen: `Training`, `Benutzer`, ggf. weitere Domain-Modelle.
  - Aufgabe: Repräsentation der fachlichen Objekte, inklusive sinnvoller Methoden (z.B. Berechnungen, Formatierungen).
  - Abhängigkeiten: möglichst wenig, keine direkten UI- oder Datenbankabhängigkeiten.


## 3. SOLID-Prinzipien im Design

Die Architektur und das Klassendesign orientieren sich an den SOLID-Prinzipien, wie sie in Skript und Übungsblatt gefordert sind.   

### 3.1 Single Responsibility Principle (SRP)

- **Beispiel erfüllt:**  
  - `TrainingService` ist ausschließlich für Geschäftslogik rund um Trainings zuständig (Speichern, Abrufen, Validierung).
  - `TrainingRepository` ist ausschließlich für Datenzugriff zuständig.
- **Bewusste Trennung:**  
  - UI-Logik (Views) ist von Geschäftslogik (Services) getrennt.
  - Domain-Klassen (`Training`, `Benutzer`) enthalten nur fachliche Logik, aber keinen DB- oder UI-Code.

### 3.2 Open/Closed Principle (OCP)

- Neue Trainingstypen oder Auswertungslogiken können durch zusätzliche Klassen (z.B. neue `CalculationStrategy`-Implementierungen) ergänzt werden, ohne bestehende Klassen ändern zu müssen.
- Repository-Implementierungen können ausgetauscht werden (z.B. `InMemoryTrainingRepository` → `SqlTrainingRepository`), ohne den `TrainingService` anzupassen.

### 3.3 Liskov Substitution Principle (LSP)

- Alle konkreten Strategien (`RennenStrategy`, `LaufenStrategy`, `RadfahrenStrategy`) lassen sich überall dort einsetzen, wo das Interface `CalculationStrategy` erwartet wird.
- Alle konkreten Repositories (`InMemoryTrainingRepository`, `SqlTrainingRepository`) verhalten sich konsistent als Implementierungen von `TrainingRepository`.

### 3.4 Interface Segregation Principle (ISP)

- Es werden gezielt **kleine, spezialisierte Interfaces** verwendet:
  - `TrainingRepository` ist nur für Training-Daten zuständig.
  - Separate Interfaces sind möglich für andere Domänenbereiche (`BenutzerRepository` usw.).
- Es gibt kein „God-Interface“ mit zu vielen Pflichten.

### 3.5 Dependency Inversion Principle (DIP)

- Die Service-Schicht hängt von **Abstraktionen**, nicht von konkreten Implementierungen:
  - `TrainingService` hängt von `TrainingRepository` (Interface) ab, nicht von `InMemoryTrainingRepository` oder `SqlTrainingRepository`.
- Dadurch werden Testbarkeit (Mocking) und Austauschbarkeit der Datenquelle unterstützt.


## 4. Eingesetzte Design Patterns

In der Architektur sind bewusst folgende Design Patterns verankert:   

### 4.1 Strategy Pattern (Kalorienberechnung)

- **Problem:**
  - Die Kalorienberechnung soll je nach Trainingstyp (Rennen, Laufen, Radfahren) variieren, ohne überall `if/else`-Logik einzubauen.
- **Lösung:**
  - Einführung eines Interfaces `CalculationStrategy` mit der Methode `berechne(t: Training): double`.
  - Konkrete Strategien:
    - `RennenStrategy`
    - `LaufenStrategy`
    - `RadfahrenStrategy`
  - `TrainingService` hält eine Referenz auf `CalculationStrategy` und delegiert die Berechnung an die aktuell gesetzte Strategie.
- **Vorteile:**
  - Neue Berechnungsarten können durch neue Strategien ergänzt werden.
  - Code bleibt übersichtlich, wartbar und testbar.
  - Unterstützt OCP und DIP.

### 4.2 Repository Pattern (Datenzugriff)

- **Problem:**
  - Datenzugriff (Lesen/Schreiben) soll gekapselt werden, damit die Geschäftslogik nicht von konkreten DB-Technologien abhängt.
- **Lösung:**
  - Interface `TrainingRepository` mit Methoden wie `save`, `findAll`, `findById`.
  - Konkrete Implementierung: `InMemoryTrainingRepository`, später optional `SqlTrainingRepository`.
  - `TrainingService` kennt nur das Interface `TrainingRepository` und nicht die konkrete Implementierung.
- **Vorteile:**
  - Einfacher Austausch der Speicherstrategie (z.B. In-Memory → SQLite).
  - Erhöhte Testbarkeit (Mocks / In-Memory-Repo).
  - Klare Trennung zwischen Geschäftslogik und Persistenzschicht.


## 5. Technologie-Stack

Der gewählte Technologie-Stack unterstützt direkt die 3-Schichten-Architektur und die gewählten Patterns. Die Details sind in `docs/technologie-stack.md` dokumentiert.   

Kurzüberblick:

- **Programmiersprache:** Java (z.B. Java 17)
- **UI-Framework:** JavaFX (Desktop-GUI, klare Trennung von View und Logik)
- **Datenbank:** SQLite (eingebettete, leichtgewichtige Datenbank)
- **Datenzugriff:** JDBC
- **Build-Tool:** Maven
- **Testing:** JUnit 5
- **UML-/Dokutools:** PlantUML / draw.io
- **Versionsverwaltung:** Git (z.B. GitHub/GitLab)


## 6. Deployment-Überlegungen

Aktueller Stand (Semesterprojekt):

- **Deployment-Ziel:** Lokale Ausführung auf einem Entwicklerrechner.
- **Artefakt:** Ausführbares JAR oder Start aus der IDE (z.B. IntelliJ, Eclipse).
- **Datenhaltung:**
  - Initial: `InMemoryTrainingRepository` für schnelle Entwicklung und Tests.
  - Perspektivisch: `SqlTrainingRepository` mit SQLite-Datei im Projektverzeichnis (`data/app.db` o.ä.).

Mögliche zukünftige Erweiterungen:

- Externe DB (z.B. PostgreSQL) für Mehrbenutzerbetrieb.
- Web- oder Mobile-Frontend, das über HTTP/REST mit einer Service-Schicht kommuniziert.
- Verpackung als Installer oder Docker-Container.


## 7. Offene Punkte und Risiken

- **Persistente Speicherung:**
  - Umstellung von In-Memory auf eine echte SQLite-Implementierung ist geplant, aber noch nicht vollständig umgesetzt.
- **Validierung & Fehlerbehandlung:**
  - Basis-Validierungen sind vorhanden (z.B. Mindestdauer für Trainings), weitere Regeln können folgen.
  - Exception-Handling und benutzerfreundliche Fehlermeldungen im UI sind noch auszubauen.
- **Testabdeckung:**
  - Unit-Tests für `TrainingService` und Repositorys sind vorgesehen, die Testabdeckung ist aktuell noch begrenzt.
- **Nicht-funktionale Anforderungen:**
  - Performance ist für den aktuellen Umfang ausreichend, für größere Datenmengen müssten Ladezeiten und Speicherstrategien überprüft werden.
  - Benutzerfreundlichkeit des UI (z.B. Navigation, Fehlermeldungen) ist ein iterativer Prozess.

Dieses Architektur-Dokument dient als Leitfaden für die weitere Implementierung und stellt sicher, dass die entwickelten Klassen, Pakete und Komponenten mit den gewählten Prinzipien und Patterns konsistent bleiben.
