###                             Introduction to DispatcherServlet

#### 0: Front Controller Pattern
       Use a Front Controller as the initial point of contact for handling all related requests. The Front Controller centralizes control logic that might otherwise be duplicated, and manages the key request handling activities.

       Class Diagram:
       ![image](img/FCMainClass.gif)
       
       Sequence Diagram:
       ![image](img/FCMainSeq.gif)
       
       
       
#### 1: Introduction
Spring MVC, like many other web frameworks, is designed around the front controller pattern where a central Servlet, the DispatcherServlet, provides a shared algorithm for request processing while actual work is performed by configurable, delegate components. This model is flexible and supports diverse workflows.
