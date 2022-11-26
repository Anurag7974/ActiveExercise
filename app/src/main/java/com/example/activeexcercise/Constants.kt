package com.example.activeexcercise

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val bowExtension = ExerciseModel(
            1,
            "Bow Extension",
            R.drawable.bow,
            false,
            false
        )
        exerciseList.add(bowExtension)

        val bentOverRow = ExerciseModel(
            2,
            "Bent-Over Row",
             R.drawable.bent,
            false,
             false
        )
        exerciseList.add(bentOverRow)

        val reverseFly = ExerciseModel(
            3,
            "Reverse Fly",
            R.drawable.bent,
            false,
            false
        )
        exerciseList.add(reverseFly)

        val oneArmRow = ExerciseModel(
            4,
            "One-Arm Row",
            R.drawable.one,
            false,
            false
        )
        exerciseList.add(oneArmRow)

        val deadLift = ExerciseModel(
            5,
            "DeadLift",
            R.drawable.deadlift,
            false,
            false
        )
        exerciseList.add(deadLift)

        val shoulderPress = ExerciseModel(
            6,
            "Shoulder Press",
            R.drawable.shoulder,
            false,
            false
        )
        exerciseList.add(shoulderPress)

        val wristCurl = ExerciseModel(
            7,
            "Wrist Curl",
            R.drawable.weist,
            false,
            false
        )
        exerciseList.add(wristCurl)

        val uprightRow = ExerciseModel(
           8 ,
            "Upright Row",
            R.drawable.uprigh,
            false,
            false
        )
        exerciseList.add(uprightRow)

        val oneArmTicep = ExerciseModel(
            9,
            "One Arm Tricep Extension",
            R.drawable.onearm,
            false,
            false
        )
        exerciseList.add(oneArmTicep)

        val sideBend = ExerciseModel(
            10,
            "Side Bend",
            R.drawable.side,
            false,
            false
        )
        exerciseList.add(sideBend)

        val lunge = ExerciseModel(
            11,
            "Lunge",
            R.drawable.lunge,
            false,
            false
        )
        exerciseList.add(lunge)

        val donkeyKicks = ExerciseModel(
            12,
            "Donkey Kicks",
            R.drawable.donkey,
            false,
            false
        )
        exerciseList.add(donkeyKicks)

        val calfRaise = ExerciseModel(
            13,
            "Calf Raise",
            R.drawable.calf,
            false,
            false
        )
        exerciseList.add(calfRaise)


        return exerciseList
    }

}