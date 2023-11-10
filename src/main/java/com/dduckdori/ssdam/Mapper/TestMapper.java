package com.dduckdori.ssdam.Mapper;

import com.dduckdori.ssdam.Domain.SchedulerDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<SchedulerDTO> getAllQuestion_notSend();

    int send_Question(List<SchedulerDTO> input_param);
}
