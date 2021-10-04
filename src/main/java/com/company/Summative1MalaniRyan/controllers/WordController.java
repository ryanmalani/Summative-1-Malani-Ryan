package com.company.Summative1MalaniRyan.controllers;

import com.company.Summative1MalaniRyan.models.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {

    private List<Word> wordList;

    private static int idCounter = 1;

    public WordController() {

        wordList = new ArrayList<>(); // creating data set

        wordList.add(new Word(idCounter++, "Antipode", "n. A direct or extreme opposite."));
        wordList.add(new Word(idCounter++, "Desiccated", "adj. Dried out or totally drained of moisture."));
        wordList.add(new Word(idCounter++, "Mellifluous", "adj. Pleasing to the ear;sweetly melodic."));
        wordList.add(new Word(idCounter++, "Opprobrium", "n. Harsh disapproval or criticism, especially by a large group of people."));
        wordList.add(new Word(idCounter++, "Pelagic", "adj. Of or related to the open sea."));
        wordList.add(new Word(idCounter++, "Pulchritude", "n. Physical beauty."));
        wordList.add(new Word(idCounter++, "Rhadamanthine", "adj. Severely or inflexibly strict."));
        wordList.add(new Word(idCounter++, "Skulduggery", "n. Dishonest behavior; trickery."));
        wordList.add(new Word(idCounter++, "Susurrus", "n. The sound of whispering or rustling."));
        wordList.add(new Word(idCounter++, "Unctuous", "adj. Greasy or oily feeling; also, excessively flattering or obsequious in a sycophantic way."));

        // words and definitions provided courtesy of: https://www.grammarly.com/blog/10-wonderful-words-to-learn-for-dictionary-day/
    }

    // GET random word

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Word getRandomWord() {

        Random wordListRandomizer = new Random(); // creating randomizer

        Word returnWord = new Word(); // initializing return word object

        int index = -1; // initializing index variable to be randomized

        for (int i = 0; i < wordList.size(); i++) {
            index = wordListRandomizer.nextInt(wordList.size()); // setting index to random number within size of arraylist
            returnWord = wordList.get(index); // getting object from wordList at random index and setting return object equal to it
            break;
        }

        return returnWord; // returning quote object at random index
    }
}
