package new_features.record;

import new_features.record.dto.UserCreateRequest;
import new_features.record.dto.UserResponse;
import new_features.record.entity.User;
import new_features.record.mapper.UserMapper;

import java.awt.image.AbstractMultiResolutionImage;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        UserMapper mapper = new UserMapper();

        UserCreateRequest request = new UserCreateRequest(
                "Tony","Stark", "Male",
                "ironman@gmail.com", "ironman",
                "Avengers123"
        );

        User user = mapper.fromUserCreateRequest(request);
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        UserResponse response = mapper.toUserResponse(user);
        System.out.println(response);

    }

}
