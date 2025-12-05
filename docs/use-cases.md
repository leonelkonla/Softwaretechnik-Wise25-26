# Use-Cases:

## UC-01: Nutzer registrieren  
---  
Kurzbeschreibung:  
Neuer Nutzer möchte sich im Programm registrieren  
Akteur(e):  
- Unregistrierter Nutzer  
Auslöser:  
- Nutzer hat Programm installiert und möchte sich registrieren  
Vorbedingungen:  
- Nutzer hat Programm installiert  
- Registrierung ist verfügbar  
 
Normalablauf:  
1. Nutzer öffnet Programm  
2. System zeigt Registrierungsformular  
3. Nutzer wählt Mailadresse und Passwort  
4. System prüft, ob Mailadresse bereits vergeben wurde   
5. Nutzer bestätigt Eingabe  
6. System speichert Daten und zeigt Bestätigung  
 
Ergebnis:  
- Nutzer ist im System registriert und kann sich anmelden  
 
Alternative Abläufe:  
- Nutzer bricht ab → System verwirft Eingabe  
- Mailadresse bereits vorhanden → Nutzer kann andere angeben 
 
 Offene Fragen:  
- sollen bestimmte Passwortrichtlinien umgesetzt werden?  
- soll neuer Nutzer seinen Account per Mail bestätigen? 
 
 
 
## UC-02: Schrittzähler  
---  
Kurzbeschreibung:  
Der Nutzer möchte seine täglichen Schritte protokollieren  
Akteur(e):  
- Registrierter Nutzer  
Auslöser:  
- Nutzer hat Programm geöffnet und wählt den Punkt „tägliche Schritte“  
Vorbedingungen:  
- Nutzer ist eingeloggt  
- Anzahl der am Tag bewältigten Schritte ist bekannt 
  
Normalablauf:  
1. Nutzer öffnet Programm  
2. System öffnet Startansicht  
3. Nutzer wählt „tägliche Schritte“  
4. Nutzer gibt Anzahl der Schritte an   
5. Nutzer bestätigt Eingabe  
6. System speichert Daten und zeigt Bestätigung  
 
Ergebnis:  
- Nutzer kann Schrittanzahl protokollierter Tage rückwärtig auswerten 
 
Alternative Abläufe:  
- Nutzer gibt an einem Tag keine Schritte an → System speichert leeren Wert  
- Nutzer möchte vergessene Werte ergänzen → Nutzer kann Tag auswählen und Daten ergänzen 
 
 Offene Fragen:  
- sollen bestimmte Ziele gesetzt werden können?  
- soll zu einem bestimmten Zeitpunkt an Speicherung der Schritte erinnert werden? 
 
 
 
## UC-03: Kalorienzähler  
---  
Kurzbeschreibung:  
Der Nutzer kann seine täglichen Kalorien speichern  
Akteur(e):  
- Registrierter Nutzer  
Auslöser:  
- Nutzer hat Mahlzeit zu sich genommen   
Vorbedingungen:  
- Nutzer ist eingeloggt  
- Nutzer kennt Kalorienwert seiner Mahlzeiten 
 
Normalablauf:  
1. Nutzer öffnet Programm  
2. System zeigt Startansicht 
3. Nutzer wählt “Kalorienzähler”   
4. System öffnet Eingabemaske für zu speichernde Kalorienmenge   
5. Nutzer gibt Wert ein und bestätigt Eingabe 
6. System speichert Wert 
7. System aktualisiert täglichen Gesamtwert  
 
Ergebnis:  
- Kalorienmenge der Mahlzeit ist gespeichert 
 
Alternative Abläufe:  
- Nutzer bricht ab → System verwirft Eingabe 
- Nutzer möchte vergessene Werte ergänzen → Nutzer kann Tag auswählen und Daten ergänzen 
 
 Offene Fragen:  
