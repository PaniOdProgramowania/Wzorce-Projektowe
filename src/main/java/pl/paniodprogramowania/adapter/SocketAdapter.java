package pl.paniodprogramowania.adapter;

public class SocketAdapter implements Charger {
  private Socket socket;

  public SocketAdapter(Socket socket) {
    this.socket = socket;
  }

  @Override
  public double give19V() {
    return socket.give220V() / 11.5;
  }
}
