package com.voyageOrganise.provide.converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.voyageOrganise.bean.Pays;
import com.voyageOrganise.provide.vo.PaysVo;
import com.voyageOrganise.service.util.ListUtil;
import com.voyageOrganise.service.util.StringUtil;

@Component
public class PaysConverter extends AbstractConverter<Pays,PaysVo>{
	

    private boolean villes;

    @Autowired
    private VilleConverter villeConverter;
	
	@Override
	public Pays toBean(PaysVo vo) {
		Pays pays=new Pays();
        
        if (StringUtil.isNotEmpty(vo.getId())){
            pays.setId(StringUtil.toLong(vo.getId()));
        }
        if (StringUtil.isNotEmpty(vo.getLibelle())){
	           pays.setLibelle(vo.getLibelle());
	     }
        
        if (villes  && ListUtil.isNotEmpty(vo.getVillesVo())){
            pays.setVilles(villeConverter.toBean(vo.getVillesVo()));
        }
        
       return pays;
	
	}
	@Override
	public PaysVo toVo(Pays bean) {
		
		  PaysVo paysVo=new PaysVo();
		  
	        if (StringUtil.isNotEmpty(bean.getLibelle())){
	        	paysVo.setLibelle(bean.getLibelle());
	        }
	        if (bean.getId()!=null){
	            paysVo.setId(StringUtil.toString(bean.getId()));
	        }
	        if (villes && ListUtil.isNotEmpty(bean.getVilles())){
	        	paysVo.setVillesVo(villeConverter.toVo(bean.getVilles()));
	        }
	        return paysVo;
	}
	
	
	public boolean isVilles() {
		return villes;
	}
	public void setVilles(boolean villes) {
		this.villes = villes;
	}
	
	
	
	
	

}
