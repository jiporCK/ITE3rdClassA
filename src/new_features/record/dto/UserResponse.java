package new_features.record.dto;

import java.time.LocalDateTime;

public record UserResponse(

        String firstName,
        String lastName,
        String gender,
        String email,
        String username,
        String password,
        LocalDateTime createdAt,
        LocalDateTime updatedAt

) {
}
