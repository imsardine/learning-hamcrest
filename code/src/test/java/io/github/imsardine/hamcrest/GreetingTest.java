package io.github.imsardine.hamcrest;

import static org.junit.Assert.assertThat;
//import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class GreetingTest {

    @Test
    public void helloWorld() {
        // assert Greeting.hello("World") == "Hello, World!";
        assertThat(Greeting.hello("World"), equalTo("Hello, World"));
    }

}