- sollen zusätzliche Ernährungshinweise ausgegeben werden (z.B. bei dauerhaft hohen täglichen Kalorienwerten?  
 
 
## UC-xx: Beim Systemstart  
---  
Kurzbeschreibung:  
Der Nutzer startet Programm zum ersten Mal an einem Tag  
Akteur(e):  
- Registrierter Nutzer  
Auslöser:  
- Nutzer hat Programm nach 00:01h zum ersten Mal gestartet   
Vorbedingungen:  
- Nutzer ist eingeloggt  
- kein vorheriger Start des Programms an diesem Tag  
 
Normalablauf:  
1. Nutzer öffnet Programm  
2. System zeigt Begrüßung des Nutzers 
3. System wählt aus einem Katalog von Vorschlägen zufällig eine Empfehlung aus und blendet sie ein   
4. Nutzer bestätigt die Empfehlung   
5. System lädt Startansicht  
 
Ergebnis: - Nutzer sieht die Startansicht des Programms 
 
Alternative Abläufe:  
- Nutzer möchte keine Empfehlung → System überspringt beim ersten Start die Empfehlungsansicht  
 
 Offene Fragen:  
- sollen die Vorschläge zufällig ausgewählt werden oder anhand bestimmter Parameter (z.B. Wetter)?  
- sollen es 2 Einblendungen sein oder sollen sie verknüpft werden? 
 
# AI-Zuhilfenahme & Bewertung:
a)
Prompt: 
"Ich entwickle eine Fitness-Tracking-App, die nicht nur die sportlichen Aktivitäten einer Person, sondern auch dessen Wohlbefinden im Allgemein umfasst. Ernährungs-Tracker-Scores sollen die Anwender motivieren, gesunde Gewohnheiten zu entwickeln, Routinen zu verbessern und eine nachhaltige Balance zwischen Körper und Geist zu finden. Ich habe folgende Use Cases identifiziert: [UC-01: Nutzer registrieren -Kurzbeschreibung:  Neuer Nutzer möchte sich im Programm registrieren]; [UC-0x: Schrittzähler - Kurzbeschreibung:  Der Nutzer möchte seine täglichen Schritte protokollieren]; [UC-1x: Kalorienzähler - Kurzbeschreibung: Der Nutzer kann seine täglichen Kalorien speichern]; [UC-xx: Tipps beim Systemstart - Kurzbeschreibung: Der Nutzer startet Programm zum ersten Mal an einem Tag]. Welche wichtigen Use Cases fehlen möglicherweise noch? Berücksichtige dabei Verwaltungsaufgaben, Fehlerszenarien und Systemwartung.“

## Zu übernehmende generierte Antworten: 
UC-07: Systembenachrichtigungen & Erinnerungen senden
---
Kurzbeschreibung:
Das System erinnert den Nutzer an Trainings, Pausen, Mahlzeiten oder Wohlbefindens-Checks.
Akteur(e):
-System (Hauptakteur)
-Registrierter Nutzer (Reaktionsakteur)
Auslöser:
-Geplanter Zeitpunkt oder erkannter Bedarf (z. B. kein Training am aktuellen Tag)
-Vom Nutzer aktivierte Erinnerungsfunktion
Vorbedingungen:
-Nutzer ist registriert und hat Benachrichtigungen aktiviert
-Benachrichtigungszeitpunkte oder Ereignisse sind im System hinterlegt
Normalablauf:
1.	System überprüft, ob Erinnerungen für den aktuellen Tag fällig sind.
2.	System erstellt Benachrichtigung (z. B. „Zeit für dein Training!“).
3.	System sendet Erinnerung an das Endgerät (Push-Nachricht oder In-App-Hinweis).
4.	Nutzer öffnet die Benachrichtigung.
5.	System öffnet den entsprechenden Bereich (z. B. Training, Mahlzeit oder Wohlbefinden).
6.	Nutzer führt die empfohlene Aktion aus (z. B. Training starten).
Ergebnis:
-Nutzer wurde erfolgreich erinnert und hat Zugriff auf die relevante Funktion.
-Erinnerungsstatus wird im System protokolliert.
Alternative Abläufe:
-Nutzer ignoriert Benachrichtigung → System speichert Status „nicht reagiert“.
-Gerät ist offline → System versucht Zustellung erneut, sobald Verbindung besteht.
-Nutzer deaktiviert Erinnerungen → System sendet keine weiteren Hinweise.
Offene Fragen:
-Soll der Nutzer die Häufigkeit und Art der Erinnerungen individuell konfigurieren können?
-Sollen Erinnerungen kontextsensitiv sein (z. B. wetterabhängig oder basierend auf bisherigen Aktivitäten)?


UC-09: Daten exportieren / löschen
---
Kurzbeschreibung:
Der Nutzer kann seine Fitness- und Ernährungsdaten exportieren oder gemäß DSGVO vollständig löschen.
Akteur(e):
-Registrierter Nutzer
Auslöser:
-Nutzer wählt in den Einstellungen die Option „Daten exportieren“ oder „Daten löschen“.
Vorbedingungen:
-Nutzer ist eingeloggt
-Export-/Löschfunktion ist freigeschaltet
-Datensätze sind im System vorhanden
Normalablauf:
1.	Nutzer öffnet den Bereich „Datenschutz & Verwaltung“.
2.	System zeigt Optionen „Daten exportieren“ und „Daten löschen“.
3.	Nutzer wählt gewünschte Option.
4.	System fragt zur Sicherheit nach Bestätigung (z. B. Passwort oder PIN).
5.	Bei Export: System erstellt Datendatei im gewählten Format (z. B. CSV, JSON) und stellt Download bereit.
6.	Bei Löschung: System entfernt alle gespeicherten persönlichen Daten aus der Datenbank.
7.	System zeigt Bestätigung über erfolgreichen Export oder Löschung an.
Ergebnis:
-Nutzerdaten sind erfolgreich exportiert oder gemäß DSGVO gelöscht.
Alternative Abläufe:
-Nutzer bricht Vorgang ab → System verwirft Aktion.
-Exportvorgang scheitert (z. B. keine Internetverbindung) → System zeigt Fehlermeldung und bietet Wiederholung an.
-Nutzer löscht nur Teilbereiche (z. B. Trainingsdaten) → System fragt nach Auswahlbestätigung.
Offene Fragen:
-In welchen Formaten sollen Exporte bereitgestellt werden (CSV, JSON, PDF)?
-Soll nach Löschung ein Backup für kurze Zeit verfügbar bleiben (z. B. zur Wiederherstellung bei Fehlbedienung)?


