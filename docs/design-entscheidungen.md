Designentscheidungen:

1. Exercise-Vererbung:
Weight_Exercise und Cardio_Exercise erben von Exercise. Das ist eine typsichere Unterscheidung zwischen Kraft- und Ausdauertraining.

2. Controller-Pattern mit separaten Views:
MVC-Pattern: MainController + TrainingController + dedizierte Views
Das führt zu einer Separation of Concerns.
Alternative: Einzelner zentraler Controller

4. Hierarchische Plan-Struktur:
4-stufig: User → Plan → Day → Exercise
Das bildet den natürlichen Trainingsablauf ab und verteilt klare Verantwortlichkeiten pro Ebene.
Alternative: Flachere Struktur (User → Workout → Exercise), ist aber weniger flexibel


Offene Fragen:

- Keine Klasse für tatsächlich absolvierte Trainings
- Wie werden Daten dauerhaft gespeichert (Datenbank, lokaler Storage)?
