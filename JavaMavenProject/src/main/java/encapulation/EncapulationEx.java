package encapulation;

public class EncapulationEx {
private int age;
private String name;
public void setter(String name,int age)
{
	this .name=name;
	this.age=age;
}
public void getter()
{ System.out.println(" Name"+name);
System.out.println("Age"+age);
}
}
