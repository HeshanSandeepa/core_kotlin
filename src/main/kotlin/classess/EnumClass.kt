package classess



// used to represent states , directions, modes etc
// enum classes can have properties & methods too

enum class State(val stateMessage: String) {
    IDLE("idling Now" ), RUNNING(stateMessage = "running Now"), FINISHED(stateMessage = "finishedNow");

    fun capitalize() = this.stateMessage.toList()
}

fun main(args: Array<String>) {


    val state = State.FINISHED;
    when(state) {
        State.RUNNING -> println(State.RUNNING.capitalize())
        State.IDLE -> println(State.IDLE.capitalize())
        else -> println(state.capitalize())
    }
}
