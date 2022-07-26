package com.elthobhy.footballklasemen.data.remote.response.vo

class ApiResponse<T>(val statusNetwork: StatusResponseNetwork, val body: T?, val message: String?) {
    companion object{
        fun <T> success(body: T?): ApiResponse<T> = ApiResponse(StatusResponseNetwork.SUCCESS, body, null)

        fun <T> empty(msg: String, body: T): ApiResponse<T> = ApiResponse(StatusResponseNetwork.EMPTY, body, msg)

        fun <T> error(msg: String, body: T): ApiResponse<T> = ApiResponse(StatusResponseNetwork.ERROR, body, msg)
    }
}