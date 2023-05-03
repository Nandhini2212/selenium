import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	int x=2;
	int y=3;
	int z=10;
  @Test(priority=4)
  public void add() {
	  Assert.assertEquals(x+y, 5);
  }
  @Test(priority=3)
public void subtract() {
	  Assert.assertEquals(x-y, -1);
  }
  @Test(priority=2)
public void multiply() {
	  Assert.assertEquals(x*y, 6);
}
  @Test(priority=1)
public void divide() {
	  Assert.assertEquals(z/x, 5);
}
}
