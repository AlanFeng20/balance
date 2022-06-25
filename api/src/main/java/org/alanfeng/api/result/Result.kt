package org.alanfeng.api.result


data class Result<T>(
    val code: Int = 200,
    val message: String = "success",
    val success: Boolean = true,
    val data: T? = null
) {
    companion object {
        fun <T> success(data: T) = Result(data = data)
        fun success() = Result<Any>(success = true)
        fun fail(code: Int, msg: String) = Result<Any>(code = code, message = msg,success = false)
    }
}
