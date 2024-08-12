## Overview
Simplified Monopoly is recreation of the Monopoly board game. In this version of monopoly, there are two players that are competing to own enough properties to make each other bankrupt. In this simplified version of monopoly, the game does not include:

* Community or chance cards
* Additional money passing start
* Property sets

This game does include:

* Dice rolling
* Purchasing properties/paying taxes
* Jail

## Usage
To begin the game of Monopoly, run the following after downloading the code:
    '''
    $ javac *.java
    $ java Monopoly playerOne playerTwo
    '''
where 'playerOne' and 'playerTwo' are the names of the pieces in the game.

Here's an example of the game after starting:
    '''
    playerOne rolled a 5!
    Oh no! You landed on Jail!
    playerOne your next turn will be skipped!

    playerTwo rolled a 3!
    You landed on St. Charles Place!
    This property cost: $40. You have $100.
    Do you want to buy this property? (Y/N)
    Y
    You now have: $60
    '''
The game will stop running once a player lands on an owned property and cannot pay the tax and the owner of the property will be declared the winner.

## Prompt
- Our project was making a monopoly game within the terminal. We were able to implement a graph within our project that represents a Monopoly board and be able to have pieces go around and interact with the properties.
- The usage of inhertiance in our project allowed for creating various properties with unique aspects. For example, creating many regular properties that a player could purchase or get taxed from. Creating a jail property that makes a player stuck on that property for the next turn.
- The graph implementation is best to use in our project because it enables us to linked all properties together and traverse properties effectively. We also implemented a Queue in our project to emulate taking turns. This is best used in our project because the utilization of FIFO allows players are able to take turns in order.
