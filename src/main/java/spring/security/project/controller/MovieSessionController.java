package spring.security.project.controller;

import java.time.LocalDate;
import java.util.List;
import javax.validation.Valid;
import spring.security.project.dto.request.MovieSessionRequestDto;
import spring.security.project.dto.response.MovieSessionResponseDto;
import spring.security.project.model.MovieSession;
import spring.security.project.service.MovieSessionService;
import spring.security.project.service.mapper.RequestDtoMapper;
import spring.security.project.service.mapper.ResponseDtoMapper;
import spring.security.project.util.DateTimePatternUtil;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie-sessions")
public class MovieSessionController {
    private final MovieSessionService movieSessionService;
    private final RequestDtoMapper<MovieSessionRequestDto, MovieSession>
            movieSessionRequestDtoMapper;
    private final ResponseDtoMapper<MovieSessionResponseDto, MovieSession>
            movieSessionResponseDtoMapper;

    public MovieSessionController(MovieSessionService movieSessionService,
            RequestDtoMapper<MovieSessionRequestDto, MovieSession> movieSessionRequestDtoMapper,
            ResponseDtoMapper<MovieSessionResponseDto, MovieSession>
                                      movieSessionResponseDtoMapper) {
        this.movieSessionService = movieSessionService;
        this.movieSessionRequestDtoMapper = movieSessionRequestDtoMapper;
        this.movieSessionResponseDtoMapper = movieSessionResponseDtoMapper;
    }

    @PostMapping
    public MovieSessionResponseDto add(@RequestBody @Valid MovieSessionRequestDto requestDto) {
        MovieSession movieSession = movieSessionRequestDtoMapper.mapToModel(requestDto);
        movieSessionService.add(movieSession);
        return movieSessionResponseDtoMapper.mapToDto(movieSession);
    }

    @GetMapping("/available")
    public List<MovieSessionResponseDto> findAvailableSessions(@RequestParam Long movieId,
                                                @RequestParam
            @DateTimeFormat(pattern = DateTimePatternUtil.DATE_PATTERN)
                                                        LocalDate date) {
        return movieSessionService.findAvailableSessions(movieId, date)
                .stream()
                .map(movieSessionResponseDtoMapper::mapToDto)
                .toList();
    }

    @PutMapping("/{id}")
    public MovieSessionResponseDto update(@PathVariable Long id,
                                          @RequestBody @Valid MovieSessionRequestDto requestDto) {
        MovieSession movieSession = movieSessionRequestDtoMapper.mapToModel(requestDto);
        movieSession.setId(id);
        movieSessionService.update(movieSession);
        return movieSessionResponseDtoMapper.mapToDto(movieSession);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        movieSessionService.delete(id);
    }
}