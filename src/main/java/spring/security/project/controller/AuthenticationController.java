package spring.security.project.controller;

import javax.validation.Valid;
import spring.security.project.dto.request.UserRequestDto;
import spring.security.project.dto.response.UserResponseDto;
import spring.security.project.model.User;
import spring.security.project.service.AuthenticationService;
import spring.security.project.service.mapper.ResponseDtoMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    private final AuthenticationService authService;
    private final ResponseDtoMapper<UserResponseDto, User> userDtoResponseMapper;

    public AuthenticationController(AuthenticationService authService,
            ResponseDtoMapper<UserResponseDto, User> userDtoResponseMapper) {
        this.authService = authService;
        this.userDtoResponseMapper = userDtoResponseMapper;
    }

    @PostMapping("/register")
    public UserResponseDto register(@RequestBody @Valid UserRequestDto requestDto) {
        User user = authService.register(requestDto.getEmail(), requestDto.getPassword());
        return userDtoResponseMapper.mapToDto(user);
    }
}