Prompt 2:
„Hier ist meine Use Case Beschreibung: [UC-0x:  Der Nutzer möchte seine täglichen Schritte protokollieren. Akteure sind registrierter Nutzer. Auslöser dieses Anwendungsfalls ist, dass der Nutzer das Programm startet und die Option „tägliche Schritte“ wählt. Vorbedingungen sind, dass der Nutzer eingeloggt ist und ihm die Anzahl der am Tag bewältigten Schritte bekannt sind. Der Normalablauf gliedert sich wie folgt:  Der Nutzer öffnet Programm, das System öffnet Startansicht, der Nutzer wählt „tägliche Schritte“, gibt dann die Anzahl der Schritte an und bestätigt die Eingabe. Das System speichert Daten und zeigt eine erkennbare Bestätigung. Als Ergebnis kann der Nutzer auf die protokollierten gespeicherten Daten jederzeit rückwärtig zugreifen. Für den alternativen Fall, dass der Nutzer an einem Tag keine Schritte angibt, speichert das System für den Tag einen leeren Wert, oder auch alternativ, wenn der Nutzer vergessene Werte ergänzen möchte, kann er einen Tag auswählen und die entsprechenden Daten notieren. Offen bleibt momentan noch, ob bestimmte Ziele gesetzt werden können sollen.  Und ob ab einem bestimmten Zeitpunkt an die Speicherung der Schritte erinnert werden soll?]. Bitte überprüfe:
1. Ist der Ablauf vollständig und logisch?
2. Fehlen wichtige Alternative oder Fehlerszenarien?
3. Sind Vor- und Nachbedingungen klar definiert?"

Es waren mehrere Verbesserungsvorschläge der KI konstruktiv. Man hätte in der Ablaufsequenz zum Schluss ergänzen können, was das System nach der Speicherung tut, also dass es die Schrittstatistik aktualisiert und zuvor eventuell auch noch, dass die Eingabe validiert wird. Entsprechend dazu hätte man als Alternativszenario eine ungültige Eingabe aufzählen können, was eine Fehlermeldung des Systems erwirken müsste. Auch muss auf das Szenario einer Aktualisierung eines zuvor eingegebenen Wertes eingegangen werden, wobei das System vor der Bestätigung erfragen sollte, ob der vorherige Wert wirklich überschrieben werden soll. Im Ergebnis könnte man noch ergänzen, dass die Schrittzahl in die Tagesstatistik aufgenommen werden soll.

Mit GenAI können knappe unausgearbeitete Vorgaben zu einem Projekt schnell in ihrer Ausführlichkeit erweitert werden. Auch die allgemeinen Elemente einer Analysephase können an den individuellen Charakter des Projektes angepasst werden, das heißt, ihnen wird eine fallbezogene Bedeutsamkeit beigemessen. Zudem können Geschäftsprozesse rund um die betrachtete App viel schneller ermittelt werden. Ausgehend von Dokumenten können bereits Grundgerüste für den Quellcode erstellt werden. AI wird auch genutzt, um die Einhaltung rechtlicher Vorgaben zu gewährleisten, sowie um die dazugehörige Dokumentation bereitzustellen. Bei der Analyse von Risiken können Fallen frühzeitig erkannt werden, zeitlicher Aufwand kann akkurater evaluiert werden und weitaus mehr wird durch Gen-AI stark vereinfacht. 
Jedoch nicht alles, denn vor allem die zwischenmenschliche Komponente der Analysephase bleibt den Menschen überlassen. KI kann keine Konflikte zwischen Stakeholdern verhandeln. In Interviews erkennt KI keine Ironie oder Körpersprache, was oft wichtig zur Deutung der Bedürfnisse des Gegenübers ist. AI kann kein Unwissen über einen Fachbereich ersetzen, wenn fehlerhafte Beschreibungen an sie und damit in ihr Ergebnis übertragen werden.
