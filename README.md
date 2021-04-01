# Design_Patterns-Banking_App

## UML

![Design Patterns - Banking App UML](BankingApp-DP-UML.png)

## Design Patterns

The Following patterns were implemented into this application:

- Factory Design Pattern
- Decorator Design Pattern
- Strategy Design Pattern
- Observer Design Pattern



**The Factory Design** was used to make the different types of Accounts. All accounts, in theory are the same, but a young child might not have an email address a cell phone. SO in this application it was used to make the various accounts with the same methods, but have different implementations.

**Decorator Pattern** was used  for decorating the account with the different types of insurance.

**Strategy Design Pattern** was used for the payment. It was use to implement the Card and Bitcoin payments.

**Observer Design Pattern** was used to observe if the user has opened his messages. Essentially, it is used to know if the messages have been read/opened.