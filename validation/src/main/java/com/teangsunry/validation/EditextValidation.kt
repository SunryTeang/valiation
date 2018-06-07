package com.teangsunry.validationawsome.validation

import android.content.Context

/**
 * Created by TEANG SUNRY on 6/7/18.
 */


class EditextValidation private constructor(mContext: Context) {

    companion object {
        lateinit var INSTANCE: EditextValidation

        fun getInstance(context: Context): EditextValidation {
            INSTANCE = EditextValidation(context)
            return INSTANCE
        }
    }

    fun isValidPhoneNumber(target: CharSequence?): Boolean {
        return if (target == null || target.length < 6 || target.length > 13) {
            false
        } else {
            android.util.Patterns.PHONE.matcher(target).matches()
        }

    }

}