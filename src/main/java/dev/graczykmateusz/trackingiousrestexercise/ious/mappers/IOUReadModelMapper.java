package dev.graczykmateusz.trackingiousrestexercise.ious.mappers;

import dev.graczykmateusz.trackingiousrestexercise.ious.dto.IOUReadModel;
import dev.graczykmateusz.trackingiousrestexercise.users.model.User;
import org.springframework.stereotype.Component;

import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class IOUReadModelMapper implements Function<User, IOUReadModel> {

    @Override
    public IOUReadModel apply(User user) {
        return new IOUReadModel(
                user.getName(),
                user.getIous().entrySet().stream()
                        .collect(Collectors.toMap(
                                k -> k.getKey().getName(),
                                v -> v.getValue().getAmount()))
        );
    }
}
