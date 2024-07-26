package org.dnyanyog.service;

import java.util.Optional;

import org.dnyanyog.dao.UsersDao;
import org.dnyanyog.dto.UpdateUserREsponse;
import org.dnyanyog.dto.UpdateUserRequest;
import org.dnyanyog.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateUserService {
	
	@Autowired
	UsersDao usersDao;
	
public UpdateUserREsponse updateUser(UpdateUserRequest request) {
		
		UpdateUserREsponse response= new UpdateUserREsponse();
		
		
		//If user_id not sent in request
		if(request.getUser_id()==null) {
			response.setErrorCode("911");
			response.setMessage("User_id Not Found");
			return response;
		}
		
		//If user_id not present in DB
		Optional<Users> usersPresentInDb = usersDao.findById(request.getUser_id());
          
		if(!usersPresentInDb.isPresent()) {
			response.setErrorCode("912");
            response.setMessage("User_id Not Present in DB");
            response.setUpdateUserRequest(request);
            return response;
		}
	
		
		Users usersTable=new Users();
		
		
		usersTable.setFirstName(request.getFirstName());
		usersTable.setLastName(request.getLastName());
		usersTable.setAddress(request.getAddress());
		usersTable.setEmail(request.getEmail());
		usersTable.setLoginName(request.getLoginName());
		usersTable.setPassword(request.getPassword());
		usersTable.setUser_id(request.getUser_id());
		
		usersDao.save(usersTable);
		
		response.setErrorCode("0000");
		response.setMessage("User updated Successfully");
		response.setUpdateUserRequest(request);
		
		return response;
	}
}


