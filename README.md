# Einführung in die Programmierung - Übung 3

Dieses Repository enthält die Bearbeitung des 3. Übungsblattes aus dem Modul **Einführung in die Programmierung** an der **Universität Duisburg-Essen** (Prof. Dr. Pedro José Marrón)[cite: 1].

## 🎯 Lernziele
Praktischer Umgang mit primitiven Datentypen, Operatoren und Kontrollstrukturen (insbesondere einfache Programmabzweigungen) in Java[cite: 1].

## 📂 Projektstruktur & Aufgaben

### [Aufgabe 1 & 2: Logik und Fehlersuche](docs/Task%201%20&%202.pdf)
* **Aufgabe 1:** Formulierung von Java-Vergleichsoperationen (z. B. Überprüfung von Automarken, TÜV-Siegeln, Preisen und Baujahren)[cite: 1, 5].
* **Aufgabe 2:** Code-Korrektur von fehlerhaften Syntax-Ausdrücken (z. B. falsche Zuweisungen durch `=` statt `==` oder deklarierte Datentyp-Fehler bei `String` und `boolean`)[cite: 2, 5].

### [Aufgabe 3: Die Klasse `Auto`](src/Auto.java)
Erweiterung einer vorgegebenen Basisklasse[cite: 1, 3]:
* Implementierung von Passagier-Tracking durch die Methoden `einsteigen()` und `aussteigen()` unter Berücksichtigung einer vorgegebenen Maximalkapazität[cite: 3, 6].
* Zählung und Ausgabe der insgesamt beförderten Passagiere[cite: 3, 6].
* Nutzung einer `switch`-Anweisung, um spezifische Farben (wie "Bordeaux" oder "Kobalt") zu erkennen und entsprechende Strings auszugeben[cite: 3, 6].

### [Aufgabe 4: Die Klasse `Programm`](src/Programm.java)
Implementierung diverser Methoden zur Datenverarbeitung[cite: 1, 4]:
* **String-Manipulation:** Zeichenketten verbinden, lexikographische Vergleiche (`compareTo`), einzelne Zeichen an Index-Positionen extrahieren und gezieltes Ersetzen von Teilzeichenketten innerhalb eines Trennbereichs (`substring`, `indexOf`, `replace`)[cite: 4, 7].
* **Mathematische Operationen:** Addition, Subtraktion, Multiplikation und die Berechnung der Quersumme einer Zahl mittels Modulo (`%`)[cite: 4, 7].
* **Zinsrechnung (`millionaer`):** Berechnung der benötigten Laufzeit in Jahren für ein Startkapital, bis eine Million erreicht ist, realisiert durch eine `while`-Schleife[cite: 4, 7].
