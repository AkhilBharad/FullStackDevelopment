package com.cts.traning.dto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cts.traning.models.User;
import com.cts.traning.repo.UserRepo;
import com.cts.traning.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepo ur;
	@Override
	public UserDTO insert(UserDTO ud) {
		User ue = new User();
		BeanUtils.copyProperties(ud, ue);
		ur.save(ue);
		return ud;
	}
}
