package pm.devshevtsov.application.model;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        String title,
        String desc,
        Status status,
        Type contentTime,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
