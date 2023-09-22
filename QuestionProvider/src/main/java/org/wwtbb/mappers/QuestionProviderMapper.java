package org.wwtbb.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import org.wwtbb.data.Question;
import org.wwtbb.data.QuestionProviderDTO;

import java.util.List;

@Mapper
@Component
public interface QuestionProviderMapper {
    QuestionProviderMapper INSTANCE = Mappers.getMapper(QuestionProviderMapper.class);

    QuestionProviderDTO toDTO(Question question);

    Question fromDTO(QuestionProviderDTO dto);

    List<QuestionProviderDTO> toDTOList(List<Question> all);
}
