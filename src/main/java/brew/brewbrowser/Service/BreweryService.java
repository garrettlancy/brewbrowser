package brew.brewbrowser.Service;

import brew.brewbrowser.Model.Brewery;
import brew.brewbrowser.Repository.BreweryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BreweryService {
    @Autowired
    private BreweryRepository breweryRepository;

    public Optional<Brewery> findBreweryById(String breweryId) {
        return breweryRepository.findById(breweryId);
    }
}
