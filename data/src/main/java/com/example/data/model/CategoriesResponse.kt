package com.example.data.model

import com.example.domain.entities.CategoryItemDTO
import com.google.gson.annotations.SerializedName

data class CategoriesResponse(

	@field:SerializedName("metadata")
	val metadata: Metadata? = null,

	@field:SerializedName("data")
	val data: List<DataItem>? = null,

	@field:SerializedName("results")
	val results: Int? = null
)

data class DataItem(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("slug")
	val slug: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class Metadata(

	@field:SerializedName("numberOfPages")
	val numberOfPages: Int? = null,

	@field:SerializedName("limit")
	val limit: Int? = null,

	@field:SerializedName("currentPage")
	val currentPage: Int? = null
)

fun DataItem.toCategoryItemDTO() : CategoryItemDTO{

	return CategoryItemDTO(
		image = image,
		createdAt = createdAt,
		name = name,
		id = id,
		slug = slug
	,updatedAt = updatedAt
	)
}
