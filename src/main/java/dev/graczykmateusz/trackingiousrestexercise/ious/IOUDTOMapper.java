package dev.graczykmateusz.trackingiousrestexercise.ious;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class IOUDTOMapper implements Function<IOU, IOUDTO> {

    @Override
    public IOUDTO apply(IOU iou) {
        return new IOUDTO(
                iou.getId(),
                iou.getLender().getUserName().getName(),
                iou.getBorrower().getUserName().getName(),
                iou.getMoney().getAmount()
        );
    }
}
