package com.example.chatbot

data class ChatData (
    val message : String ,
    val role : String
)

enum class ChatRoleEnum(val role : String)
{
    USER(role = "user"),
    MODEL(role = "model")
}

/*An enum class in Kotlin lets you make a list of options that something can be.
 For example, if you're talking about days of the week, you'd list Monday, Tuesday, Wednesday, and so on.
 It's like having a bunch of labels for things you might want to talk about. It helps make your code
 clearer and easier to understand.*/