package new_features.record.dto;

public record UserCreateRequest(

        String firstName,
        String lastName,
        String gender,
        String email,
        String username,
        String password

) {
}
