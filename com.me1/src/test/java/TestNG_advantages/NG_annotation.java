package TestNG_advantages;

import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class NG_annotation {
@Test (alwaysRun = true)
public void test1() {
	System.out.println("test1");
}
@Test (priority = 1)
public void test2() {
	System.out.println("test2");
}
@Test (dependsOnMethods = "test2")
public void test3() {
	System.out.println("test3");
}
}
