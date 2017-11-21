# Spring Framework 	(Manages Lifecycle of Object)
	- Dependency Injection or Dependency Inversion
	- Leverages polymorphism to create object at run time
	- Spring is container of beans similar to Tomcat as Servlet container
	- Tomcat: Reads web.xml and finds servlets and create servlets
	- Spring: reads beans.xml and creates objects. Handles creation, 
		life cycle and destruction of objects
	- Helps in creating more extensible and dynamic codes
	- Advantages of writing new object Spring uses Factory pattern to create object
		- ObjectFactory reads configuration to create all the objects
		- Spring had Bean Factory which reads Spring XML. Spring has handle to
			 newly created bean and manages life cycle
		- Structure:: Object(Main method) --> Bean Factory --> Spring XML
# Bean Factory Vs ApplicationContext
	- Application Context does everything that BeanFactory does 
		plus it has other functionality like AOP
	- Performance for both are almost same 
	- Better to use ApplicationContext. Until unless resources are very 
		scarce/important do not use BeanFactory
# Two ways to set values in Object created by BeanFactory/ApplicationContext
	1. Through Setters: Define setters/getters in Java Bean &&
		 <property name="customerId" value="id-1" /> in beans.xml
	2. Through Constructors: Define constructor in Java Bean &&
		 <constructor-arg value="Sunnyvale" />
	- Spring does data type conversion intelligently. Spring reads config xml 
		and it understans to match to String/int datatypes etc
# Inner Bean, Alias, IdRef
	- Inner Bean: Bean defined under another bean in case this bean is
		 used by only this bean
	- <alias> tag, to have another name for bean. 
	- Better to use Id and not name while creating bean because id is unique and 
		validated by Spring but name is not validated
# Collection support for collection
	- <list> tag ~ java.util.List
	- <set> tag  ~ java.util.Set
	- <map> tag  - java.util.Map
	- <props> tag~ java.util.Properties
# Autowire = byName, byType
	- To minimize bean configurations
	- not suggested for large number of beans
	- for large number of beans use explicit autowiring
# Bean Scope
	- In JVM there will be objects (managed by Spring + not managed by Spring)
	- Managed by Spring means, pass the bean id(getBean(id)) and Spring will
		 return object(Factory pattern)
	- Object makes reference to ApplicationContext, AppContext refers to Bean 
		Configuration XML to create object
	- Default behavior: without any call to bean, application context reads bean 
		config and creates the beans during app context is initialized
	- Create bean when called Vs Create bean when application context is initialized
	- Two bean scopes
		1. Singleton(Default): Only one instance is returned by Spring.
			One object per spring container, but inside one JVM we can run
				 multiple spring container
			So, there is difference in Singleton in Java Vs Singleton scope in Spring
		2. Prototype: New beans are created with each request 	
	- Web Aware Scopes
		- Goes well with Servlets
		- Request scope: New bean per request
		- Session scope: new session per request
# Inheritance, Lifecycle callbacks
	- inheritance is supported by Spring, define parent in bean config file
	- Lifecycle callbacks
		- implement InitializingBean interface: Gives hook after bean is initialized
		- implement DisposableBean interface: Gives hook just before bean is destroyed
		- We can define custom init and destroy methods and configure it in bean definition
		- If we do both(Implement interface & define init-method/destroy-method in bean defn) 
			then first callback method is invoked then custom method is invoked
		- global level init/destroy methods: define at beans/default-init-method & 
			default-destroy-method  
# BeanPostProcessor
	- Tells spring to do something after bean is initialized
	- A single method runs for all the beans, no matter how many types of bean we have
	- Bean Post Processor is a separate class which implements BeanPostProcessor
	- IN Bean config xml mention the bean post processor class
	- There are no common method for printing just before destroy
	- properties through PropertyPlaceholderConfigurer beanFactoryPostProcesseor class
		- Put properties in separate file
		- Mention PropertyPlaceholderConfigurer and location of prop file in beans config xml
# Annotation based container configuration
	- define component-scan in bean config xml
	- put @Component at class level and bean-id is class-name(Animal) having
		 lower-case first letter(animal)
	- @Component is stereotype. Other stereotypes are: @Service, @Repository, @Controller			
# Event Handling:
	- Three elements in general:
		1. Event Publisher: Entity which publishes the event
		2. Event Listener: Entity which listens to the event
		3. Entity itself
	- Custom class implements ApplicationListener<ApplicationEvent>
	- Custom class annotation: @Component
	- bean config xml: put component-scan
# AOP: Aspect Oriented Programming
	- cross cutting concerns like logging, traqnsaction, security etc
	- Think in terms of filters where filter is executed first before component runs
	- Define an Aspect Object separately and do aspect configuration
	- Without making any change to code we can control thru aspect configs
	- 

# JUNIT: @Test Vs extends TestCase
	- JUnit3 style: extends Test
		Create a class that extends TestCase, and start test methods with the word test. 	
		When running the class as a JUnit Test (in Eclipse), 
		all methods starting with the word test are automatically run
	- JUnit4 style: @Test annotation
		create a 'normal' class and prepend a @Test annotation to the method. 
		Note that you do NOT have to start the method with the word test
	- Preferred approach: @Test annotation
# Maven Surefire plugin
	- Surefire plugin is used during test phase of build lifecycle to execute 
		unit test case of an application 	
	
# manifest file
	- JAR files support a wide range of functionality, including electronic signing, 
		version control, package sealing, and others
	- What gives a JAR file this versatility? The answer is the JAR file's manifest.
	- All the entries are as name-value pairs.
	
	
	
	
	
		