package com.sihai.test.service;


public class UserServiceImplTest {

//	private ApplicationContext applicationContext;
//
//	@Before
//	public void setUp() throws Exception {
//
//		applicationContext = new ClassPathXmlApplicationContext(new String[] {
//				"spring/applicationContext-dao.xml",
//				"spring/applicationContext-transaction.xml",
//				"spring/applicationContext-service.xml"
//		});
//	}
//
//	@Test
//	public void testSaveUser() throws Exception {
//		
//		Sid sid = (Sid) applicationContext.getBean("sid");
//		
//		User user = new User();
//		user.setId(sid.nextShort());
//		user.setUsername("lcx");
//		user.setSex("男");
//		
//		UserService userService = (UserService) applicationContext.getBean("userService");
//		userService.saveUser(user);
//	}
//	
//	@Test
//	public void testGetUserById() throws Exception {
//		UserService userService = (UserService) applicationContext.getBean("userService");
//  
//		User user = userService.getUserById("1001");
//		System.out.println(user.toString());
//	}
//	
//	@Test
//	public void testGetUserList() throws Exception {
//		UserService userService = (UserService) applicationContext.getBean("userService");
//
//		List<User> userList = userService.getUserList();
//		for (User user : userList) {
//			System.out.println(user.toString());
//		}
//	}
//	
//	@Test
//	public void testUpdateUserById() throws Exception {
//		UserService userService = (UserService) applicationContext.getBean("userService");
//
//		User user = new User();
//		user.setId("1002");
//		user.setUsername("nathan");
//		user.setSex("woman");
//		
//		userService.updateUserById(user);
//	}
//	
//	@Test
//	public void testDeleteUserById() throws Exception {
//		UserService userService = (UserService) applicationContext.getBean("userService");
//
//		userService.deleteUserById("1002");
//	}
	
}
