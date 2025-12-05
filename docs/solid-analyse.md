b) SOLID in Ihrem Klassendiagramm prüfen

1. Single Responsibility Principle (SRP): Die Day Klasse hat mehrere Verantwortlichkeiten. Sie fügt Übungen hinzu, aktualisiert die Schritte und kalkuliert die Kalorien.

2.  Open/Closed Principle (OCP): Es sollte möglich sein die Exercise Klasse zu erweitern ohne ihren Quellcode verändern zu müssen.

3. Dependency Inversion Principle (DIP): Die Klassen sind von konkreten Implementierungen abhängig

c) Verbesserungen dokumentieren

Welche SOLID-Prinzipien werden in Ihrem aktuellen Design bereits befolgt?

SRP und OCP werden teilweise befolgt.


Wo gibt es Verstöße? (Mindestens 2 Beispiele)

•	die Day Klasse verstößt gegen das SRP
•	Wir haben keinerlei Interfaces und damit verstoßen wir gegen DIP, da die Klassen von konkreten Implementierungen abhängig sind.

Welche konkreten Verbesserungen schlagen Sie vor?

•	Die Day Klasse muss verändert werden. Die Aufgaben müssen auf mehrere Klassen verteilt werden. Die Schritte können zum Beispiel ihre eigene Klasse erhalten.
•	Wir müssen Interfaces implementieren, um sicher zu gehen, dass wir DIP verhindern und allgemein eine bessere Struktur in unseren Code bekommen.
