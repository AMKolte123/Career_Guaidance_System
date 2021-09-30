package com.app.daos;

import java.util.ArrayList;

import com.app.pojos.Company;
import com.app.pojos.PostedJob;

public interface CompanyDao {


	Company validateCompany(String em1, String pass1);
	String registerCompany(Company company);
	public Company getCompanyObj(int id);
	String postJob(PostedJob pj);
	ArrayList<PostedJob> getPastJobs(int id);
	PostedJob getJobObject(int jid);
	String updateJob(PostedJob j);
	String updateCompany(Company c);
	
}
