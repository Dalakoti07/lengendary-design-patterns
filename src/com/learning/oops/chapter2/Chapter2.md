##Observer Pattern

We will be talking about loosely coupled thing and observer pattern

###The power of Loose Coupling
When two objects are loosely coupled, they can interact, but have very little knowledge of each other.
The Observer Pattern provides an object design where subjects and observers are loosely coupled.

####Why?
#####The only thing the subject knows about an observer is that it implements a certain interface (the Observer interface). 
It doesn’t need to know the concrete class of the observer, what it does, or anything else about it.



#####We can add new observers at any time. 
Because the only thing the subject depends on is a list of objects that implement the Observer interface, we can add new
observers whenever we want. In fact, we can replace any observer at runtime with another observer and the subject will keep purring along. Likewise, we can remove
observers at any time


#####We never need to modify the subject to add new types of observers. 
Let’s say we have a new concrete class come along that needs to be an observer. We don’t
need to make any changes to the subject to accommodate the new class type, all
we have to do is implement the Observer interface in the new class and register as an observer. The subject doesn’t care; it will deliver notifications to any object that
implements the Observer interface.

We can reuse subjects or observers independently of each other. If we
have another use for a subject or an observer, we can easily reuse them because the
two aren’t tightly coupled.


Changes to either the subject or an observer will not affect the other.
Because the two are loosely coupled, we are free to make changes to either, as long as
the objects still meet their obligations to implement the subject or observer interfaces.

###Problem we are solving
Making a new robust weather reporting forecaster
You have to make an interface or API which other developers can use and get current weather, forecast, heat-index, statistics .
At later point of time we should be able to add other observable like give word summary so design must be good

And thus we use Observer pattern, we have a data repository which will hold all observers, now these observer get call from Observable whenever data is changed and they can do anything with that data.
Observable is center which is master mind, and observers are dependent on observable and subscribe to changes from Observable
Think it like NewPaper publisher and subscribers pattern.
Observers can subscribe or unsubscribe to data-repository/Observable at anytime and while they are subscribe to the data-repository/Observable they will see the updates.


####Note
Java also provide in-built apis to use observer pattern, if u dont want to make it from scratch, but making from scratch is also easy :)


####Learnings
- Strive for loosely coupled designs between objects that interact
- Observer - define a one-to-many dependency between object so that when one objects change state, all its dependents are notified and updated automatically

- Thus if I want to talk to weather-data-repo I just want to implement observer and let Observable need to add me as a subscriber and then i will be notified about the changes.
So this Pattern is clean and can be exploited while making api's or socket connection.