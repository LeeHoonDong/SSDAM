package com.dduckdori.ssdam.Repository;

import com.dduckdori.ssdam.Domain.SchedulerDTO;
import com.dduckdori.ssdam.Mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SchedulerRepositoryImpl implements SchedulerRepository{
    private final TestMapper testMapper;
    @Override
    public List<SchedulerDTO> getAllQuestion_notSend() {
        return testMapper.getAllQuestion_notSend();
    }

    @Override
    public int insert_Question(List<SchedulerDTO> input_param) {
        return testMapper.send_Question(input_param);
    }
}
