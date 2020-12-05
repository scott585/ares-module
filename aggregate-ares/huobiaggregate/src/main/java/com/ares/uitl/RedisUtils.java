package com.ares.uitl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.ares.model.PriceModel;
import com.huobi.utils.SymbolUtils;

@Component
public class RedisUtils {
	
	@Autowired
	RedisTemplate<String,String> redis;
	
	public void setCach(String symbols,String market,String topic,double price,Long ts){
		List<String> symbolList = SymbolUtils.parseSymbols(symbols);	
		symbolList.stream().forEach(e->{
			if(topic.contains(e)) {
				redis.opsForHash().put(e,market, JSONObject.toJSONString(new PriceModel(market, e, price,ts)));
			}
		});
	}
	
	
	public Map<Object, Object> getCach(String symbol){
			return redis.opsForHash().entries(symbol);
	}
	
	
	public Object getCach(String symbol,String market){
		return redis.opsForHash().get(symbol, market);
	}
	
	public void setHisListCach(PriceModel priceModel) {
		redis.opsForList().leftPush("his:"+priceModel.getSymbol(), JSONObject.toJSONString(priceModel));
	}
	
	public List<JSONObject> getHisListCach(String symbol,Integer size) {
		return  getHisListCach(symbol, null, size);
	}


	public  List<JSONObject> getHisListCach(String symbol, String sn, int i) {
		// TODO Auto-generated method stub
		List<String> list = redis.opsForList().range("his:"+symbol, 0, i);
		List<JSONObject> priceModelList=new ArrayList<JSONObject>();
		for (String json : list) {
			JSONObject parseObject = JSONObject.parseObject(json);
			if(StringUtils.isNotBlank(sn)) {
				if(sn.equals(parseObject.getString("sn"))){
					priceModelList.add(parseObject);
				}
			}else {
				priceModelList.add(parseObject);
			}
		}
		return  priceModelList;
	}
	
}
