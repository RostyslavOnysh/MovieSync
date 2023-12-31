package spring.security.project.service.mapper;

import org.springframework.stereotype.Component;
import spring.security.project.dto.response.UserResponseDto;
import spring.security.project.model.User;

@Component
public class UserMapper implements ResponseDtoMapper<UserResponseDto, User> {
    @Override
    public UserResponseDto mapToDto(User user) {
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setId(user.getId());
        responseDto.setEmail(user.getEmail());
        return responseDto;
    }
}
