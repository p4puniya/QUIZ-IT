package com.example.andapplication

object Constants{

    const val username : String ="user_name"
    const val total_Questions: String ="total_question"
    const val correct_Answers: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
                id = 1,
                question = "What country does this Flag belong to?",
                R.drawable.ic_flag_of_india,
                optionOne = "Argentina",
                optionTwo = "Australia",
                optionThree = "India",
                optionFour = "Austria",
                correctAnswer = 3
        )

        questionsList.add(que1)

        val que2 = Question(
                id = 2,
                question = "What country does this Flag belong to?",
                R.drawable.ic_flag_of_argentina,
                optionOne = "Argentina",
                optionTwo = "Australia",
                optionThree = "India",
                optionFour = "Austria",
                correctAnswer = 1
        )

        questionsList.add(que2)

        val que3 = Question(
                id = 3,
                question = "What country does this Flag belong to?",
                R.drawable.ic_flag_of_australia,
                optionOne = "Germany",
                optionTwo = "Australia",
                optionThree = "Brazil",
                optionFour = "Austria",
                correctAnswer = 2
        )

        questionsList.add(que3)

        val que4 = Question(
                id = 4,
                question = "What country does this Flag belong to?",
                R.drawable.ic_flag_of_germany,
                optionOne = "Germany",
                optionTwo = "Australia",
                optionThree = "Brazil",
                optionFour = "Austria",
                correctAnswer = 1
        )

        questionsList.add(que4)

        val que5 = Question(
                id = 5,
                question = "What country does this Flag belong to?",
                R.drawable.ic_flag_of_fiji,
                optionOne = "Denmark",
                optionTwo = "Belgium",
                optionThree = "Fiji",
                optionFour = "Kuwait",
                correctAnswer = 3
        )

        questionsList.add(que5)

        return questionsList
    }

}