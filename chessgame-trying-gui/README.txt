Die Forsyth-Edwards-Notation (FEN) oder in der erweiterten Form (X-FEN) ist eine Kurznotation,
mit der jede beliebige Brettstellung im Schach niedergeschrieben werden kann. 

Ausgangslage des Schachspiels: rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w  KQkq  -  0  1
                               |_________________________________________||_||____||_||_||_|
                                                     1                     2   3    4  5  6

1)  Die erste Gruppe beschreibt die Positionen der Figuren auf dem Brett. 
    Dies geschieht reihenweise von oben links (Feld a8) bis unten rechts (Feld h1). 
    Jede Reihe wird durch einen Schrägstrich von der nächsten getrennt. 
    Jede Reihe besteht aus Buchstaben für die Figuren und Zahlen für die Anzahl der Leerfelder, 
    die die Aufstellung in dieser Zeile von links (a-Linie) nach rechts angeben. 
    Mehrere aufeinanderfolgende leere Felder in derselben Zeile müssen durch eine einzige Zahl (1 bis 8) angegeben werden. 
    Ein Großbuchstabe bezeichnet eine weiße und ein Kleinbuchstabe eine schwarze Figur, 
    wobei die Abkürzungen der englischen Bezeichnungen verwendet werden: 

    („r“ = Rook (Turm),
    „n“ = Knight (Springer),
    „b“ = Bishop (Läufer),
    „q“ = Queen (Dame),
    „k“ = King (König),
    „p“ = Pawn (Bauer))

    rnbqkbnr – Anordnung der Figuren auf der 8. horizontalen Linie von links nach rechts,
    / - Trennzeichen(nächste Zeile)
    pppppppp - Anordnung der Figuren auf der 7. horizontalen Linie,
    8/8/8/8 - leere 6-5-4-3. horizontale Linien,
    PPPPPPPP - Anordnung der Figuren auf der 2. horizontalen Linie,
    RNBQKBNR – Anordnung der Figuren auf der 1. horizontalen Linie,

2)  w - wer am Zug ist(w - weiß, b - schwarz),

Ausgangslage des Schachspiels: rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w  KQkq  -  0  1
                               |_________________________________________||_||____||_||_||_|
                                                     1                     2   3    4  5  6

3)  Die dritte Gruppe gibt die noch bestehenden Rochaderechte an. Hier bedeutet
    K: Weiß kann kurz rochieren (engl.: to castle kingside)
    Q: Weiß kann lang rochieren (engl.: to castle queenside)
    k: Schwarz kann kurz rochieren
    q: Schwarz kann lang rochieren
    -: es ist keine Rochade mehr möglich   

4)  En-passant-Schlag. Sofern im letzten Zug ein Bauer zwei Felder vorgerückt ist, 
    wird das übersprungene Feld angegeben, unabhängig davon, 
    ob ein en-passant-Schlag auf dieses Feld tatsächlich möglich ist oder nicht. Sonst wird „-“ angegeben.
    Beispiel: Nach Bauer f2–f4 wird in der FEN in der 4. Gruppe „f3“ angegeben.

5)  In der fünften Gruppe wird die Anzahl der Halbzüge seit dem letzten Bauernzug oder Schlagen einer Figur angegeben. 
    Dieser Wert dient zur Überwachung der 50-Züge-Remisregel.  
    Wenn einer der beiden Spieler nachweist, dass in den letzten 50 aufeinanderfolgenden Zügen eines Spielers,
    das heißt 100 Halbzügen, weder ein Stein geschlagen noch ein Bauer gezogen wurde,
    
    Wenn keiner der Spieler ein Remis gemäß der 50-Züge-Regel verlangt, kann das Spiel fortgesetzt werden
    (Aber im Jahr 2014 führten die FIDE-Regeln jedoch die 75-Züge-Regel ein (Absatz 9.6.2), 
    nach der danach 75 aufeinanderfolgende Züge ohne Schlagen und Bauernzüge, 
    das Spiel wird automatisch als unentschieden erklärt, es sei denn, 
    der letzte Zug war schachmatt – somit ist das Endlosspiel nun gänzlich ausgeschlossen).

6)  In der sechsten Gruppe wird die Nummer des nächsten Zuges angegeben. In der Ausgangsstellung ist der Wert 1. 
    Nach jedem Zug von Schwarz wird er um 1 erhöht. Damit gibt man die Zahl der zuvor gespielten Züge an, damit die Folgezüge in der Notation richtig nummeriert werden können.


Quelle = https://de.wikipedia.org/wiki/Forsyth-Edwards-Notation

Noch ein Beispiel:
rnbq1bnr/pppkpppp/8/3p4/4P3/5N2/PPPP1PPP/RNBQKB1R