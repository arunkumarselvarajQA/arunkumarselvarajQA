package BasicTestng;

import org.testng.annotations.Test;

public class TestngBasic {

	@Test(dependsOnGroups=("First class"))
public void a() {
		System.out.println("test1");
	
}
	@Test(dependsOnGroups=("First class"))
public void b() {
		System.out.println("test2");
}
	@Test(dependsOnGroups=("First class"))
public void c() {
		System.out.println("test3");
}
	@Test(dependsOnGroups=("First class"))
public void d() {
		System.out.println("test4");
}
	@Test(dependsOnGroups=("First class"))
public void e() {
		System.out.println("test5");
}
	@Test(dependsOnGroups=("First class"))
public void f() {
		System.out.println("test6");
}
}
