package brew.brewbrowser.Repository;

import brew.brewbrowser.Model.Brewery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BreweryRepository extends JpaRepository<Brewery, String> {
    Optional<Brewery> findById(String breweryId);
}
