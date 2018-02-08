###                             Introduction to DispatcherServlet

#### 1: Front Controller Pattern
Use a Front Controller as the initial point of contact for handling all related requests. The Front Controller centralizes control logic that might otherwise be duplicated, and manages the key request handling activities.

Class Diagram:
![image](img/FCMainClass.gif)
       
Sequence Diagram:
![image](img/FCMainSeq.gif)
       
#### 2: Introduction
Spring MVC, like many other web frameworks, is designed around the front controller pattern where a central Servlet, the DispatcherServlet, provides a shared algorithm for request processing while actual work is performed by configurable, delegate components. This model is flexible and supports diverse workflows.

The DispatcherServlet, as any Servlet, needs to be declared and mapped according to the Servlet specification using Java configuration or in web.xml. In turn the DispatcherServlet uses Spring configuration to discover the delegate components it needs for request mapping, view resolution, exception handling, and more.

    public class MyWebApplicationInitializer implements WebApplicationInitializer {
         @Override
         public void onStartup(ServletContext servletCxt) {
             // Load Spring web application configuration
             AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
             ac.register(ApplicationConfig.class);
             ac.refresh();
     
             // Create and register the DispatcherServlet
             DispatcherServlet dispatcherServlet = new DispatcherServlet(ac);
             ServletRegistration.Dynamic registration = servletCxt.addServlet("dispatcherServlet", dispatcherServlet);
             registration.setLoadOnStartup(1);
             registration.addMapping("/");
         }
    }

