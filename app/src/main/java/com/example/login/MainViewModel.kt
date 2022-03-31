package com.example.login

import android.R.attr
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.login.User
import java.util.regex.Matcher
import java.util.regex.Pattern


enum class Error {
    ERROR_EMAIL,
    ERROR_PASSWORD,
}

class Resp(val isSuccess: Boolean, val error: Error?)

class MainViewModel : ViewModel() {
    var user : User = User("","","")
    private var _isSuccessEvent: MutableLiveData<Boolean> = MutableLiveData()
    val isSuccessEvent: LiveData<Boolean>
        get() = _isSuccessEvent

    private var _isErrorEvent: MutableLiveData<String> = MutableLiveData()
    val isErrorEvent: LiveData<String>
        get() = _isErrorEvent

    fun checkEmailAndPassword(email: String, password: String) {
        val isValidEmail = isEmailValid(email)
        if (!isValidEmail) {
            _isErrorEvent.postValue("Invalid Username!!!")
            return
        }

        val isValidPassword = isPasswordValid(password)
        if (!isValidPassword) {
            _isErrorEvent.postValue("Invalid Password!!!")
            return
        }
        _isSuccessEvent.postValue(true)
    }

    fun checkTrueUser(email: String, password: String) {
        val isTrueEmail = isTrueEmail(email)
        if (!isTrueEmail){
            _isErrorEvent.postValue("Wrong email")
            return
        }

        val isTruePassword = isTruePassword(password)
        if (!isTruePassword) {
            _isErrorEvent.postValue("Wrong password")
            return
        }
        _isSuccessEvent.postValue(true)
    }

    private fun isEmailValid(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun isPasswordValid(password: String): Boolean {
        val pattern: Pattern
        val matcher: Matcher

        val PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()])(?=\\S+$).{8,}$"

        pattern = Pattern.compile(PASSWORD_PATTERN)
        matcher = pattern.matcher(password)

        return matcher.matches()
       // return password.length > 8 && password !=null && password.isNotBlank() &&
    }

    private fun isTrueEmail(email: String) : Boolean {
        return email.equals(user.email)
    }
    private fun isTruePassword(password: String) : Boolean {
        return password.equals(user.password)
    }
}