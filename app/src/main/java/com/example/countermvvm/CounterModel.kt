package com.example.countermvvm

data class CounterModel (var count : Int)

class CounterRepository{//repository is a desine pattern which acts as an API or commonly called as a moderator
    private var _counter = CounterModel(0)

    fun getCounter() = _counter

    fun incrementCounter(){
        _counter.count++
    }
    fun decrementCounter(){
        _counter.count--
    }
}