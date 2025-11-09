Ein interner Algorithmus bestimmt wann und welche Nachrichten dem Nutzer gesendet werden sollen.
Wenn solch eine Nachricht gesendet werden soll, wird diese auf den Nutzer angepasst.
Die Nachricht wird über das Betriebssystem (interne Nachricht) oder über das Internet (Serverseitige Nachricht) an den Nutzer gesendet. Dabei wird die geplante Benachrichtigung
für Nachverfolgungszwecke geloggt.
Wenn die Nachricht ankommt, wird dies auch protokolliert.
Falls nicht wird geprüft ob das Gerät offline ist, falls nicht wird der Fehler protokolliert und der Prozess endet.
Wenn die Nachricht also ankommt wird geprüft ob der Nutzer drauf reagiert. Falls ja öffnet sich die App und eine positive Nutzerreaktion wird protokolliert. 
Falls er nicht reagiert, eine negative Reaktion.
Ende des Prozesses.
