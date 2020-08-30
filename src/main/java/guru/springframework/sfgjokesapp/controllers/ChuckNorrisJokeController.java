package guru.springframework.sfgjokesapp.controllers;

import guru.springframework.sfgjokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisJokeController {
    private final JokeService jokeService;

    public ChuckNorrisJokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/joke")
    public String getChuckNorrisJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
      return "joke";
    }
}
