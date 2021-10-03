package com.company.Summative1MalaniRyan.controllers;

import com.company.Summative1MalaniRyan.models.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    private List<Quote> quoteList;

    private static int idCounter = 1;

    public QuoteController() {

        quoteList = new ArrayList<>(); // creating data set

        quoteList.add(new Quote(idCounter++, "Henry Ford", "Whether you think you can, or you think you can't -- you're right."));
        quoteList.add(new Quote(idCounter++, "Oscar Wilde", "Be yourself; everyone else is already taken."));
        quoteList.add(new Quote(idCounter++, "Albert Einstein", "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe."));
        quoteList.add(new Quote(idCounter++, "Bernard M. Baruch", "Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind."));
        quoteList.add(new Quote(idCounter++, "Mae West", "You only live once, but if you do it right, once is enough."));
        quoteList.add(new Quote(idCounter++, "Mahatma Gandhi", "Be the change that you wish to see in the world."));
        quoteList.add(new Quote(idCounter++, "Robert Frost", "In three words I can sum up everything I've learned about life: it goes on."));
        quoteList.add(new Quote(idCounter++, "Mark Twain", "If you tell the truth, you don't have to remember anything."));
        quoteList.add(new Quote(idCounter++, "Maya Angelou", "I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel."));
        quoteList.add(new Quote(idCounter++, "Oscar Wilde", "To live is the rarest thing in the world. Most people exist, that is all."));
        quoteList.add(new Quote(idCounter++, "Mahatma Gandhi", "Live as if you were to die tomorrow. Learn as if you were to live forever."));
        quoteList.add(new Quote(idCounter++, "Martin Luther King Jr.", "Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that."));

        // quotes courtesy of: https://www.goodreads.com/quotes

    }

    // GET quote randomly

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getRandomQuote() {

        Random quoteListRandomizer = new Random(); // creating randomizer

        Quote returnQuote = new Quote(); // initializing the return Quote object

        int index = -1; // initializing index variable to be randomized

        for (int i = 0; i < quoteList.size(); i++) {
            index = quoteListRandomizer.nextInt(quoteList.size()); // setting index to random number within size of arraylist
            break;
        }

        for (Quote quote : quoteList) {
            if (quote.getId() == index) { // finding the object in quoteList with the randomly picked index
                returnQuote = quote; // setting the return object to the randomly picked object
                break;
            }
        }

        return returnQuote; // returning quote object at random index
    }


}
