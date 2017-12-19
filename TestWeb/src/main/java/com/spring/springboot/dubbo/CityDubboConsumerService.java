package com.spring.springboot.dubbo;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.spring.springboot.domain.City;

@Component
public class CityDubboConsumerService {
	@Reference(version = "1.0.0")
	CityDubboService cityDubboService;
	
	 public CityDubboService getCityDubboService() {  
	        return cityDubboService;  
	    }  
	      
	    public void setCityDubboService(CityDubboService cityDubboService) {  
	        this.cityDubboService = cityDubboService;  
	    }  
	  
	  
	  
	    public void printCity() {  
	        String cityName = "湖北";  
	        if(cityDubboService == null){  
	            System.out.println("cityDubboService 服务对象 为空");  
	        }else{  
	            System.out.println("cityDubboService 服务对象 不 为空");  
	        }  
	        City city = cityDubboService.findCityByName(cityName);  
	        System.out.println(city.toString());  
	    }  
}
