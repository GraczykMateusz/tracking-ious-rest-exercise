package dev.graczykmateusz.trackingiousrestexercise.ious.requests;

import dev.graczykmateusz.trackingiousrestexercise.ious.model.IOUDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateIOURequest {

    @Valid
    @NotNull
    private IOUDetails iou;
}
