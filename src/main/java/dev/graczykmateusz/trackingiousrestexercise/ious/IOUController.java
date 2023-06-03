package dev.graczykmateusz.trackingiousrestexercise.ious;

import dev.graczykmateusz.trackingiousrestexercise.ious.dto.IOUReadModel;
import dev.graczykmateusz.trackingiousrestexercise.ious.dto.IOUsReadModel;
import dev.graczykmateusz.trackingiousrestexercise.ious.requests.CreateIOURequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/ious")
class IOUController {

    private final IOUService iouService;

    @PostMapping
    IOUReadModel createIOU(@Valid @RequestBody CreateIOURequest request) {
        return iouService.createIOU(request);
    }

    @GetMapping
    List<IOUsReadModel> getIOUs() {
        return iouService.getAllIOUs();
    }
}
