# Wzorzec Projektowy Budowniczy - przykład Pacjenta

Jest to implementacja wzorca Budowniczego z Wyzwania Projektowego odbywającego się w lutym 2021
.<br/>
Kod dla Budowniczego znajduje się w pakiecie `builder`.<br/>

## Jaki problem rozwiązuje Budowniczy?
Jak stworzyć obiekt, który składa się z dużej ilości pól.<br/>
Oczywiście, możnaby stworzyć jeden wielki konstruktor, jednak programista szybko by się pogubi
ł, który parametr w konstrkutorze to które pole.<br/>
Inną opcją byłoby wywoływanie setterów dla pól... i poniekąd czymś podobnym jest właśnie
Budowniczy.<br/>
<br/>
Całość opiera się na stworzeniu nowej statycznej klasy, która będzie budować klasę Pacjenta. <br/>
W naszym przykładzie Pacjent potrzebuje aż siedmiu danych i chcemy uniknąć robienia siedmio
-parametrowego konstruktora.<br/>
W `Pacjencie` konstruktor musi byc prywatny - nie chcemy umożliwiać korzystania z niego innym <br/>
oraz powinien przyjmować jako parametr `PacjentBuilder`. I brać po kolei z niego pola i ustawia
ć ich wartość swoim polom.
W nowej statycznej klasie trzeba skopiować wszystkie pola z Pacjenta oraz<br/>
dodać dla każdego pola metody ustawiające pole w Builderze i zwracające obiekt budujący.<br/>
Oraz specjalną metodę `build()`, która ostatecznie wywoła prywatny konstruktor `Pacjenta` i jako
parametr przekaże siebie (this).

## Jak wygląda Budowniczy tutaj?
Całość jest do zobaczenia tutaj:
![Alt text](../../../../../../../pictures/Builder.png?raw=true "Gdzie Budowniczy?")
  