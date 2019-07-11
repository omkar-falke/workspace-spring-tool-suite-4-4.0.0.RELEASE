package com.cjc.main.serviceimpl;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeServiceI;
@Service
public class ServiceImpl  implements HomeServiceI
{
	@Autowired
	HomeRepository hr;

	@Override
	public int registerData(Student s)
	{
		hr.save(s);
		return 1;
	}

	@Override
	public List<Student> getData() {
		List<Student>list=(List<Student>) hr.findAll();
		return list;
	}

	@Override
	public void deleteData(int id) {
		hr.deleteById(id);
	}

	@Override
	public Student EditData(int id){
		Optional<Student> st=hr.findById(id);
		Student s=st.get();
		return s;
		
	}

	@Override
	public Student UpdateData(Student s) {
		// TODO Auto-generated method stub
		Student updata=hr.save(s);
		return updata;
	}

	@Override
	public List<Student> checkLogin(String username, String password) {
		List<Student>list=hr.findAllByUsernameAndPassword(username, password);
		return list;
	}


}
