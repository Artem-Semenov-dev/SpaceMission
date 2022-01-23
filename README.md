# SpaceMission
U-1
The U-1 Rocket is light weight, agile and pretty safe, but can only carry a total of 18 tonnes of cargo. 
It costs $100 Million to build and weighs 10 tonnes. It has a slim chance of crashing while landing 
but a bigger chance of exploding when launching, both chances depend on the amount of cargo carried in the rocket.

U-2
The U2 Rocket heavier than the U-1 but much safer and can carry a lot more cargo; 
to a total of 29 tonnes. However, it costs $120 Million to build and weighs 18 tonnes. 
It has a greater chance of crashing while landing than while launching, but just like the U-1 both chances depend on the amount of cargo carried.

The Mission
The mission consists of 2 phases:

Phase-1:
This phase is meant to send building equipment and construction material to help build the colony.
The text file contains the list of all items that we need to send called "Phase1.txt". Each line in the file contains the item name as well as its weight in Kgs.

Phase-2:
This phase is meant to send the colony of humans along with some food resources. The text file contains the list of all items that we need to send called "Phase2.txt". 
Each line in the file also contains the item name and its weight in Kgs.

We need to have the opportunity to test both rocket types for each phase separately.

Rocket Specifications
U-1
Rocket cost = $100 Million
Rocket weight = 10 Tonnes
Max weight (with cargo) = 18 Tonnes
Chance of launch explosion = 5% * (cargo carried / cargo limit)
Chance of landing crash = 1% * (cargo carried / cargo limit)
U-2
Rocket cost = $120 Million
Rocket weight = 18 Tonnes
Max weight (with cargo) = 29 Tonnes
Chance of launch explosion = 4% * (cargo carried / cargo limit)
Chance of landing crash = 8% * (cargo carried / cargo limit)
