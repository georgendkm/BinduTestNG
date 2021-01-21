set projectLocation=C:\Users\binds\eclipse-workspace\SeleniumPom
cd %projectLocation%
set classpath=%projectLocation%\lib\*;%projectLocation%\bin;
java org.testng.TestNG %projectLocation%\testng.xml
pause