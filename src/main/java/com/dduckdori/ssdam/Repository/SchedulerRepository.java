package com.dduckdori.ssdam.Repository;

import com.dduckdori.ssdam.Domain.SchedulerDTO;

import java.util.List;

public interface SchedulerRepository {
    public List<SchedulerDTO> getAllQuestion_notSend();
    public int insert_Question(List<SchedulerDTO> input_param);
}
