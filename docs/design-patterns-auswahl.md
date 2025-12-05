1. Warum haben wir diese zwei Patterns gewählt?

Die verwendung von Strategy-Pattern: jede Trainingsart (Kraft, Calisthenics, Laufen) ihre eigenen Regeln für die Kalorienberechnung. Wenn man alles in eine einzige Methode packt, entsteht schnell ein unübersichtlicher Code voller Spezialfälle. Durch separate Strategien bleibt die Berechnungslogik klar getrennt und jede Trainingsart kann ihre eigene Implementierung bekommen.

Das Repository-Pattern wurde gewählt, um die Datenspeicherung sauber vom Rest der Anwendung zu trennen. Ohne dieses Pattern würde Speicherlogik direkt in Domain-Klassen oder Services landen, was zu unnötiger Vermischung von Verantwortlichkeiten führt. Mit den Repositories wird die Datenhaltung gekapselt und bleibt flexibel.

2. Welche Vorteile erwarten wir?

- Wartbarkeit

    Die Logik ist auf mehrere übersichtliche Klassen verteilt.
    Änderungen an einer Berechnung oder an der Speicherlogik betreffen nicht das gesamte System.

Fehler lassen sich leichter lokalisieren.

- Erweiterbarkeit

    Für neue Trainingsarten, einfach eine neue Strategie hinzufügen.

    Für neue Speicherarten (Memory, Datei, SQL), eine Repository-Implementierung, ohne den bestehenden Code anzupassen.

- Testbarkeit

    Strategien lassen sich einzeln testen.
    Repositories können als Mock ausgetauscht werden.
    Services können ohne UI oder Datenbank getestet werden.

3. Nachteile

- Komplexität

    Es entstehen deutlich mehr Klassen als in einer „alles in eine Klasse“-Lösung.Für kleinere Projekte kann das zunächst übertrieben wirken.

- Mehr Struktur bedeutet mehr Aufwand

    Zu Beginn braucht es mehr Planung und Disziplin, um alles sauber zu trennen.Entwickler müssen das Pattern verstehen, sonst entstehen Lücken im Design.

- Indirekte Zugriffe

    Durch die Repository-Schicht gibt es zusätzliche Abstraktionsebenen.Auch beim Strategy-Pattern wird die Logik indirekt ausgeführt (Delegation statt direktem Aufruf).