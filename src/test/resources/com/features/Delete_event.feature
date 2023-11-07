Feature: As an authenticated user,I want to able to delete a diary event that as already been created so that I can remove a diary event that is no longer required
@Delete_event
Scenario: Removing the diary event of Finalinterview slots

Given User wants to delete diary events as below which has already been created on date "27".
      |FinalInterviewSlot[2.00pm][3.00pm]|
      |FinalInterviewSlot[6.00pm][7.00pm]|
Then the respective diary events as below should be deleted on date "27".
      |Slot Time                         |
      |FinalInterviewSlot[2.00pm][3.00pm]|
      |FinalInterviewSlot[6.00pm][7.00pm]|
And browser should be closed