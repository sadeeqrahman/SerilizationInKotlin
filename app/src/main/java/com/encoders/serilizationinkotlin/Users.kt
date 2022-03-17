package com.encoders.serilizationinkotlin

data class Users(
    var name: String = "",
    var designation: String = "",
    var company: String = ""
) : java.io.Serializable
