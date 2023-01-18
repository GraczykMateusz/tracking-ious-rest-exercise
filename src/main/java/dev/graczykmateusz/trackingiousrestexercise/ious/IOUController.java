package dev.graczykmateusz.trackingiousrestexercise.ious;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/ious")
class IOUController {

    private final IOUService iouService;

    @PostMapping
    IOU createIOU(@Valid @RequestBody CreateIOUCommand cmd) {
        return iouService.create(cmd);
    }
}
