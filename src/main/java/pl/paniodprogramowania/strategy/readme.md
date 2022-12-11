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




 