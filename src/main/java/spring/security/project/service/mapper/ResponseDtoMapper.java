package spring.security.project.service.mapper;

public interface ResponseDtoMapper<D, T> {
    D mapToDto(T t);
}
