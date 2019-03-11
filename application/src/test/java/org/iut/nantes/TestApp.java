package org.iut.nantes;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import iut.org.nantes.factories.Monument;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = { TestConfig.class })
public class TestApp {

	@Autowired
	Service serv;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(serviceApp).build();
	}

	private MockMvc mockMvc;

	@InjectMocks
	private ServiceApp serviceApp;

	@Mock
	private Service userService;

	@Test
	public void testLoginActionSuccessful() throws Exception {
		List<String> listAtt = new ArrayList<String>();
		listAtt.add("47.268485");
		listAtt.add("-1.485257");
		listAtt.add("5000");
		Monument mon = new Monument(listAtt);

		List<Monument> testList = serv.getAllMonuments(mon);

		Mockito.when(userService.getAllMonuments(mon)).thenReturn(testList);

		MvcResult result = mockMvc
				.perform(MockMvcRequestBuilders.get("/monuments").param("coor0", "47.268485")
						.param("coor1", "-1.485257").param("dist", "5000"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"))
				.andDo(MockMvcResultHandlers.print()).andReturn();
		Assert.assertNotNull(result);
	}

}
