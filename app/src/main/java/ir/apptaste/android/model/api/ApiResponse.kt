package ir.apptaste.android.model.api

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ApiResponse(
    @SerializedName("Similar")
    var similar: Similar
) : Serializable