package dev.graczykmateusz.trackingiousrestexercise.ious;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IOUService {

    private final IOURepository iouRepository;

    public IOU create(CreateIOUCommand cmd) {
        IOU iou = IOU.builder()
                .borrower(cmd.getBorrower().getName())
                .lender(cmd.getLender().getName())
                .amount(cmd.getAmount())
                .build();
        return iouRepository.save(iou);
    }
}
