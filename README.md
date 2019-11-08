QUESTION 1:
Write a program to demonstrate the knowledge of students in basic Java concepts. Eg., Write a program to read the First name and Last name of a person, his weight and height using command line arguments. Calculate the BMI Index which is defined as the individual's body mass divided by the square of their height.

QUESTION 2:
Write a program to demonstrate the knowledge of students in multidimensional arrays and looping constructs. Eg., If there are 4 batches in BTech(IT) learning ‘ITE2005’ course, read the count of the slow learners (who have scored <25) in each batch. Tutors should be assigned in the ratio of 1:4 (For every 4 slow learners, there should be one tutor). Determine the number of tutors for each batch. Create a 2-D jagged array with 4 rows to store the count of slow learners in the 4 batches. The number of columns in each row should be equal to the number of groups formed for that particular batch ( Eg., If there are 23 slow learners in a batch, then there should be 6 tutors and in the jagged array, the corresponding row should store 4, 4, 4, 4, 4,3). Use for-each loop to traverse the array and print the details. Also print the number of batches in which all tutors have exactly 4 students.

QUESTION 3: 
Write a program to demonstrate the knowledge of students in String handling. Eg., Write a program to read a chemical equation and find out the count of the reactants and the products. Also display the count of the number of molecules of each reactant and product.
Eg., For the equation, 2NaOH + H2SO4 -> Na2SO4+ 2H2O, the O/P should be as follows.
Reactants are 2 moles of NaOH, 1 mole of H2SO4.
Products are 1 mole of Na2SO4 and 2 moles of H2O.

QUESTION 4: 
Write a program to demonstrate the knowledge of students in advanced concepts of Java string handling. Eg., (Bioinformatics: finding genes) Biologists use a sequence of letters A, C, T, and G to
model a genome. A gene is a substring of a genome that starts after a triplet ATG and ends before a triplet TAG, TAA, or TGA. Furthermore, the length of a gene string is a multiple of 3
and the gene does not contain any of the triplets ATG, TAG, TAA, and TGA. Write a program that prompts the user to enter a genome and displays all genes in the genome. If no gene is found in the input sequence, displays no gene. Here are the sample runs:
Enter a genome string: TTATGTTTTAAGGATGGGGCGTTAGTT
O/P: TTT
GGGCGT 

QUESTION 5: 
Write a program to demonstrate the knowledge of students in working with classes and objects. Eg.,Create a class Film with string objects which stores name, language and lead_actor and category (action/drama/fiction/comedy). Also include an integer data member that stores the duration of the film. Include parameterized constructor, default constructor and accessory functions to film class. Flim objects can be initialized either using a constructor or accessor functions. Create a class FilmMain that includes a main function. In the main function create a vector object that stores the information about the film as objects. Use the suitable methods of vector class to iterate the vector object to display the following
• The English film(s) that has Arnold as its lead actor and that runs for shortest duration.
• The Tamil film(s) with Rajini as lead actor.
• All the comedy movies.

QUESTION 6:
Write a program to demonstrate the knowledge of students in creation of abstract classes and working with abstract methods.
Eg., Define an abstract class ‘Themepark’ and inherit 2 classes ‘Queensland’ and ‘Wonderla’ from the abstract class. In both the theme parks, the entrance fee for adults is Rs. 500 and for children it is Rs. 300. If a family buys ‘n’ adult tickets and ‘m’ children tickets, define a method in the abstract class to calculate the total cost. Also, declare an abstract method
playGame() which must be redefined in the subclasses. In Queensland, there are a total of 30 games. Hence create a Boolean array named ‘Games’ of size 30 which initially stores false values for all the elements. If the player enters any game code that has already been played, a warning message should be displayed and the user should be asked for another choice. In Wonderla, there are a total of 40 different games. Thus create an integer array with 40 elements. Here, the games can be replayed, until the user wants to quit. Finally display the total count of games that were repeated and count of the games which were not played at all.

QUESTION 7: 
Write a program to demonstrate the knowledge of students in Java Exception handling. Eg., Read the Register Number and Mobile Number of a student. If the Register Number does not contain exactly 9 characters or if the Mobile Number does not contain exactly 10 characters, throw an IllegalArgumentException. If the Mobile Number contains any character other than a digit, raise a NumberFormatException. If the Register Number contains any character other than digits and alphabets, throw a NoSuchElementException. If they are valid, print the message ‘valid’ else ‘invalid’

QUESTION 8:
Write a program to demonstrate the knowledge of students in working with user-defined packages and sub-packages. Eg., Within the package named ‘primespackage’, define a class Primes which includes a method checkForPrime() for checking if the given number is prime or not. Define another class named TwinPrimes outside of this package which will display all the pairs of prime numbers whose difference is 2. (Eg, within the range 1 to 10, all possible twin prime numbers are (3,5), (5,7)). The TwinPrimes class should make use of the checkForPrime() method in the Primes class.

QUESTION 9:
Write a program to demonstrate the knowledge of students in File handling. Eg., Define a class ‘Donor’ to store the below mentioned details of a blood donor. Name, age, Address, Contactnumber, bloodgroup, date of last donation Create ‘n’ objects of this class for all the regular donors at Vellore. Write these objects to a file. Read these objects from the file and display only those donors’ details whose blood group is ‘A+ve’ and had not donated for the recent six months.

QUESTION 10:
Write a program to demonstrate the knowledge of students in multithreading. Eg., Three students A, B and C of B.Tech-IT II year contest for the PR election. With the total strength of 240 students in II year, simulate the vote casting by generating 240 random numbers (1 for student A, 2 for B and 3 for C) and store them in an array. Create four threads to equally share the task of counting the number of votes cast for all the three candidates. Use synchronized method or synchronized block to update the three count variables. The main thread should receive the final vote count for all three contestants and hence decide the PR based on the values received.
