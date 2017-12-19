package com.spring.springboot.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.spring.springboot.domain.City;
import com.spring.springboot.dubbo.CityDubboService;

@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService{

	@Override
	public City findCityByName(String cityName) {
		return new City(1L,2L,"湖北","湖北是我家");
	}

}
