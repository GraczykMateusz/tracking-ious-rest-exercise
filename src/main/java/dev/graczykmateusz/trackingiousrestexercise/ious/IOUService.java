package dev.graczykmateusz.trackingiousrestexercise.ious;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IOUService {

    private final IOURepository iouRepository;
    private final IOUCommandValidator iouCommandValidator;
    private final IOUDTOMapper iouDTOMapper;

    public IOUDTO create(CreateIOURequest request) {
//        iouCommandValidator.validate(request);

        IOU iou = IOU.builder()
                .borrower(request.getBorrower())
                .lender(request.getLender())
                .money(request.getMoney())
                .build();
        iou = iouRepository.save(iou);
        return iouDTOMapper.apply(iou);
    }
}
