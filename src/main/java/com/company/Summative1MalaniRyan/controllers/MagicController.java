package com.company.Summative1MalaniRyan.controllers;

import com.company.Summative1MalaniRyan.models.Magic;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class MagicController {

    private List<Magic> magicList;

    private static int idCounter = 1;

    public MagicController() {

        magicList = new ArrayList<>(); // creating data set

        magicList.add(new Magic(idCounter++, "", "It is certain.")); // affirmative answer
        magicList.add(new Magic(idCounter++, "", "It is decidedly so.")); // affirmative answer
        magicList.add(new Magic(idCounter++, "", "Without a doubt.")); // affirmative answer
        magicList.add(new Magic(idCounter++, "", "Yes definitely.")); // affirmative answer
        magicList.add(new Magic(idCounter++, "", "You may rely on it.")); // affirmative answer
        magicList.add(new Magic(idCounter++, "", "As I see it, yes.")); // affirmative answer
        magicList.add(new Magic(idCounter++, "", "Most likely.")); // affirmative answer
        magicList.add(new Magic(idCounter++, "", "Outlook good.")); // affirmative answer
        magicList.add(new Magic(idCounter++, "", "Yes.")); // affirmative answer
        magicList.add(new Magic(idCounter++, "", "Signs point to yes.")); // affirmative answer
        magicList.add(new Magic(idCounter++, "", "Reply hazy, try again.")); // non-committal answer
        magicList.add(new Magic(idCounter++, "", "Ask again later.")); // non-committal answer
        magicList.add(new Magic(idCounter++, "", "Better not tell you now.")); // non-committal answer
        magicList.add(new Magic(idCounter++, "", "Cannot predict now.")); // non-committal answer
        magicList.add(new Magic(idCounter++, "", "Concentrate and ask again.")); // non-committal answer
        magicList.add(new Magic(idCounter++, "", "Don't count on it.")); // negative answer
        magicList.add(new Magic(idCounter++, "", "My reply is no.")); // negative answer
        magicList.add(new Magic(idCounter++, "", "My sources say no.")); // negative answer
        magicList.add(new Magic(idCounter++, "", "Outlook not so good.")); // negative answer
        magicList.add(new Magic(idCounter++, "", "Very doubtful.")); // negative answer

        // magic 8 ball responses courtesy of: https://en.wikipedia.org/wiki/Magic_8-Ball
    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Magic getRandomMagic(@RequestBody @Valid Magic magic) {

        Random magicListRandomizer = new Random(); // creating randomizer

        int index = -1; // initializing variable to later hold random index

        Magic magicAnswer = new Magic(); // initializing return object
        magicAnswer.setId(idCounter++);
        magicAnswer.setQuestion(magic.getQuestion());
//        magicAnswer.setId(magic.getId()); // setting return object's id to input's
//        magicAnswer.setQuestion(magic.getQuestion()); // setting return object's question to input's

        for (int i = 0; i < magicList.size(); i++) {
            index = magicListRandomizer.nextInt(magicList.size()); // setting index to random number within size of arraylist
            break;
        }

        for (Magic ball : magicList) {
            if (ball.getId() == index) {
                magicAnswer.setAnswer(ball.getAnswer()); // setting the answer parameter of the return object to answer of the randomly picked object in magicList
                break;
            }
        }

        magicList.add(magicAnswer); // adding the return object to magicList

        return magicAnswer; // returning quote object at random index
    }
}

