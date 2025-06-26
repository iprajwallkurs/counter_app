package com.example.countermvvm.ui.theme

/*

First, What is MVVM?
MVVM stands for Model - View - ViewModel.
It’s a software architecture pattern that helps in organizing your Android code cleanly and efficiently.

Breakdown:
Model → Handles the data (from API, database, etc.)
View → The UI (Activity, Fragment, XML layout)
ViewModel → Middleman between View and Model. It holds UI-related data and logic, and survives configuration changes (like screen rotation).

Why use MVVM?
 --------------------------------------| ---------------------------------------------------------------|
| Reason                               | Explanation                                                    |
| -------------------------------------| ---------------------------------------------------------------|
| Separation of concerns               | Each layer has its own job. UI doesn’t talk directly to data.  |
| Handles configuration changes        | ViewModel survives screen rotation, so data isn’t lost.        |
| Easier to test                       | Logic is separated from UI, making unit testing simple.        |
| Cleaner code                         | Avoids spaghetti code in Activities or Fragments.              |
| ------------------------------------ | ---------------------------------------------------------------|

What is Repository?
The Repository is like a data manager. It acts as a single source of truth and decides where the data should come from — API, local DB, or cache.

How it works:
Your ViewModel doesn’t directly call the API or Room DB.

It asks the Repository, and the repository handles whether to fetch data from the network, database, or both.

Why use Repository?
| --------------------------------------------| ----------------------------------------------------------------------|
| Reason                                      | Explanation                                                           |
| --------------------------------------------| ----------------------------------------------------------------------|
| Centralized data logic                      | All data operations are in one place.                                 |
| Easier to switch data sources               | Want to switch from Retrofit to Firebase? Just change the Repository. |
| Testable                                    | You can mock the repository easily in tests.                          |
| Decouples ViewModel and data sources        | ViewModel doesn’t care where data comes from.                         |
| ------------------------------------------- | ----------------------------------------------------------------------|
 */