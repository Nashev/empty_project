package ru.bellintegrator.practice.user.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import ru.bellintegrator.practice.Application;
import ru.bellintegrator.practice.dao.office.OfficeDao;
import ru.bellintegrator.practice.model.Office;
import ru.bellintegrator.practice.model.Organization;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
@WebAppConfiguration(value = "src/main/resources")
@Transactional
@DirtiesContext
public class OfficeDaoTest {

    @Autowired
    private OfficeDao officeDao;

    @Test
    public void test() {
        Office office = new Office();
        office.setAddress("Address");
        Organization organization = new Organization();
        office.setOrganization(organization);
        officeDao.save(office);

        List<Office> offices = officeDao.all();
        Assert.assertNotNull(offices);

        organization = offices.get(1).getOrganization();
        Assert.assertNotNull(organization);

        offices = officeDao.all();
        organization = offices.get(1).getOrganization();
        Assert.assertNotNull(organization);
    }
}