package pl.paniodprogramowania.builder.patient.pdf.head;

public class Head {
  private int length;
  private Shampoo shampoo;
  private String colour;
  private double thickness;

  private Head(HeadBuilder headBuilder) {
    this.length = headBuilder.length;
    this.shampoo = headBuilder.shampoo;
    this.colour = headBuilder.colour;
    this.thickness = headBuilder.thickness;
  }

  public static class HeadBuilder {
    private int length;
    private Shampoo shampoo;
    private String colour;
    private double thickness;

    public HeadBuilder withLength(int length) {
      this.length = length;
      return this;
    }

    public HeadBuilder withShampoo(Shampoo shampoo) {
      this.shampoo = shampoo;
      return this;
    }

    public HeadBuilder withColour(String colour) {
      this.colour = colour;
      return this;
    }

    public HeadBuilder withThickness(double thickness) {
      this.thickness = thickness;
      return this;
    }

    public Head build(){
      return new Head(this);
    }
  }
}
