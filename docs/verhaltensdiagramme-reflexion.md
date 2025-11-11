## Übersicht und Reflektion der Modellierungsphase


Erstellte Diagramme: 

(Erweitertes) Klassendiagramm mit zentralen Klassen unserer Anwendung basierend auf dem MVC-Strukturpattern: klassendiagramm-v0.1.pdf; klassendiagramm-v1.0.pdf
Aktivitätsdiagramm zur Modellierung des Notification-Use-Cases: aktivitaetsdiagramm-[use-case-07-Systembenachrichtigung].png
Sequenzdiagramm zum Prozess der Benutzerregistrierung: sequenzdiagramm-1.png
Suggestives Sequenzdiagramm zur Ausführung einer Trainingssession: sequenzdiagramm-2.png

Zentral für unser System ist das Model-View-Controller Designpattern, für das wir uns entschieden haben. Dementsprechend richtet sich auch die Kommunikation zwischen den einzelnen Klassen. Model und View haben keine direkte Verbindung zueinander, sondern kommunizieren über das Controllerpaket. Die zentralen Klassen jeder Schicht sind MainMenu für view, MainController für controller und User für model. Eine wichtige Erkenntniss bei der Modellierung war beispielsweise die versteckte Diversität an Möglichkeiten hinter dem Konzept des Trainingsplans, wobei wir uns dafür entschieden haben, die Tage selbst, die man individuell mit Übungen mustern kann, als grundsätzliche Einheit eines Plans nutzen werden.

Das Klassendiagramm der Woche 5 stellt ein überschaubares Modell der zentralsten Klassen, so wie sie voraussichtlich in der internen Kommunikation positioniert werden sollen, orientiert an den grundlegendsten Anforderungen, die wir für unser System definiert haben. Die dynamischen Diagramme der Woche 6 zeigen hingegen die funktionalen Abläufe einiger Anwendungsfälle. Hier wurden auch mögliche Bedingungen und entsprechende Verzweigungen in die Modellierung mit einbezogen. Beide Diagrammtypen sind insofern wichtig, da man für die Ausarbeitung des Softwarekonzepts, sowohl Prozessabläufe als auch statische Struktur durchdenken muss, um bei der Implementierung nicht auf Unstimmigkeiten zu stoßen. 

Abgesehen vom Erlernen der Semantik der einzelnen Notationselemente in UML gab es vor allem Schwierigkeiten bei der Umsetzung und Einhaltung von Abstraktionsgraden. Denn bei der Auseinandersetzung mit den Umsetzungen von Use-Cases fließen Details unumgänglich mit ein, da man zukünftige Ausarbeitung nicht durch logisch unabgeschlossene Grundgedanken unnötig inkompatibel machen will. Daher floss viel mehr Zeitaufwand in die Erstellung einiger Diagramme mit ein, als angenommen. Eine wichtige Erkenntnis dadurch jedoch war, ein Grundverständnis zur Funktionsweise einer Datenbanksystem-API, wodurch ersichtlich wurde, dass keine Foreign Key-Attribute nötig sind. Das nächste Mal sollte die Aneignung solcher Details jedoch in den Hintergrund geschoben werden.     
