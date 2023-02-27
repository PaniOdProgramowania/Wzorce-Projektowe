package pl.paniodprogramowania.strategy.challange.radiostation;

import java.util.List;

public class Radio {
  private final List<Song> songsInTheRadioStation;

  public Radio(List<Song> songsInTheRadioStation) {
    this.songsInTheRadioStation = songsInTheRadioStation;
  }

  public void playMusic(){
    for (Song song : songsInTheRadioStation) {
      System.out.println("Now playing...: " + song.kindOfMusic());
    }
  }
}
