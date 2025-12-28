# CI/CD Pipeline

**Platform:** GitHub Actions

## Automatisierte Schritte
1. ✅ Code auschecken
2. ✅ Umgebung einrichten (Java 21)
3. ✅ Dependencies laden (gecacht)
4. ✅ Projekt kompilieren
5. ✅ Tests ausführen
6. ✅ Coverage-Report generieren
7. ✅ JAR-Artefakt erstellen

## Trigger
- Bei Push auf `main` Branch
- Bei Pull Requests

## Pipeline-Dauer
- Durchschnittlich: ca. 50 Sekunden

## Artefakte
- JAR-Datei: `target/*.jar`
- Test-Reports: `target/surefire-reports/`
- Coverage-Report: ToDo

## Links
- Pipeline-Runs: https://github.com/leonelkonla/Softwaretechnik-Wise25-26/actions
- Letzter erfolgreicher Build: https://github.com/leonelkonla/Softwaretechnik-Wise25-26/actions/runs/20525350132

## Erweiterte Features

### Automatische Versionierung
- Format: 1.0.[Git-Commit-Count]
- Beispiel: 1.0.42
- Build-Info-Datei wird generiert

### Quality Gates
- ✅ Code Coverage muss ≥ 50% sein
- ✅ Alle Tests müssen bestehen
- ✅ Code muss kompilieren

### Branch-Strategie
- `main`: Stable releases
- `feature/*`: Feature branches werden getestet
