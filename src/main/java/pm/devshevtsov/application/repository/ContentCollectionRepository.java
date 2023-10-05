package pm.devshevtsov.application.repository;

import org.springframework.stereotype.Repository;
import pm.devshevtsov.application.model.Content;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> content = new ArrayList<>();

    public ContentCollectionRepository() {

    }

    public List<Content> findAll() {
        return content;
    }

    public Optional<Content> findById(Integer id) {
        return content.stream()
                .filter(c -> c.id().equals(id)).findFirst();
    }

    public void save (Content c) {
        content.removeIf(cont -> cont.id().equals(cont.id()));
        content.add(c);
    }

    public boolean existsById(Integer id) {
        return content.stream().filter(c -> c.id().equals(id)).count() == 1;
    }

    public void deleteById(Integer id) {
        content.removeIf(c -> c.id().equals(id));
    }

}
