
set PATH="C:\Program Files\Java\jdk1.8.0_172\bin";%PATH%

cd src

javac.exe -cp ..\lib\itextpdf-5.1.2.jar;..\lib\itext-xtra-5.1.2.jar itext/*.java

rem jar -cfm HolaMon.jar MANIFEST.MF .
pause

