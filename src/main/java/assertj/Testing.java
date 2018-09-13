package assertj;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Testing {

	String abc = "abc";
	
	@Test
	public void stringIsEmpty() throws Exception{
			assertThat(abc.isEmpty()).isFalse();
	}
	
	@Test
	public void abcIsEqualtoabc() throws Exception{
		assertThat(abc).isEqualToIgnoringCase("abc");
}

}
