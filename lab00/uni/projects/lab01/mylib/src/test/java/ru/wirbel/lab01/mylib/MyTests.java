package ru.wirbel.lab01.mylib;

//import junit.framework.Test;
import java.lang.annotation.Annotation;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class MyTests 
    extends TestCase
{

   // Выполняется один раз до выполнения тест-методов, например, для соединения с БД, инициализации пула соединений
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - call method runOnceBeforeClass");
    }
 
    // Выполняется один раз уже после выполнения всех тест-методов, например, для закрытия соединения
    // и освобождения других ресурсов
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - call method runOnceAfterClass");
    }

    // Выполняется перед каждым тест-методом
    // Позволяет, например, создать новый экземпляр объекта, необходимого тест-методу
    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }

    // Выполняется после каждого тест-метода
    @After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }

	@Test
	public static void testaddmethod(){
		
		double a = getp1();
		double b = getp2();
		double theory = a+b;
		double fact = MathOperations.add(a,b);
		
		Assert.assertEquals(theory, fact);
	}
	@Test
	public static void testsubstractmethod(){
		
		double a = getp1();
		double b = getp2();
		double theory = a-b;
		double fact = MathOperations.substract(a,b);
		
		Assert.assertEquals(theory, fact);
	}
	@Test
	public static void testdividemethod(){
		
		double a = getp1();
		double b = getp2();
		double theory = a/b;
		double fact = MathOperations.divide(a,b);
		
		Assert.assertEquals(theory, fact);
	}
	@Test
	public static void testmultiplymethod(){
		
		double a = getp1();
		double b = getp2();
		double theory = a*b;
		double fact = MathOperations.divide(a,b);
		
		Assert.assertEquals(theory, fact);
	}
	//Get parameter 1
	public static double getp1(){
		return 5;
	}
	//Get parameter 2
	public static double getp2(){
		return 15;
	}
}
