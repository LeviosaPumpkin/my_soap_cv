package com.leviosa.pumpkin.my_soap_cv.configuration.endpoint;

import com.medium.types.cv.*;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class Cv {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @ResponsePayload
    @PayloadRoot(namespace = "http://medium.com/types/cv", localPart = "GeneralInfo")
    public GeneralInfo getGeneralInfo(){
        logger.info("getGeneralInfo");
        ObjectFactory objectFactory = new ObjectFactory();
        GeneralInfo output = objectFactory.createGeneralInfo();
        output.setName("Anastasiia Khramtsova");
        output.setDateOfBirth("20/02/1997");
        output.setEmail("khramtsova.anastasiia.a@gmail.com");
        output.setPhone("+79113182228");
        return output;
    }
    
    @ResponsePayload
    @PayloadRoot(namespace = "http://medium.com/types/cv", localPart = "EducationList")
    public EducationList getEducationInfo(){
        logger.info("getEducationInfo");
        ObjectFactory objectFactory = new ObjectFactory();
        EducationList output = objectFactory.createEducationList();
        
        EducationInfo bachelor = new EducationInfo();
        bachelor.setDegree(AcademicDegree.BACHELOR);
        bachelor.setYear(2018);
        bachelor.setUniversity("SPbPU");
        bachelor.setStudies("SoftwareEngeneering");
        output.getEducationInfo().add(bachelor);
        
        EducationInfo master = new EducationInfo();
        master.setDegree(AcademicDegree.MASTER);
        master.setYear(2020);
        master.setUniversity("SPbPU");
        master.setStudies("SoftwareEngeneering");
        output.getEducationInfo().add(master);
                
        return output;
    }
    
    @ResponsePayload
    @PayloadRoot(namespace = "http://medium.com/types/cv", localPart = "SkillsList")
    public SkillsList getSkills(){
        logger.info("getSkillInfo");
        ObjectFactory objectFactory = new ObjectFactory();
        SkillsList output = objectFactory.createSkillsList();
        
        output.getSkillInfo().add("Java");
        output.getSkillInfo().add("Spring boot");
        output.getSkillInfo().add("JSF");
        output.getSkillInfo().add("SQL");
        output.getSkillInfo().add("SOAP");
        output.getSkillInfo().add("REST");
        output.getSkillInfo().add("Java Script");
        output.getSkillInfo().add("English");
        output.getSkillInfo().add("Agile");
                
        return output;
    }
    
    @ResponsePayload
    @PayloadRoot(namespace = "http://medium.com/types/cv", localPart = "WorkingExperienceList")
    public WorkingExperinceList getWorkingExperience(){
        logger.info("getWorkingexperience");
        ObjectFactory objectFactory = new ObjectFactory();
        WorkingExperinceList output = objectFactory.createWorkingExperinceList();
        
        WorkingExperienceInfo first = new WorkingExperienceInfo();
        first.setCompanyName("Postupi Online");
        first.setPosition("Intern");
        first.setYearStart(2018);
        first.setYearEnd(2019);
        first.setDescription("");
        output.getWorkingExperienceInfo().add(first);
        
        WorkingExperienceInfo second = new WorkingExperienceInfo();
        second.setCompanyName("Murano Software");
        second.setPosition("Junior Developer");
        second.setYearStart(2019);
        second.setYearEnd(2021);
        second.setDescription("");
        output.getWorkingExperienceInfo().add(second);

        return output;
    }
    
}