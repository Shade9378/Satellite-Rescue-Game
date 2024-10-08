# Satellite Rescue Game

## <ins>DESCRIPTION:</ins>
The game requires a space shuttle to launch a fuel cell, which will dock with an orbiting space station. Due to a low fuel supply, the space station has entered a state of unplanned orbital descent and will eventually crash to the earth, if it does not receive a new supply of fuel soon.

### Prototype specification: 
- Choosing level of difficulty: The game will provide an option for user selection of a level of difficulty, beginner (B), intermediate (I), or advanced (A). The level determines the speed at which the space station is orbiting.

- The Space Station: The space station is a Diamond object. It has a fueling port, namely the lowest vertex of the diamond. Space station movement begins at a random horizontal location and a vertical location of 0. To simulate orbiting, the space station will move left-to-right on a downward sloping line across the window, disappearing on the right side of the window and reappearing on the left side. Each new orbit will begin at a slightly lower level that the previous orbit. The color of the space station changes from green to yellow after one orbit, indicating a low fuel supply. After two orbits it turns to red, and stays red until it is refueled or crashes.

- The Space Shuttle: The space shuttle is a Triangle object, located in the middle of the left side of the window with its base always on the left window boundary and its nose pointing to the right.

  The position of the shuttle can be adjusted slightly up or down each time the 'J' or the 'K' key on the keyboard is pressed. 'J' will cause the shuttle to move up, and the 'K' key will move the shuttle down. Up and down distance movements will be the same for each key press.

  Pressing the space bar will launch a fuel cell, a blue ball (Circle object), from the space shuttle. The shuttle generates a new fuel cell each time the space bar is pressed. However, only one fuel cell can be moving toward the space station at a time. That is, pressing the space bar when a fuel cell is in motion does not cause a new fuel cell to be launched. The     fuel cell will appear at the nose of the shuttle and travel at a reasonable rate of speed from the shuttle to the right side of the window on the horizontal line passing through the shuttle's nose. The shuttle will be able to launch 5 fuel cells only and will keep track of how many fuel cells remain. After all 5 have been launched, the shuttle simply watches as the   space station continues its descent toward earth and eventually crashes by reaching the bottom of the window during one of its orbits. When the space station is refueled or crashes, the simulation ends. 

- The Fuel Cell: The fuel cell is a Circle object. It needs access to the space station's location to determine if it is close enough for a docking operation.

- The fueling process: If the fuel cell makes contact with the fuel port of the space station by being close enough to dock (some point on the fuel cell's perimeter that is very close to the lowest vertex of the space station), fueling will occur automatically. After a three second wait (for fueling to terminate), the fuel cell will become invisible. Then the shuttle will travel toward the space station on the same path as the fuel cell (a while loop), dock with the space station (its nose will touch the fuel port, as the fuel cell did), wait 3 seconds and then travel back (in reverse) to the left side of the window. The space station will turn green again, and, after another three second wait, the simulation ends. If the fuel cell misses the space station, it simply disappears, after reaching the right boundary of the window. 

- Starting and stopping the simulation: Pressing the 'S' key will start the simulation and pressing the 'X' key will stop it.

## <ins>USER INSTRUCTIONS:</ins>
!!! To run the game, you will need to have the Java Runtime Environment installed.
- Open Terminal
- Navigate to the directory where you saved the project source code using the “cd” command.
- Open the game using "java Driver" command.

