package pl.paniodprogramowania.strategy.students;

public class TestNode{
  private static int i = 0;
  private int iindex;
  private int val;

  public TestNode(int val) {
    this.val = val;
    this.iindex = i;
    i = i + 1;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TestNode testNode = (TestNode) o;
    return val == testNode.val;
  }

  @Override
  public int hashCode() {
    int hashcode =  (iindex == 1 || iindex == 2 ? 1 : iindex);
    return hashcode;
  }

  @Override
  public String toString() {
    return "TestNode{" +
        "val=" + val +
        '}';
  }
}