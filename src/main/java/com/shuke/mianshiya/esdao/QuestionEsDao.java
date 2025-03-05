package com.shuke.mianshiya.esdao;

import com.shuke.mianshiya.model.dto.question.QuestionEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * 题目 ES 操作
 */
public interface QuestionEsDao extends ElasticsearchRepository<QuestionEsDTO, Long> {

    /**
     * 根据用户 id 查询（父类 CrudRepository 已经定义了这个方法，会根据方法名自动映射为查询操作，不需要自己手动写）
     * @param userId
     * @return
     */
    List<QuestionEsDTO> findByUserId(Long userId);
}