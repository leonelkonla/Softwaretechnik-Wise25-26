Ein interner Algorithmus bestimmt wann und welche Nachrichten dem Nutzer gesendet werden sollen.
Wenn solch eine Nachricht gesendet werden soll, wird diese auf den Nutzer angepasst.
Die Nachricht wird über das Betriebssystem (interne Nachricht) oder über das Internet (Serverseitige Nachricht) an den Nutzer gesendet. Dabei wird die geplante Benachrichtigung
für Nachverfolgungszwecke geloggt.
Wenn die Nachricht ankommt, wird dies auch protokolliert.
Falls nicht wird geprüft ob das Gerät offline ist, falls nicht wird der Fehler protokolliert und der Prozess endet.
Wenn die Nachricht also ankommt wird geprüft ob der Nutzer drauf reagiert. Falls ja öffnet sich die App und eine positive Nutzerreaktion wird protokolliert. 
Falls er nicht reagiert, eine negative Reaktion.
Ende des Prozesses.


## Übungsblatt Woche 6: - Aufgabe 2: Sequenzdiagramm

- Sequenzdiagramm-1
Der User erstellt ein Konto, in der er seine Daten eingibt.Danach werden die Daten geprüft, Korrekt oder nicht und dann, nicht zurück in der Anmeldemaske. Wenn richtig, Wird das Dashbord eröffnet und alles angezeigt

- Sequenzdiagramm-2
Der User startet ein Training. das System erstellt dann eine Session und schick dann immer Benachrichtigung. Jede session wird immer gespeichert und während ein training läuf, hat der user die Möglichkeit Änderungen vorzunehmen.
