package guru.springframework.sfgjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class ChuckNorrisJokeServiceImpl implements JokeService {
    private  final ChuckNorrisQuotes quotes;

    public ChuckNorrisJokeServiceImpl() {
        this.quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
     return quotes.getRandomQuote();
    }
}
