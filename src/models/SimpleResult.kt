package models

data class SimpleResult (
        val isSuccess: Boolean,
        val failureMessage: String?
) {
    constructor(isSuccess: Boolean) : this(isSuccess, failureMessage = null)
}