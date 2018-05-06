package devops;
import org.junit.*;

public class FizzBuzzTests {
	private FizzBuzz fizzBuzz;
	
	@Before
	public void setup(){
		fizzBuzz=new FizzBuzz();
	}
	
	@Test
	public void numberOutOfRangeReturnsError(){
		Assert.assertEquals("Error","Number out of Range",fizzBuzz.convert(-1));		
	}
	
	@Test
	public void numberGreaterThanNineHundredNinetyNineReturnsError(){
		Assert.assertEquals("Error greater than 999","Number out of Range",fizzBuzz.convert(1000));		
	}
	
	@Test
	public void test1(){
		int input=1;
		String output=fizzBuzz.convert(input);
		Assert.assertEquals("one", output);
	}
	@Test
	public void test20(){
		int input=20;
		String output=fizzBuzz.convert(input);
		Assert.assertEquals("twenty", output);
	}
	@Test
	public void test99(){
		int input=99;
		String output=fizzBuzz.convert(input);
		Assert.assertEquals("ninety nine", output);
	}
	@Test
	public void test256(){
		int input=256;
		String output=fizzBuzz.convert(input);
		Assert.assertEquals("two Hundred and fifty six", output);
	}
	

}
