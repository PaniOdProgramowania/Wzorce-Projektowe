package pl.paniodprogramowania.strategy.challange.radiostation;

import java.util.List;

public class Runner {
  public static void main(String[] args) {
    Song dancingQueen = new PopSong();
    Song weWillRockYou = new RockSong();
    Song myHeartWillGoOn = new FilmMusicSong();

    Radio radio = new Radio(List.of(dancingQueen, weWillRockYou, myHeartWillGoOn));
    radio.playMusic();
  }
}
