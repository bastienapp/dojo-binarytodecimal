# Binary to Decimal

Ecrire une méthode qui converti un nombre binaire (contenu dans une chaine de caractères) en décimal.

Exemples :

	   "0"	0
	   "1"	1	(2 puissance 0)
	  "10"	2	(2 puissance 1)
	  "11"	3	(2 + 1)
	 "100"	4	(2 puissance 2)
	 "101"	5	(4 + 1)
	 "110"	6	(4 + 2)
	 "111"	7	(4 + 2 + 1)
	"1000"	8	(2 puissance 3)
	"1001"	9	(8 + 1)

Rappel des commandes junit :

    javac -cp .:junit-4.12.jar BinaryToDecimalTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore BinaryToDecimalTest
