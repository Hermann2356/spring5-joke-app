package guru.springframework.sfgjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class ChuckNorrisJokeServiceImpl implements JokeService {

    @Override
    public String getJoke() {
      ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
      return chuckNorrisQuotes.getRandomQuote();
    }
}
