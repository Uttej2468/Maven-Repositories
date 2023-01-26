package ToolsQA;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import Mockito.Addition;
import Mockito.AdditionService;
@ExtendWith(MockitoExtension.class)
public class TestAddition {

	@Mock
	private AdditionService s;
	
	@Test
	public void testAddition()
	{
		AdditionService service = mock(AdditionService.class);
		Addition obj = new Addition(service);
		when(service.addition(100, 200)).thenReturn(300);
		assertEquals(300,obj.addition(100, 200));
	}

}
