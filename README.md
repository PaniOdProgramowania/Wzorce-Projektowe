# Wzorzec Projektowy Strategia - przykład Kuchcika

Jest to implementacja przykładu z Wyzwania Projektowego odbywającego się w lutym 2021.<br/>
Kod dla Strategii znajduje się w pakiecie `strategy`.<br/>

## Jaki problem rozwiązuje Strategia?
Jak skoponować klasy, gdy jest więcej niż jeden sposó zrobienia czegoś. <br/>
Na przykład - jest więcej niż jeden sposób wyrabiania ciasta (mikserem lub recznie)<br/>
i kucharz może skorzystać z obu. Strategia doradza, jakie klasy utworzyć i jak je ze sobą połączy
ć.<br/>
Całość opiera się na interfejsie `SposóbWyrabiania` oraz jego dwóch implementacjach (ręcznym lub
 mikserem).<br/>
 Kuchcik ma w sobie pole sposobu wyrabiania i może wyrabiać ciasto używając metody z tego pola
 , korzystając z polimorfizmu.

## Jak wygląda Strategia tutaj?
Całość jest do zobaczenia tutaj:
![Alt text](pictures/KuchcikStrategia.jpg?raw=true "Gdzie Strategia?")

Jednak tutaj wszystkie klasy są nazwane po angielsku: <br/>
1. `Kuchcik` w projekcie nazywa się `Cook`
2. `SposóbWyrabiania` - `DoughKneadWay`
3. `RęczneWyrabianie` - `ManualKneadWay`
4. `WyrabianieMikserem` - `AutomatedKneadWay`
5. `Ciasto` - `Dough` <br/>
<br/>
`Runner` to `Runner` i w nim jest zawarta metoda `main`.<br/>
Tutaj jeszcze są zapisane wyjątki oraz testy. 

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
  ![Alt text](pictures/Builder.jpg?raw=true "Gdzie Budowniczy?")