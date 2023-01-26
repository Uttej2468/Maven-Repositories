package ToolsQA;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import org.junit.Test;

public class TestAdd {
TestAdd()
{
	System.out.println("From Constuctor");
}

@BeforeEach
void testBeforeEach(){
	System.out.println("From Before Each");
}

@AfterEach
void testAfterEach(){
	System.out.println("From After Each");
}

@Test
@DisplayName("First Test class")
void testaddition()
{
	Addition a=new Addition();
	System.out.println("In Test Addition");
	assertEquals(30,a.addition(10,20));

}
@Test
@DisplayName("Second Test class")

void testaddi()
{
	Addition a=new Addition();
	System.out.println("In Test Addition");
	assertEquals(3,a.addition(10,20));

}

}
