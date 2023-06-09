package bg.softuni.WeddingSite.repository;

import bg.softuni.WeddingSite.models.Picture;
import bg.softuni.WeddingSite.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.Optional;

@Repository
public interface FileRepository extends JpaRepository<Picture, Long> {

}
