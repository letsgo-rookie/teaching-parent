package com.atonline.eduservice.service;

import com.atonline.eduservice.controller.subject.oneSubject;
import com.atonline.eduservice.entity.EduSubject;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 课程科目 服务类
 * </p>
 *
 * @author rookie
 * @since 2020-10-21
 */
public interface EduSubjectService extends IService<EduSubject> {

    void saveSubject(MultipartFile file, EduSubjectService subjectService);

    List<oneSubject> getAllOneTwoSubject();
}
