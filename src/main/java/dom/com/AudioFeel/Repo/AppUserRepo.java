package dom.com.AudioFeel.Repo;

import dom.com.AudioFeel.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AppUserRepo extends JpaRepository <AppUser,Long> {

    AppUser findByUsername(String username);
}

