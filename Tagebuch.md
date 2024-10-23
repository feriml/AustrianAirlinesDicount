## Tagebuch Modul 5

### App Klasse

- hier findet die Ausgabe statt

### Angebot Klasse

#### Methoden

- setRabattstrategie
- toString

Besonderheit bei der setRabattstrategie Methode ist, dass je 
nach Monat eine andere Rabattstrategie angwendet wird.

### Rabattstrategie Klasse

Abstrakte Klasse die eine Methode namens
getReduzierterPreis mitgibt und das Datenfeld bezeichnung besitzt.

### MaxiDiscount Klasse

Diese Klasse erbt von Rabattstrategie.
Sie besitzt ein Datenfeld rabatt, das den prozentuellen
rabatt festlegt. Die getReduzierterPreis Methode wird ausgebaut
und rechnet den Preis des Angebotes minus den prozentsatz.

### MidiDiscount Klasse

Diese Klasse erbt von Rabattstrategie.
Sie besitzt ein Datenfeld rabatt, das den prozentuellen
rabatt festlegt. Die getReduzierterPreis Methode wird ausgebaut
und rechnet den Preis des Angebotes minus den prozentsatz.

### ZeroDiscount

Diese Klasse erbt von Rabattstrategie.
Sie besitzt ein Datenfeld rabatt, das den prozentuellen
rabatt festlegt. Die getReduzierterPreis Methode wird ausgebaut
und rechnet den Preis des Angebotes minus den prozentsatz.