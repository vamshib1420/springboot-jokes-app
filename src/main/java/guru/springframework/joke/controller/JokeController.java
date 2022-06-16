package guru.springframework.joke.controller;

import guru.springframework.joke.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Kumar on 30-06-2018.
 */
@Controller
public class JokeController {
    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/", ""})
    public String getRandomQuote(Model model)
    {
        model.addAttribute("joke", jokeService.randomJoke());
        return "chucknorris";
    }
}
