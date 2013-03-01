/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.school.attendance.service.impl;

import com.artivisi.school.attendance.domain.JenisPeserta;
import com.artivisi.school.attendance.service.BelajarRestfulService;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author DELL
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:com/artivisi/school/attendance/**/aplicationContext.xml"})
public class JenisPesertaServiceTestIT {
    @Autowired private BelajarRestfulService belajarRestfulService;
    @Test
    public void testFindAll(){
        Page<JenisPeserta> hasil = belajarRestfulService.findAllJenisPesertas(new PageRequest(0, 10));
        assertEquals(new Integer(1), new Integer(hasil.getNumberOfElements()));
    }
    
}
