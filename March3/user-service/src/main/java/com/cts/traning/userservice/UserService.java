package com.cts.traning.userservice;

import java.util.List;

public interface UserService {
	public UserDTO insert(UserDTO userDTO);
	public List<UserDTO> getAllUsers();
	public UserDTO getUserById(int id);
	public UserDTO saveUser(UserDTO user);
	public void deleteUser(int id);
	public UserDTO updateUser(UserDTO user);
	public boolean activateUser(String email);
}


