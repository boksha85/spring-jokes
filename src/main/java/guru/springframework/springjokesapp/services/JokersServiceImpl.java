package guru.springframework.springjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokersServiceImpl implements JokesService {

    @Override
    public String getJoke() {
        ChuckNorrisQuotes chq = new ChuckNorrisQuotes();
        return chq.getRandomQuote();
    }
}
