package new_features.record.mapper;

import new_features.record.dto.UserCreateRequest;
import new_features.record.dto.UserResponse;
import new_features.record.entity.User;

public class UserMapper {

    public User fromUserCreateRequest(UserCreateRequest request) {
        return new User(
                request.firstName(),
                request.lastName(),
                request.gender(),
                request.email(),
                request.username(),
                request.password()
        );
    }

    public UserResponse toUserResponse(User user) {
        return new UserResponse(
               user.getFirstName(),
               user.getLastName(),
               user.getGender(),
               user.getEmail(),
               user.getUsername(),
               user.getPassword(),
               user.getCreatedAt(),
               user.getUpdatedAt()
        );
    }

}
