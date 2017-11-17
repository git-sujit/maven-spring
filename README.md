# Spring Framework is good for(Manages Lifecycle of Object)
	- Dependency Injection or Dependency Inversion
	- Leverages polymorphism to create object at run time
	- Spring is container of beans similar to Tomcat as Servlet container
	- Tomcat: Reads web.xml and finds servlet and create servlets
	- Spring: reads beans and creates objects. Handles creation, lifecycle and destruction of objects
	- Advantage of having objects in Spring Container:
		- Instead of writing new object Spring uses Factory pattern to create object
		- ObjectFactory reads configuration to create all the objects
		- Spring had Bean Factory which reads Spring XML. Now Spring has handle to newly created bean and manages lifecycle
		- Structure:: Object(Main method) --> Bean Factory --> Spring XML
# Bean Factory Vs ApplicationContext
	- Application Context does everything that BeanFactory does plus it has other functionality like AOP
	- Performance for both are almost same 
	- Better to use ApplicationContext until unless resources are very important then use BeanFactory
# Two ways to set values in Object created by BeanFactory/ApplicationContext
	1. Through Setters: Define setters/gettes in Java Bean && <property name="customerId" value="id-1" /> in beans.xml
	2. Through Constructors: Define contructor in Java Bean && <constructor-arg value="Sunnyvale" />
	- Spring does data type conversion intelligently, so in config xml it understans to match to String/int etc

	
#JUNIT: @Test Vs extends TestCase
	- JUnit3 style: extends Test
		Create a class that extends TestCase, and start test methods with the word test. When running the class as a JUnit Test (in Eclipse), all methods starting with the word test are automatically run
	- JUnit4 style: @Test annotation
		create a 'normal' class and prepend a @Test annotation to the method. Note that you do NOT have to start the method with the word test
	- Prefered approach: @Test annotation
		