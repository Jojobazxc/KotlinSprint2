package lesson17.task1

class Quiz(question: String, answer: String) {

    var question: String = question
        get() = field
        set(value) {
            field = value
        }
    var answer: String = answer
        set(value) {
            field = value
        }

}