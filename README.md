Another excellent Kata using approval tests; just what I was looking for

# The Challenge 
- Add a new expense type called `LUNCH` 
- with a limit of 2000

# Solution
- There are a lot of places in the code that we would have to change 
- First we would have to add the new expense type `LUNCH`
- Then we would have to change the condition in the for loop of the ExpenseReport
- Then we would have to add the case `LUNCH` to the switch statement in the ExpenseReport
- And we would have to change the `mealOverExpensesMarker` condition 
- With the current design we would have to walk over the whole code base and make some relatively risky changes just to add a single expense type 
- So, we need to refactor the code first and reduce the scope of change 
- _Let's first make the change easy and then make the easy change_

## Tests
- We use a trick to rewrite system out to our own output stream, which approval tests help us with  