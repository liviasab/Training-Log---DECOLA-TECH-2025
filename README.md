# Training Log Decola Tech 2025
Java RESTful API created to record bodybuilding workouts.

## Class Diagram

``` mermaid
classDiagram
  class User {
    -String name
    -String email
    -Workout[] workouts
  }

  class Workout {
    -Date date
    -Exercise[] exercises
  }

  class Exercise {
    -String name
    -Number sets
    -Number reps
    -Number weight
  }

  User "1" *-- "N" Workout
  Workout "1" *-- "N" Exercise

```
