# formation-selenium
## Projet qui intègre LOG4J, Allure Report, Arret de test automatics avec JUnit Pionner, JUnit Test Suites et Parallel Testing 

### Allure Report
Consulter https://github.com/allure-framework  
Pour plus de détails
### Pour Log4J voir les ressources suivantes
Pour savoir comment configurer les fichiers de log4j  
https://sematext.com/blog/log4j2-tutorial/#log4j-2-configuration  
Pour savoir comment utiliser les appenders pour garder des logs dans des fichiers:  
https://logging.apache.org/log4j/2.x/manual/appenders.html#FileAppender

### JUnit test suite
Voir les implémentations au niveau du fichier POM.  
Par la suite utiliser le tag @Suite et @SelectClasses

### Parallel Testing
Pour savoir comment implémenter le parallel testing en détail le code est déjà dans le projet.  
Pour explications plus détaillés voir : https://www.swtestacademy.com/junit5-parallel-test-execution/  
Pas obligé d'implémeter le POM de ce tutoriel

### Arrêt de test automatiquement après premier échec
Pour être en mesure de faire arrêter les tests après le premier échec avec JUNIT, cette librairie facilite le tout.  
#### @DisableIfTestFails  
https://mvnrepository.com/artifact/org.junit-pioneer/junit-pioneer/2.0.1  
https://junit-pioneer.org/docs/disable-if-test-fails/  
