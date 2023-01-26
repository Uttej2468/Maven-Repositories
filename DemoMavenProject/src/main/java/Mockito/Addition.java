package Mockito;

public class Addition {
AdditionService service;
public Addition(AdditionService service)
{
	this.service = service;
}
public int addition(int num1,int num2) {
	System.out.println("In Addition");
	return service.addition(num1, num2);
}
}
