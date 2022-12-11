# Wzorzec MVC - Model View Controller (Model Widok Kontroler)

Ten wzorzec nie znajduje się w książce `Wzorce Projektowe` Gang of Four, ale jest bardzo często
stosowany w projektach z graficznym interfejsem użytkownika. *Graficzny interfejs użytkownika
* to nic innego, jak wszystko to, co widzisz w programie - przyciski, kolory, coś się wyświetla
  , coś możesz kliknąć.<br/>
  `MVC` to wzorzec architektoniczny - pomaga porozdzielać odpowiedzialności klas w przypadku
  projektu z GUI (graficznym interfejsem użytownika).<br/>
  Niektórzy patrzą na `MVC` jako zbiór kilku podstawowych wzorców - Strategii, Kompozytu
  , Obserwatora. Inni rozszerzają tą listę jeszcze bardziej. <Br/>
  W tym przykładzie jednak jest to bardzo uproszczone.

# Jaki problem rozwiązuje?
W aplikacjach z GUI pomaga podzielić system na części:
* część Widoku - czyli wszystko to, co widzi użytkownik, w co może kliknąć...
* część Kontrolerów - czyli to, co przyjmie zachowania użytkownika i co umie wyzwolić inną akcj
  ę po wciśnięciu przycisku przez użytkownika
* część Modelu - czyli punkt główny programu, odzwierciedlenie całości problemu w kodzie. Model
  może zmieniać swój stan (i ta zmiana może być potem odwzorowana w widoku). Modelu nie "wida
  ć".

`MVC` można porównać do działania człowieka: `View` to nasza skóra (tylko to widzimy
), `Controller` to mięśnie (mięśnie pod wpływem dotknięcia gorącej kuchenki przez skórę si
ę kurczą), a `Model` to mózg, który wszystkim zawiadamia. Jeśli się poparzymy, mózg będzie mia
ł zmieniony stan (uszkodzenie części systemu) i również i widok się zmieni (skóra zaczerwieni).

# Wykres i ogólna zasada działania
Ogólna zasada brzmi tak: użytkownik widzi widok. Jedno akcje odbierane są przez kontroler
. Kontroler zleca zmianę stanu modelowi. Model informuje widok, że zmienił się mu stan, a widok
się odświeża.
![Alt text](pictures/MVC-ogolne.jpg?raw=true "Ogólna zasada?")



 <br/>

# Przykład z kodu
Przykład zawarty w pakiecie `mvc` przedstawiaj bardzo prostą aplikację pokazującą Słońce i jego
moc grzewczą, ustawianą przez użytkownika aż do podania przez niego wartości mniejszej od 0.<br/>
Jest to oparte na trzech klasach, tak aby w prosty sposob pokazać MVC:
* `WeatherController` - kontroler, który wie, co ma zrobić, gdy użytkownik poda liczbę. Posiada
  jako pole `WeatherModel` i zmienia mu stan (moc grzewczą), gdy zachodzi potrzeba
* `WeatherModel` - tak na prawdę to nasze Słońce. Posiada moc grzewczą oraz możliwo
  ść informowania obserwujących go klas o zmianie w swoim stanie (czyli informuje `WeatherView` w
  metodzie `notifyObservers`)
* `WeatherView` - klasa, która wyświetla Słońce z jego mocą grzewczą podaną prez użytkownika
  . Posiada jako pole `WeatherController` - i używa jej, gdy czas dla użytkownika podać liczb
  ę, oraz `WeatherModel` - bo to z niego wyciąga stan (moc grzewczą).

![Alt text](../../../../../../pictures/mvc-diagram.png?raw=true "Jak wyglądają klasy?")
<br/>

A tak wygląda działania MVC w przykładzie:

![Alt text](../../../../../../pictures/mvc-example.png?raw=true "MVC w praktyce")
 