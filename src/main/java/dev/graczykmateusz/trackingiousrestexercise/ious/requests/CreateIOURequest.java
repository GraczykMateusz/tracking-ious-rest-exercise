package dev.graczykmateusz.trackingiousrestexercise.ious.requests;

import dev.graczykmateusz.trackingiousrestexercise.ious.model.IOUDetails;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateIOURequest {

    @Valid
    @NotNull
    private IOUDetails iou;
}
