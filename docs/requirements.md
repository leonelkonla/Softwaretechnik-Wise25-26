# Requirements-Dokument – Fitness-Tracker

**Projekt**: Fitness-Tracker – Ganzheitliches Fitness- und Gesundheits-Tracking  
**Modul:** Softwaretechnik – Wintersemester 2025/26 
**Version:** 1.0 (Woche 4)  
**Team:** [3]  
**Datum:** [27.10.2025]

---

## 1. Projektübersicht
Die *Fitness-Tracking* unterstützt Nutzer:innen dabei, ein ausgewogenes und gesundes Leben zu führen.  
Sie erfasst tägliche Aktivitäten in den Bereichen Bewegung, Ernährung, Schlaf, Hydration und Erholung und berechnet daraus einen ganzheitlichen **Life-Skill-Score**.  
Ziel ist es, Gewohnheiten sichtbar zu machen, Motivation zu fördern und langfristig die eigene Balance zu verbessern.

**Zielgruppe:**  
- Studierende und Berufstätige, die ihren Lebensstil bewusster gestalten wollen.  
- Nutzer:innen, die eine einfache, datenbasierte Übersicht über ihre täglichen Gewohnheiten wünschen.  

**Abgrenzung:**  
- Kein Fitness-Tracking über Wearables (z. B. Apple Watch, Fitbit).  
- Keine Chat- oder Community-Funktionen.  
- Keine medizinischen Diagnosen oder Empfehlungen.
- ...

---

## 2. Funktionale Anforderungen

| ID | Anforderung | Priorität | Abnahmekriterium |
|----|-------------|-----------|------------------|
| F1 | Nutzer kann ein Konto anlegen (Registrierung) und sich anmelden. | A | Registrierung, Login und Logout funktionieren; Daten sicher gespeichert. |
| F2 | Nutzer kann tägliche Werte zu Bewegung, Ernährung, Schlaf, Wasser und Erholung eingeben. | A | Eingaben validiert, gespeichert und Datum korrekt zugeordnet. |
| F3 | System berechnet automatisch den Life-Skill-Score anhand der täglichen Eingaben. | A | Score-Berechnung liefert reproduzierbare Werte nach definierter Formel. |
| F4 | Dashboard zeigt aktuellen Score und Statusanzeige (z. B. Ampelfarben). | A | UI zeigt Score korrekt an; Anzeige aktualisiert sich nach Eingaben. |
| F5 | Nutzer kann Verlauf und Trends (7/30 Tage) visualisieren. | A | Diagramm zeigt korrekte Aggregation; Werte mit Zeitreihe übereinstimmend. |
| F6 | Nutzer kann Profil- und Zielwerte ändern (z. B. tägliches Trinkziel). | B | Änderungen persistiert und sofort im System sichtbar. |
| F7 | System generiert einfache Empfehlungen (z. B. „Trinke mehr Wasser“). | C | Empfehlung basiert auf Score-Analyse. |
| F8 | Admin/Coach kann Nutzer und globale Regeln verwalten. | C | Nur über Backend-Interface; Rollenrechte geprüft. |

---

## 3. Nicht-funktionale Anforderungen

| Kategorie | Beschreibung |
|------------|--------------|
| **Usability** | Intuitive mobile UI mit klarer Struktur und Feedback (Farben, Icons, Animationen). |
| **Performance** | Reaktionszeit < 200 ms bei lokaler Eingabe; Datenbank-Abfragen < 2 s. |
| **Sicherheit** | Passwörter gehasht (bcrypt oder Argon2); sichere Session-Tokens. |
| **Zuverlässigkeit** | 99 % aller CRUD-Operationen fehlerfrei im MVP-Testlauf. |
| **Datenschutz** | Speicherung minimaler personenbezogener Daten; DSGVO-konform. |
| **Portabilität** | Responsive Web-App; später optional Mobile-App (Flutter/React Native). |
| **Wartbarkeit** | Modulare Architektur (Frontend / Backend / DB); Code-Dokumentation in README. |
| **Erweiterbarkeit** | Neue Kategorien und Analysen ohne Code-Bruch integrierbar. |

---

## 4. User Stories

| ID | User Story | Akzeptanzkriterium |
|----|-------------|--------------------|
| US1 | Als **Nutzer** möchte ich mich registrieren, um mein persönliches Profil zu erstellen. | Registrierung bestätigt, Konto angelegt, Auto-Login aktiv. |
| US2 | Als **Nutzer** möchte ich mich anmelden, um auf meine Daten zuzugreifen. | Login funktioniert; Dashboard erscheint. |
| US3 | Als **Nutzer** möchte ich meine täglichen Werte eingeben, um meinen Fortschritt zu speichern. | Daten werden persistiert und validiert. |
| US4 | Als **Nutzer** möchte ich meinen Score sehen, um meine Lebensbalance einzuschätzen. | Score korrekt angezeigt und aktuell. |
| US5 | Als **Nutzer** möchte ich meine Entwicklung der letzten 7 und 30 Tage sehen. | Diagramm zeigt korrekte Werte. |
| US6 | Als **Nutzer** möchte ich Empfehlungen erhalten, um mein Verhalten zu verbessern. | Empfehlung erscheint bei niedrigem Score. |
| US7 | Als **Admin** möchte ich Nutzer verwalten, um Datenkonsistenz zu gewährleisten. | CRUD-Funktionen funktionieren im Admin-Interface. |

---

## 5. Priorisierung

| Priorität | Beschreibung | Anforderungen |
|------------|--------------|---------------|
| **A – MVP (Minimal Viable Product)** | Muss für erste Demo lauffähig sein. | F1–F5 |
| **B – Phase 2 (Nice to Have)** | Erweitert Kernfunktionen. | F6 |
| **C – Phase 3 (Optional)** | Spätere Optimierung / Zusatznutzen. | F7–F8 |

---

## 6. Änderungs- und Versionsmanagement
- Alle Änderungen werden im Git-Repository versioniert.  
- Jede Änderung erhält einen Commit-Kommentar mit ID-Referenz (z. B. „#F3 Score-Berechnung implementiert“).  
- Neue Anforderungen werden veröffentlicht.

---

## 7. Verknüpfung mit nächsten Schritten
- Woche 4 (**Use-Case-Diagramm & Beschreibungen**)  
- Woche 5 (**Klassendiagramm**)  
- Wird nach Woche 7 im **Sprint-Backlog** weitergeführt.

---

*Ende des Dokuments – Requirements-Version 1.0*
