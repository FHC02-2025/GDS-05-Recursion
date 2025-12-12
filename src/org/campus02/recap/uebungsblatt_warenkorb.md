# Übungsblatt: Warenkorb in Java

## Lernziele
- Klassen und Objekte entwerfen und implementieren (Artikel, Warenkorb).
- Collections (List, Set, Map) sinnvoll einsetzen.
- equals() / hashCode() korrekt implementieren.

---

## Projektstruktur
- src/org/campus02/
    - Artikel.java
    - Warenkorb.java
    - WarenkorbDemo.java

---

## Aufgaben (Schritt-für-Schritt)

### Aufgabe 1 — Artikel-Klasse
Implementieren Sie eine Klasse `Artikel` mit:
- Felder: `int artId`, `String name`, `double price`
- Konstruktor, Getter für alle Felder.
- `equals()` und `hashCode()`
- optional: `equals()` und `hashCode()` so, dass Artikel mit gleicher `artId` als gleich gelten.
- `toString()` für lesbare Darstellung.

Hinweise:
- getter, equals und hashcode sowie toString von der IDE erzeugen lassen

---

### Aufgabe 2 — Warenkorb-Grundfunktionen 
Implementieren Sie eine Klasse `Warenkorb` mit einer `List<Artikel>` (z. B. `ArrayList`) und folgenden Methoden:
- `void addArtikel(Artikel a)` — Artikel hinzufügen.
- `boolean remove(Artikel a)` — entfernt erstes Vorkommen (per `equals`).
- `boolean removeByArtId(int artId)` — entfernt erstes Vorkommen mit dieser `artId`.
- `void printArtikel()` — Artikel auf Konsole ausgeben.
- `void empty()` — Warenkorb leeren.
- `int count()` — Anzahl (inkl. Duplikate).
- `HashSet<Artikel> unique()` - nur eindeutige Produket im Warenkorb retournieren
---

### Aufgabe 3 — Erweiterte Aggregationsfunktionen
Ergänze im `Warenkorb` folgende Methoden:
- `double getHighestPrice()` — höchster `price` (0.0 für leeren WK).
- `double calculateSum()` — Summe aller Preise.
- `Map<String, Integer> countByName()` — Häufigkeit je `name` (gruppieren und zählen).

---

### Aufgabe 4 — Main / Demo 
Erstellen Sie eine Klasse `WarenkorbDemo`, welche:
- Mindestens 5 Artikel erzeugt (einige gleiche Namen, evtl. gleiche `artId` als Duplikat).
- Artikel in Warenkorb aufnimmt.
- Alle Funktionen aufruft und lesbar ausgibt (Unique, highestPrice, Summe, Kategorien).

---
