package com.example.composition.domain.usecase

import com.example.composition.domain.entity.Question
import com.example.composition.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {

    //Если переопределили данный оператор, то в любом месте, где используешь этот юзкейс,
    // то можно вызвать просто как метод, либо написать явно .invoke
    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {

        private const val COUNT_OF_OPTIONS = 6
    }
}