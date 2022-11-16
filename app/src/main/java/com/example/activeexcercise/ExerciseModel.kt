package com.example.activeexcercise

import android.widget.ImageView

class ExerciseModel(
    private var id: Int,
    private var name: String,
    private var image: Int,
    private var isComplected: Boolean,
    private var isSelected: Boolean

) {
    fun getId() : Int{
        return id
    }

    fun setId(id: Int){
        this.id = id
    }

    fun getName() : String{
        return name
    }

    fun setName(name: String){
        this.name = name
    }

    fun getIsCompleted() :Boolean{
        return isComplected
    }

    fun setIsCompleted(isComplected: Boolean){
        this.isComplected= isComplected
    }

    fun setIsSelected() :Boolean{
        return isSelected
    }

    fun setIsSelected(isSelected: Boolean){
        this.isSelected = isSelected
    }

    fun getImage() :Int{
        return image
    }

    fun setImage(image: Int){
        this.image= image
    }

    fun getIsSelected(): Boolean {
        return isSelected
    }


}