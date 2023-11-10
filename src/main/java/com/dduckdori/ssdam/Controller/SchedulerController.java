package com.dduckdori.ssdam.Controller;

import com.dduckdori.ssdam.Domain.SchedulerDTO;
import com.dduckdori.ssdam.Service.SchedulerService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


@Controller
@RequiredArgsConstructor
public class SchedulerController {

    private final SchedulerService schedulerService;
    private static ConcurrentHashMap<String,List<SchedulerDTO>> h_map;
    private static List<SchedulerDTO> send_question;
    @Scheduled(fixedRate = 30000)
    public void findall(){
        h_map= schedulerService.getAllQuestion_notSend();
        //안보낸 질문들 선별
        send_question = schedulerService.get_Question(h_map);
        schedulerService.send_Question(send_question);
    }

}
