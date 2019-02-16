
ABL-Assignment
====================

## Report

We have three agents: StarterAgent, IntermediateAgent, and AdvancedAgent.
Please specify the agent used in GameEngine.


Starter Tasks
--------------------
* Add a move action that takes a (int xdir, int ydir, int id) as input.
* Make a MoveTo behavior that moves a bot to a target location over time.
* Add a SetColor action that takes (int r, int b, int g, int id).
* Add color sensing to the BotWME (this includes changes to BotSensor.java and BotWME.java).

**Color is changed when the bot is at the position of the player.**


Intermediate Tasks
--------------------
* Add on action that creates a new Bot
* Create 4 bots and have them keep a formation around the player.

**See IntermediateAgent.**

Advanced Tasks
--------------------
**Agent behavior Description**

In the Advanced task, we create (1 + 10)=**11** Bots at the very beginning ( who's initial position is based on the player position at that moment ).
The player can use "Space" to shoot, and when a bullet hit the Bot, it will die (disappear).
We are trying to make such a scene: "An soldier arrived at an unfamiliar village".

Those Bots will started to act 5 seconds after the ABL launched, and their behavior is controlled by the FormWME, which contains 2 variables :
**BotNum**: record the number of remained Bots;
**Friend**: the relationship between Bots & Player.
Both of them are updated every 5 seconds.

At first, those Bots well come and stand in a line beside the player as welcome.
If the player show friendly to them (don't kill), the "Friend" variable will increase as time goes. When it grows to a specific value ( about 1 min later ), the bots will surround the player to show their respect.

But if the player keep killing, the bots will runaway, and even try to fight back (though their bullet can not hurt the player). If the player kill them in a low speed ( or wait for some time after killing bots (25 sec per bot) ), they will only runaway but not shoot at player.

And things changes when bot number decreased: When only last 1 bot, it will stop trying to defeat the player, and depend on "Friend" value, it will suicide or runaway. When the "Friend" is high enough, it will even come close to the player to "beg for living".

