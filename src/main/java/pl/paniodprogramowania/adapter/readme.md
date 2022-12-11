# Wzorzec Projektowy Adapter - przykład Ladowarki

Jest to implementacja wzorca Adapter z Wyzwania Projektowego odbywającego się w lutym 2021
.<br/>
Kod dla Adaptera znajduje się w pakiecie `adapter`.<br/>

## Jaki problem rozwiązuje Adapter?
Adapter pomaga zaadaptować jedną klasę na potrzeby innej. <br/>
Przykładem, którym się tu posługuję, jest adaptacja prądu 220V na 19V. I tak, wiem, że w <br/>
rzeczywistości jest jeszcze kwestia prądu zmiennego i stałego, ale trochę <br/>
sobie uprośćmy - i ustalmy, że jest tylko adaptacja `220` na `19` :) <br/>
<br/>
Laptop potrzebuje zasilania `19V`, a w gniazdku elektrycznym w ścianie mamy `220V`. <br/>
*Co teraz?* <br/>
Całość rozwiązania tak na prawdę sprowadza się do podzielenia prądu `220V` (tego z gniazdka
elektrycznego) przez`11.5` tak, aby uzyskać prąd `19V` (tyle potrzeba laptopowi). <Br/>
Dzieje się to w klasie `SocketAdapter
` (jak sama nazwa wskazuje). <br/>
<br/>
Kod składa się z następujących klas:
* `Laptop` - klasa reprezentująca laptopa, który posiada w sobie pole klasy
* `Charger` - czyli ładowarki. Jest to interfejs z metodą `give19V`
* `Socket` - gniazdko elektryczne wraz z metodą `give220V` zwracającą prąd 220V
* `SocketAdapter` - nasz adapter prądu z gniazdka (posiadający takie pole) na prąd 19V
  <br/>
  <br/>
  Tak jak wspomniane w definicji wzorców, niezawsze wzorce to skomplikowany układ klas.<br/>
  Tak będąc całkiem przyziemnym, tutaj wzorcem jest raptem działanie matematyczne (dzielenie)<br/>
  i mądre ułożenie klas tak, aby można było użyć tego dzielenia w ogóle.


## Jak wygląda Adapter tutaj?
Całość jest do zobaczenia tutaj:
![Alt text](../../../../../../pictures/Adapter.png?raw=true "Gdzie Adapter?")
  