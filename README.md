# Hello AspectJ!
This code is slightly modified from a tutorial at [Java World](http://www.javaworld.com/article/2074048/core-java/i-want-my-aop---part-2.html). 
However, the tutorial does not show how to compile and run the app. 

You should have [AspectJ](https://eclipse.org/aspectj/) and [Java](http://www.oracle.com/technetwork/java/javase/downloads/index.html) installed. If you don't, then go do that. I'll wait. ... 
I also recommend installing the AJDT plugin for Eclipse if you are using Eclipse. For those of using Eclipse Luna, we have to get it from [ftp://ftp.acc.umu.se/mirror/eclipse.org/tools/ajdt/44/dev/update/](ftp://ftp.acc.umu.se/mirror/eclipse.org/tools/ajdt/44/dev/update/).

## Compile and Run
* Eclipse: hit "Run" from the HelloWorld class. ... That should work if AJDT is installed.
* Command Line: 
  * Compile the app without tracing:
    1.  `mkdir classes`
    2. `javac -d classes src\HelloAspectJ\HelloWorld.java`
    3. `jar cfm app.jar META-INF\MANIFEST.MF -C classes .`
  * Compile the trace library: ```ajc src\HelloAspectJ\HelloWorld.java \src\HelloAspectJ\MannersAspect.aj -outjar tracelib.jar```
  * Compile the app with tracing:
    * ```ajc -inpath app.jar -aspectpath tracelib.jar -outjar tracedapp.jar```
  * Run the app:
    * Without tracing: `java -cp app.jar HelloAspectJ.HelloWorld`
    * With Tracing: ```java -cp "C:\aspectj1.8\lib\aspectjrt.jar;tracedapp.jar;tracelib.jar" HelloAspectJ.HelloWorld``` 
