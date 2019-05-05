package brew.brewbrowser.Controller;

import brew.brewbrowser.Model.Brewery;
import brew.brewbrowser.Service.BreweryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BreweryController {
    @Autowired
    private BreweryService breweryService;

    @RequestMapping(value="/api/brewery/{breweryId}", method=RequestMethod.GET)
    public Optional<Brewery> getBrewery(@PathVariable String breweryId) {
        return breweryService.findBreweryById(breweryId);
    }
}
