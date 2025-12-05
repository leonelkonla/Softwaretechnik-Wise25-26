Die Gesamtstruktur der Anwendung orientiert sich am MVC-Muster (Model–View–Controller).
Das hilft uns, fachliche Logik, Benutzerschnittstelle und Steuerung voneinander zu trennen und das System übersichtlich zu halten.

Das Model enthält alle fachlichen Klassen wie User, Exercise, Plan und Statistic. Außerdem liegen dort die Services, die Geschäftsregeln abbilden, sowie die Repositories und Strategien. Im Model steckt also die gesamte Logik, die beschreibt, wie das System funktioniert.

Die View stellt die Oberfläche für die Nutzerinnen und Nutzer bereit.
Dort werden Formulare, Listen oder Auswertungen angezeigt. Die Views selbst enthalten keine Logik, die das Verhalten der Anwendung bestimmt – sie zeigen nur an, was das Model liefert.

Die Controller sind das Bindeglied zwischen View und Model.
Sie reagieren auf Benutzereingaben, rufen passende Methoden in den Services auf und aktualisieren anschließend die Views. Die Controller steuern also den Ablauf, ohne selbst die Regeln zu definieren.

Diese Struktur bringt Ordnung ins Projekt:

- Änderungen im UI betreffen die Logik nicht.
- Neue Funktionen können sauber über Controller und Services ergänzt werden.
- Das Model bleibt frei von Darstellungslogik, was die Entwicklung weniger fehleranfällig macht.
